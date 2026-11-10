package configuracao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public final class ConfiguracaoSistema {

    // A inicializacao estatica do Java garante uma unica instancia, inclusive entre threads.
    private static final ConfiguracaoSistema INSTANCIA = new ConfiguracaoSistema();

    private final String urlBancoDados;
    private final String chaveApi;
    private final int timeout;

    private ConfiguracaoSistema() {
        Map<String, String> configuracoes = carregarConfiguracoes();
        this.urlBancoDados = obterObrigatoria(configuracoes, "urlBancoDados");
        this.chaveApi = obterObrigatoria(configuracoes, "chaveApi");
        this.timeout = Integer.parseInt(obterObrigatoria(configuracoes, "timeout"));

        if (this.timeout <= 0) {
            throw new IllegalStateException("O timeout deve ser maior que zero.");
        }

        System.out.println("Arquivo configuracao.yaml carregado uma unica vez.");
    }

    public static ConfiguracaoSistema getInstance() {
        return INSTANCIA;
    }

    public String getUrlBancoDados() {
        return urlBancoDados;
    }

    public String getChaveApi() {
        return chaveApi;
    }

    public int getTimeout() {
        return timeout;
    }

    private Map<String, String> carregarConfiguracoes() {
        InputStream arquivo = ConfiguracaoSistema.class.getResourceAsStream("/configuracao.yaml");
        if (arquivo == null) {
            throw new IllegalStateException("Arquivo configuracao.yaml nao encontrado no classpath.");
        }

        Map<String, String> configuracoes = new HashMap<>();
        // Leitor restrito ao YAML usado neste exemplo: chave: valor, sem aspas ou aninhamento.
        try (BufferedReader leitor = new BufferedReader(
                new InputStreamReader(arquivo, StandardCharsets.UTF_8))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                linha = linha.trim();
                if (linha.isEmpty() || linha.startsWith("#")) {
                    continue;
                }

                String[] partes = linha.split(":", 2);
                if (partes.length != 2 || partes[0].trim().isEmpty()) {
                    throw new IllegalStateException("Configuracao invalida: " + linha);
                }

                String chave = partes[0].trim();
                if (configuracoes.putIfAbsent(chave, partes[1].trim()) != null) {
                    throw new IllegalStateException("Configuracao duplicada: " + chave);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Nao foi possivel ler as configuracoes.", e);
        }
        return configuracoes;
    }

    private String obterObrigatoria(Map<String, String> configuracoes, String chave) {
        String valor = configuracoes.get(chave);
        if (valor == null || valor.isEmpty()) {
            throw new IllegalStateException("Configuracao obrigatoria ausente: " + chave);
        }
        return valor;
    }
}
