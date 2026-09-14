package conceito;

/**
 *
 * @author Evandro
 */
public class Casa {
    private Jogador jogador1;
    private Jogador jogador2;
    private int posicao;
    private TipoCasa tipo;

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public TipoCasa getTipo() {
        return tipo;
    }

    public void setTipo(TipoCasa tipo) {
        this.tipo = tipo;
    }
}
