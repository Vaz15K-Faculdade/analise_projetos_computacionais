package negocio;

public class Jogo {

    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador quemJoga;
    private Jogador quemJogou;
    private Jogador vencedor;
    private boolean terminou;

    public Jogo() {
        this.tabuleiro = new Tabuleiro();
        this.jogador1 = new Jogador();
        this.jogador2 = new Jogador();
    }

    public void novoJogo() {
        this.tabuleiro.limparTabuleiro();
        this.quemJoga = this.jogador1;
        this.vencedor = null;
        this.terminou = false;
    }

    public String jogar(int linha, int coluna) {
        String retorno = "";
        boolean jogadaValida;

        if (this.vencedor == null) {
            if (this.tabuleiro.numeroCasasVazias() > 0) {
                jogadaValida = false;
                if (this.tabuleiro.posicaoValida(linha, coluna)) {
                    if (this.tabuleiro.obterJogadorPosicao(linha, coluna) == null) {
                        jogadaValida = true;
                    } else {
                        retorno = "Posição já ocupada!!";
                    }
                } else {
                    retorno = "Posição inválida para o Jogo da Velha";
                }
                if (jogadaValida) {
                    this.tabuleiro.atribuirJogadorPosicao(quemJoga, linha, coluna);

                    if (this.verificarVencedor(quemJoga)) {
                        vencedor = quemJoga;
                        this.terminou = true;
                    } else if (this.tabuleiro.numeroCasasVazias() == 0) {
                        this.terminou = true;
                    }

                    if (quemJoga == jogador1) {
                        quemJogou = jogador1;
                        quemJoga = jogador2;
                    } else {
                        quemJoga = jogador1;
                        quemJogou = jogador2;
                    }
                    retorno = "Jogada processada com sucesso!!";
                }

            } else {
                retorno = "O jogo já foi encerrado, reinicie o jogo";
            }
        } else {
            retorno = "Já existe um vencedor, reinicie o jogo";
        }

        return retorno;
    }

    public void iniciarDadosJogador1(String nome) throws Exception {
        this.jogador1.setNome(nome);
        this.jogador1.setSimbolo("X");
    }

    public void iniciarDadosJogador2(String nome) throws Exception {
        this.jogador2.setNome(nome);
        this.jogador2.setSimbolo("O");
    }

    public String quemJoga() {
        return this.quemJoga.getNome();
    }

    public String quemJogou() {
        return this.quemJogou.getNome();
    }

    public boolean temVencedor() {
        return this.vencedor != null;
    }

    public boolean terminou() {
        return this.terminou;
    }

    public String vencedor() {
        return this.vencedor.getNome();
    }

    private boolean verificarVencedor(Jogador jogador) {
        boolean vencedorTemp;

        int x = 1;
        vencedorTemp = false;
        do {
            if (this.tabuleiro.numeroOcorrencialinha(jogador, x) == 3) {
                vencedorTemp = true;
            }
            if (this.tabuleiro.numeroOcorrenciaColuna(jogador, x) == 3) {
                vencedorTemp = true;
            }
            x++;
        } while (!vencedorTemp && x <= 3);

        if (this.tabuleiro.numeroOcorrenciaDiagonalPrincipal(jogador) == 3) {
            vencedorTemp = true;
        }

        if (this.tabuleiro.numeroOcorrenciaDiagonalSecundaria(jogador) == 3) {
            vencedorTemp = true;
        }

        return vencedorTemp;
    }

    public String mostraSituacaoJogo() {
        String resp = "";
        if (this.quemJogou != null) {
            resp += "Quem jogou foi: " + quemJogou.getNome();
        } else {
            resp += "Não houve jogada";
        }
        resp += "\n--------------------------------------------\n";
        resp += this.tabuleiro.montarStringTabuleiro();
        resp += "\n--------------------------------------------\n";
        return resp;
    }
}
