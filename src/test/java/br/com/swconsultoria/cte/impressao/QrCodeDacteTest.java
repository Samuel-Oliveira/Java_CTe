package br.com.swconsultoria.cte.impressao;

import br.com.swconsultoria.cte.exception.DacteException;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Zona de silêncio do QR Code do DACTE dentro da imagem, sem sobra de arredondamento: 4 módulos no mínimo
 * (ISO/IEC 18004) e as duas margens somando 10% do lado ou mais (margem segura do MOC).
 */
class QrCodeDacteTest {

    private static final String QR_NORMAL = "https://dfe-portal.svrs.rs.gov.br/cte/qrCode?chCTe="
            + "52261112345678000195570010000001231000001234&tpAmb=2";
    /** Contingência: o sign é SHA1withRSA em Base64; com chave RSA de 2048 bits, 256 bytes e 344 caracteres. */
    private static final String QR_CONTINGENCIA = QR_NORMAL + "&sign=" + Base64.getEncoder().encodeToString(bytes(256));

    @Test
    void margemDentroDaImagemSemSobra() throws IOException {
        // 0: um pixel por módulo; 360: múltiplo exato de 41 + 4, onde a margem 2 caberia sem sobra; 400: o tamanho
        // usado pelo ImpressaoDacteUtil
        for (String conteudo : new String[]{QR_NORMAL, QR_CONTINGENCIA}) {
            for (int tamanho : new int[]{0, 100, 360, 400}) {
                BufferedImage imagem = ImageIO.read(new ByteArrayInputStream(ImagemDacteUtil.qrCode(conteudo, tamanho)));
                String caso = conteudo.length() + " caracteres em " + tamanho + " px";
                int[] caixa = caixaEscura(imagem);
                int modulo = moduloEmPixels(imagem, caixa);
                int modulos = (caixa[2] - caixa[0] + 1) / modulo;
                int margem = caixa[0] / modulo;

                assertTrue(imagem.getWidth() >= tamanho, caso + ": pelo menos o tamanho pedido");
                assertEquals(imagem.getWidth(), imagem.getHeight(), caso);
                assertEquals((modulos + 2 * margem) * modulo, imagem.getWidth(), caso + ": código mais as margens, sem sobra");
                assertEquals(margem * modulo, caixa[1], caso + ": margem de cima igual à esquerda");
                assertEquals(margem * modulo, imagem.getWidth() - 1 - caixa[2], caso + ": margem direita");
                assertEquals(margem * modulo, imagem.getHeight() - 1 - caixa[3], caso + ": margem de baixo");
                assertTrue(margem >= 4, caso + ": zona de silêncio de " + margem + " módulos (ISO/IEC 18004)");
                assertTrue(2.0 * margem / (modulos + 2 * margem) >= 0.10, caso + ": margem segura de 10% do lado");
                assertEquals(Math.max(4, (int) Math.ceil(modulos / 18.0)), margem, caso + ": sem margem a mais que o necessário");
            }
        }
    }

    @Test
    void contingenciaComAssinaturaRealPedeMaisQueQuatroModulos() throws IOException {
        BufferedImage imagem = ImageIO.read(new ByteArrayInputStream(ImagemDacteUtil.qrCode(QR_CONTINGENCIA, 400)));
        int[] caixa = caixaEscura(imagem);
        int modulo = moduloEmPixels(imagem, caixa);
        int modulos = (caixa[2] - caixa[0] + 1) / modulo;

        assertTrue(modulos > 72, "o sign de 344 caracteres leva o código além de 72 módulos: " + modulos);
        assertTrue(caixa[0] / modulo > 4, "com 4 módulos a margem ficaria abaixo de 10% do lado");
    }

    @Test
    void tamanhoNegativoEhRecusado() {
        assertThrows(DacteException.class, () -> ImagemDacteUtil.qrCode(QR_NORMAL, -1));
    }

    private static byte[] bytes(int quantidade) {
        byte[] bytes = new byte[quantidade];
        for (int i = 0; i < quantidade; i++) {
            bytes[i] = (byte) (i * 37 + 11);
        }
        return bytes;
    }

    /** minX, minY, maxX e maxY dos pixels escuros. */
    private static int[] caixaEscura(BufferedImage imagem) {
        int[] caixa = {imagem.getWidth(), imagem.getHeight(), -1, -1};
        for (int y = 0; y < imagem.getHeight(); y++) {
            for (int x = 0; x < imagem.getWidth(); x++) {
                if (escuro(imagem, x, y)) {
                    caixa[0] = Math.min(caixa[0], x);
                    caixa[1] = Math.min(caixa[1], y);
                    caixa[2] = Math.max(caixa[2], x);
                    caixa[3] = Math.max(caixa[3], y);
                }
            }
        }
        assertTrue(caixa[2] >= 0, "imagem sem QR Code");
        return caixa;
    }

    /** A primeira linha do padrão de posição do canto superior esquerdo tem 7 módulos escuros seguidos. */
    private static int moduloEmPixels(BufferedImage imagem, int[] caixa) {
        int linha = 0;
        while (caixa[0] + linha < imagem.getWidth() && escuro(imagem, caixa[0] + linha, caixa[1])) {
            linha++;
        }
        assertEquals(0, linha % 7, "padrão de posição com 7 módulos de pixels inteiros");
        return linha / 7;
    }

    private static boolean escuro(BufferedImage imagem, int x, int y) {
        return (imagem.getRGB(x, y) & 0xFF) < 128;
    }
}
