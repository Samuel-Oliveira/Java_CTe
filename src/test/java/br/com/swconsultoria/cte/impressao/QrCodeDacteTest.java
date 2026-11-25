package br.com.swconsultoria.cte.impressao;

import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Zona de silêncio do QR Code do DACTE (ISO/IEC 18004: 4 módulos) dentro da imagem, sem sobra de arredondamento.
 */
class QrCodeDacteTest {

    private static final String QR_NORMAL = "https://dfe-portal.svrs.rs.gov.br/cte/qrCode?chCTe="
            + "52261112345678000195570010000001231000001234&tpAmb=2";
    /** Contingência: o QR leva a assinatura, conteúdo longo e mais módulos. */
    private static final String QR_CONTINGENCIA = QR_NORMAL
            + "&sign=QUJDREVGR0hJSktMTU5PUFFSU1RVVldYWVphYmNkZWZnaGlqa2xtbm9wcXJzdHV2d3h5ejAxMjM0NTY3ODkrLw==";

    @Test
    void imagemTemExatamenteQuatroModulosDeMargemSemSobra() throws IOException {
        // 0: um pixel por módulo; 360: múltiplo exato de 41 + 4, onde a margem 2 caberia sem sobra; 400: o tamanho
        // usado pelo ImpressaoDacteUtil
        for (String conteudo : new String[]{QR_NORMAL, QR_CONTINGENCIA}) {
            for (int tamanho : new int[]{0, 100, 360, 400}) {
                BufferedImage imagem = ImageIO.read(new ByteArrayInputStream(ImagemDacteUtil.qrCode(conteudo, tamanho)));
                String caso = conteudo.length() + " caracteres em " + tamanho + " px";
                int[] caixa = caixaEscura(imagem);
                int modulo = moduloEmPixels(imagem, caixa);
                int modulos = (caixa[2] - caixa[0] + 1) / modulo;

                assertTrue(imagem.getWidth() >= tamanho, caso + ": pelo menos o tamanho pedido");
                assertEquals(imagem.getWidth(), imagem.getHeight(), caso);
                assertEquals((modulos + 8) * modulo, imagem.getWidth(), caso + ": código mais 8 módulos, sem sobra");
                assertEquals(4 * modulo, caixa[0], caso + ": margem esquerda");
                assertEquals(4 * modulo, caixa[1], caso + ": margem de cima");
                assertEquals(4 * modulo, imagem.getWidth() - 1 - caixa[2], caso + ": margem direita");
                assertEquals(4 * modulo, imagem.getHeight() - 1 - caixa[3], caso + ": margem de baixo");
            }
        }
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
