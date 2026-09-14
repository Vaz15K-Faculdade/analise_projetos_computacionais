package negocio;

public class Tabuleiro {

    private Jogador posicoes[][];

    public Tabuleiro() {
        this.posicoes = new Jogador[3][3];
    }

    public void atribuirJogadorPosicao(Jogador jogador, int linha, int coluna) {
        if (this.posicaoValida(linha, coluna)) {
            this.posicoes[linha - 1][coluna - 1] = jogador;
        }
    }

    public Jogador obterJogadorPosicao(int linha, int coluna) {
        if (this.posicaoValida(linha, coluna)) {
            return this.posicoes[linha - 1][coluna - 1];
        } else {
            return null;
        }
    }

    public boolean posicaoValida(int linha, int coluna) {
        if ((linha >= 1 && linha <= 3) && (coluna >= 1 && coluna <= 3)) {
            return true;
        } else {
            return false;
        }
    }

    public void limparTabuleiro() {
        for (int x = 0; x < this.posicoes.length; x++) {
            for (int y = 0; y < this.posicoes[x].length; y++) {
                this.posicoes[x][y] = null;
            }
        }
    }

    public int numeroCasasVazias() {
        int cont = 0;
        for (int x = 0; x < this.posicoes.length; x++) {
            for (int y = 0; y < this.posicoes[x].length; y++) {
                if (this.posicoes[x][y] == null) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public int numeroOcorrencialinha(Jogador jogador, int linha) {
        int numOcorrencia = 0;

        for (int x = 0; x < this.posicoes.length; x++) {
            if (this.posicoes[linha-1][x] != null && this.posicoes[linha-1][x] == jogador) {
                numOcorrencia++;
            }
        }
        return numOcorrencia;
    }

    public int numeroOcorrenciaColuna(Jogador jogador, int coluna) {
        int numOcorrencia = 0;

        for (int x = 0; x < this.posicoes.length; x++) {
            if (this.posicoes[x][coluna-1] != null && this.posicoes[x][coluna-1] == jogador) {
                numOcorrencia++;
            }
        }
        return numOcorrencia;
    }

    public int numeroOcorrenciaDiagonalPrincipal(Jogador jogador) {
        int numOcorrencia = 0;

        for (int x = 0; x < this.posicoes.length; x++) {
            if (this.posicoes[x][x] != null && this.posicoes[x][x] == jogador) {
                numOcorrencia++;
            }
        }
        return numOcorrencia;
    }

    public int numeroOcorrenciaDiagonalSecundaria(Jogador jogador) {
        int numOcorrencia = 0;

        for (int x = 0; x < this.posicoes.length; x++) {
            if (this.posicoes[2 - x][x] != null && this.posicoes[2 - x][x] == jogador) {
                numOcorrencia++;
            }
        }
        return numOcorrencia;
    }

    public String montarStringTabuleiro() {
        String resp = "";
        for (int x = 0; x < this.posicoes.length; x++) {
            for (int y = 0; y < this.posicoes[x].length; y++) {
                if (this.posicoes[x][y] == null) {
                    resp += "_";
                } else {
                    resp += this.posicoes[x][y].getSimbolo();
                }
                if (y == 2) {
                    resp += "\n";
                } else {
                    resp += " ";
                }
            }
        }
        return resp;
    }
}
