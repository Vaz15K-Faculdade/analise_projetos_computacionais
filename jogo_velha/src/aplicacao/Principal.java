package aplicacao;

import javax.swing.JOptionPane;
import negocio.Jogo;

public class Principal {

    public static void main(String[] args) {

        Jogo jogo = new Jogo();
        String retornoJogada;
        boolean dadosValidos;

        jogo.novoJogo();
        do {
            try {
                String nome1 = JOptionPane.showInputDialog("Forneça o nome do primeiro jogador");
                String nome2 = JOptionPane.showInputDialog("Forneça o nome do segundo jogador");
                jogo.iniciarDadosJogador1(nome1);
                jogo.iniciarDadosJogador2(nome2);
                dadosValidos = true;
            } catch (Exception e) {
                dadosValidos = false;
                System.err.println(e.getMessage());
            }
        } while (!dadosValidos);

        System.out.println(jogo.mostraSituacaoJogo());

        int l = 0;
        int c = 0;

        do {
            try {
                l = Integer.parseInt(JOptionPane.showInputDialog("Jogador: " + jogo.quemJoga() + " forneça a linha que irá jogar [1..3]"));
                c = Integer.parseInt(JOptionPane.showInputDialog("Jogador: " + jogo.quemJoga() + " forneça a coluna que irá jogar [1..3]"));
                retornoJogada = jogo.jogar(l, c);
                JOptionPane.showMessageDialog(null, retornoJogada);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Valores inconsistentes para as coordenadas");
            }
            System.out.println(jogo.mostraSituacaoJogo());
        } while (!jogo.terminou());

        if (jogo.temVencedor()) {
            JOptionPane.showMessageDialog(null, "O vencedor é o jogador: " + jogo.vencedor());
        } else {
            JOptionPane.showMessageDialog(null, "O jogo terminou empatado");
        }
        System.exit(0);
    }
}
