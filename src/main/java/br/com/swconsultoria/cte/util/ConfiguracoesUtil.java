package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.certificado.CertificadoService;
import br.com.swconsultoria.certificado.exception.CertificadoException;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;

/**
 * Classe Responsavel Por Carregar as informações do Certificado Digital
 *
 * @author Samuel Oliveira
 */
public class ConfiguracoesUtil {

    private ConfiguracoesUtil() {}

    /**
     * Recebe como parâmetro um objeto ConfiguracoesCte e Inicializa as COnfigurações e retorna um objeto
     * ConfiguracoesCte.
     *
     * <p>
     * Semelhante ao método iniciaConfiguracoes(), o Certificado Digital será
     * validado e inicializado.Caso ocorrá algum prolema será disparado um
     * CteException
     * </p>
     *
     * @param configuracoesCte
     * @return ConfiguracoesCte
     * @throws CteException
     * @see CertificadoException
     */
    public static ConfiguracoesCte iniciaConfiguracoes(ConfiguracoesCte configuracoesCte) throws CteException {

        return iniciaConfiguracoes(configuracoesCte, null);
    }

    /**
     * Recebe como parâmetro um objeto ConfiguracoesCte e Inicializa as COnfigurações e retorna um objeto
     * ConfiguracoesCte.
     *
     * <p>
     * Semelhante ao método iniciaConfiguracoes(), o Certificado Digital será
     * validado e inicializado.Caso ocorrá algum prolema será disparado um
     * CteException
     * </p>
     *
     * @param configuracoesCte
     * @param cpfCnpj
     * @return ConfiguracoesCte
     * @throws CteException
     * @see CertificadoException
     * @see ConfiguracoesCte
     */
    public static ConfiguracoesCte iniciaConfiguracoes(ConfiguracoesCte configuracoesCte, String cpfCnpj) throws CteException {

        try {
            if (!ObjetoCTeUtil.verifica(configuracoesCte)
                    .orElseThrow(() -> new CteException("Configurações não foram criadas"))
                    .getCertificado().isValido()) {
                throw new CertificadoException("Certificado vencido ou inválido.");
            }

            if (configuracoesCte.isValidacaoDocumento() && cpfCnpj != null && !configuracoesCte.getCertificado().getCnpjCpf().substring(0, 8).equals(cpfCnpj.substring(0, 8))) {
                throw new CertificadoException("Documento do Certificado(" + configuracoesCte.getCertificado().getCnpjCpf() + ") não equivale ao Documento do Emissor(" + cpfCnpj + ")");
            }

            if (ObjetoCTeUtil.verifica(configuracoesCte.getCacert()).isPresent()) {
                CertificadoService.inicializaCertificado(configuracoesCte.getCertificado(), configuracoesCte.getCacert());
            } else {
                CertificadoService.inicializaCertificado(configuracoesCte.getCertificado());
            }

        } catch (CertificadoException e) {
            throw new CteException(e);
        }

        return configuracoesCte;
    }

}