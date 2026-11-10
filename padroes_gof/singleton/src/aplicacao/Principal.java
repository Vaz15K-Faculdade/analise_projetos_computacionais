package aplicacao;

import configuracao.ConfiguracaoSistema;

public class Principal {

    public static void main(String[] args) {
        ConfiguracaoSistema inicial = ConfiguracaoSistema.getInstance();
        String[] modulos = {"Autenticacao", "Relatorios", "Pagamentos"};

        for (String modulo : modulos) {
            ConfiguracaoSistema configuracao = ConfiguracaoSistema.getInstance();
            System.out.println("\nModulo: " + modulo);
            System.out.println("Identidade da instancia: " + System.identityHashCode(configuracao));
            System.out.println("Mesma instancia inicial: " + (inicial == configuracao));
            System.out.println("URL do banco: " + configuracao.getUrlBancoDados());
            System.out.println("Timeout: " + configuracao.getTimeout() + " segundos");
        }
    }
}
