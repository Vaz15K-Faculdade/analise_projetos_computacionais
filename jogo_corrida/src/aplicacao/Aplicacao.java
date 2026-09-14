/*
 * Principal.java
 */

package aplicacao;

import conceito.Jogo;
import visao.TelaJogo;

/**
 * Controla a execução da aplicacao.
 */
public class Aplicacao {

    public static void main(String[] args) {
        TelaJogo telaJogo = new TelaJogo();
        Jogo jogo = new Jogo();
        jogo.setVisaoJogo(telaJogo);
        telaJogo.setJogo(jogo);
        telaJogo.setVisible(true);
        jogo.novoJogo();
    }
}
