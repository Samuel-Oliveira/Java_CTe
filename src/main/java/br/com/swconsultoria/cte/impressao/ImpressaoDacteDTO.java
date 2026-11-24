package br.com.swconsultoria.cte.impressao;

import br.com.swconsultoria.cte.exception.DacteException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Model responsavel por armazenar as informações da impressão do DACTE (Thymeleaf).
 * A fonte de dados é sempre o XML. Obtenha o padrão com {@link ImpressaoDacteUtil#impressaoPadraoCTe(String)}.
 * <p>
 * Customizações:
 * <ul>
 *     <li>logo: {@link #setLogo(InputStream)} / {@link #setLogo(byte[])} / {@link #setLogoArquivo(String)};
 *     {@link #removerLogo()} imprime sem logo (setLogo(null) não compila por causa das sobrecargas)</li>
 *     <li>template: caminho de um arquivo .html Thymeleaf próprio no lugar do padrão</li>
 *     <li>parametros: valores livres disponíveis no template como ${parametros.nome}</li>
 *     <li>exibirCanhoto: imprime o canhoto (recibo) no topo da primeira folha</li>
 * </ul>
 */
public class ImpressaoDacteDTO {

    private String xml;
    private byte[] logo;
    private String template;
    private boolean exibirCanhoto = true;
    private Map<String, Object> parametros;

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    /**
     * Lê e fecha o InputStream informado.
     */
    public void setLogo(InputStream logo) {
        if (logo == null) {
            this.logo = null;
            return;
        }
        try (InputStream in = logo; ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[8192];
            int lidos;
            while ((lidos = in.read(buffer)) != -1) {
                out.write(buffer, 0, lidos);
            }
            this.logo = out.toByteArray();
        } catch (IOException e) {
            throw new DacteException("Erro ao ler logo", e);
        }
    }

    /**
     * Lê o logo de um arquivo (PNG, JPEG, GIF ou BMP). Caminho nulo/vazio remove o logo.
     */
    public void setLogoArquivo(String caminho) {
        if (caminho == null || caminho.trim().isEmpty()) {
            this.logo = null;
            return;
        }
        try {
            this.logo = Files.readAllBytes(Paths.get(caminho));
        } catch (IOException | InvalidPathException e) {
            throw new DacteException("Erro ao ler logo " + caminho, e);
        }
    }

    /**
     * Imprime o DACTE sem logo no quadro do emitente.
     */
    public void removerLogo() {
        this.logo = null;
    }

    public String getTemplate() {
        return template;
    }

    /**
     * Caminho de um template Thymeleaf próprio, terminado em .html, .htm ou .xhtml (sem extensão o nome só é
     * procurado no classpath, entre os padrões). Null usa o template padrão
     * ({@link ImpressaoDacteUtil#TEMPLATE_PADRAO}).
     * O template pode reaproveitar os fragmentos padrão: th:replace="~{fragmentos :: campo(...)}"
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    public boolean isExibirCanhoto() {
        return exibirCanhoto;
    }

    /**
     * Canhoto (recibo de entrega) no topo da primeira folha; padrão true.
     */
    public void setExibirCanhoto(boolean exibirCanhoto) {
        this.exibirCanhoto = exibirCanhoto;
    }

    public Map<String, Object> getParametros() {
        if (this.parametros == null) {
            this.parametros = new HashMap<>();
        }
        return parametros;
    }
}
