package conceito;

import visao.IVisaoJogo;

public class Jogo {

    private Dado dado;
    private IVisaoJogo tela;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador quemJoga;
    private Jogador vencedor;

    private Casa listaPosicoes[];

    public Jogo() {
        this.dado = new Dado();
    }

    public void novoJogo() {

        this.dado.lancar();
        this.jogador1 = new Jogador();
        this.jogador2 = new Jogador();
        this.quemJoga = null;
        this.vencedor = null;
        this.listaPosicoes = new Casa[32];

        this.jogador1.setNome(tela.lerNomeJogador1());
        this.jogador2.setNome(tela.lerNomeJogador2());

        for (int x = 0; x <= 31; x++) {  // da posicao 1 a 9
            this.listaPosicoes[x] = new Casa();
            this.listaPosicoes[x].setPosicao(x);
            this.listaPosicoes[x].setTipo(TipoCasa.COMUM);
        }

        //Lagada na posicao 0
        this.listaPosicoes[0].setTipo(TipoCasa.LARGADA);
        this.listaPosicoes[0].setJogador1(jogador1);
        this.listaPosicoes[0].setJogador2(jogador2);

        //Passa a vez na posicao 3
        this.listaPosicoes[3].setTipo(TipoCasa.PASSA);

        //Penaliza a vez na posicao 6
        this.listaPosicoes[6].setTipo(TipoCasa.PENALIZA);
        
        //Passa a vez na posicao 10
        this.listaPosicoes[10].setTipo(TipoCasa.PASSA);

        //Penaliza a vez na posicao 12
        this.listaPosicoes[12].setTipo(TipoCasa.PENALIZA);

        //Penaliza a vez na posicao 14
        this.listaPosicoes[14].setTipo(TipoCasa.PASSA);
        
        //Passa a vez na posicao 17
        this.listaPosicoes[17].setTipo(TipoCasa.PASSA);

        //Penaliza na posicao 20
        this.listaPosicoes[20].setTipo(TipoCasa.PENALIZA);

        //Penaliza a vez na posicao 22
        this.listaPosicoes[22].setTipo(TipoCasa.PASSA);
        
        //Passa a vez na posicao 27
        this.listaPosicoes[27].setTipo(TipoCasa.PASSA);

        //Penaliza na posicao 29
        this.listaPosicoes[29].setTipo(TipoCasa.PENALIZA);
        
        //Chegada na posicao 31
        this.listaPosicoes[31].setTipo(TipoCasa.CHEGADA);

        this.jogador1.setCasa(this.listaPosicoes[0]);
        this.jogador2.setCasa(this.listaPosicoes[0]);
        this.quemJoga = this.quemIniciaJogo();
        this.tela.atualizaTela();
    }

    public void jogar() {
        if (this.vencedor == null) {
            this.dado.lancar();
            this.processarLance(quemJoga, this.dado.ultimoLance());
            this.tela.atualizaTela();
        } else {
            tela.mensagem("Já existe vencedor - Jogo encerrado!!");
        }
    }

    private void processarLance(Jogador quemJogou, int valorLance) {
        //se quem jogou ainda esta na largada
        if (quemJogou.getCasa().getTipo() == TipoCasa.LARGADA) {
            if (valorLance <= 4) { //saiu da largada
                this.mudaPosicaoJogador(quemJogou, valorLance);
            } else { //passa a vez para o outro jagador
                this.quemJoga = this.passaVez(quemJogou);
            }
        } else {
            if (quemJogou.getCasa().getTipo() == TipoCasa.CHEGADA) { //chegou no fim
                this.vencedor = quemJogou;
            } else {
                this.mudaPosicaoJogador(quemJogou, valorLance);
                if (quemJogou.getCasa().getTipo() == TipoCasa.PASSA) {
                    this.quemJoga = this.passaVez(quemJogou);
                } else if (quemJogou.getCasa().getTipo() == TipoCasa.PENALIZA) {
                    this.tela.atualizaTela();
                    this.tela.mensagem("Jogador "+quemJogou.getNome()+" você foi penalizado!");
                    this.tela.mensagem("Será lançado o Dado para decidir quanto retornará");
                    this.mudaPosicaoJogador(quemJogou, -(this.dado.lancar()));
                    this.tela.mensagem("Você foi penalizado em "+this.dado.ultimoLance()+" posições");
                    this.quemJoga = this.passaVez(quemJogou);
                }
            }
        }
    }

    private void mudaPosicaoJogador(Jogador jogador, int valorLance) {
        int posicaoAtual = jogador.getCasa().getPosicao();
        int novaPosicao = posicaoAtual + valorLance;

        if (novaPosicao > 31) {
            novaPosicao = 31;
        }

        if (novaPosicao < 0) {
            novaPosicao = 0;
        }

        if (jogador == this.jogador1) {
            this.listaPosicoes[novaPosicao].setJogador1(jogador);
            this.listaPosicoes[posicaoAtual].setJogador1(null);
        } else {
            this.listaPosicoes[novaPosicao].setJogador2(jogador);
            this.listaPosicoes[posicaoAtual].setJogador2(null);
        }
        jogador.setCasa(this.listaPosicoes[novaPosicao]);
    }

    private Jogador passaVez(Jogador passou) {
        if (passou == this.jogador1) {
            return jogador2;
        } else {
            return jogador1;
        }
    }

    private Jogador quemIniciaJogo() {
        Jogador jogadorTemp = null;
        tela.mensagem("Será decido quem jogará primeiro através de lances de dados. \n Aquele que obtver o maior valor iniciará o jogo");
        int lance1, lance2;
        do {
            lance1 = dado.lancar();
            tela.mensagem("Jogador " + jogador1.getNome() + " você obteve: " + lance1);
            lance2 = dado.lancar();
            tela.mensagem("Jogador " + jogador2.getNome() + " você obteve: " + lance2);

            if (lance1 > lance2) {
                tela.mensagem("Jogador " + jogador1.getNome() + " você iniciará o jogo");
                jogadorTemp = this.jogador1;
            } else if (lance2 > lance1) {
                tela.mensagem("Jogador " + jogador2.getNome() + " você iniciará o jogo");
                jogadorTemp = this.jogador2;
            } else {
                tela.mensagem("Empate, será repetido o sorteio");
            }
        } while (lance1 == lance2);

        return jogadorTemp;
    }

    public void setVisaoJogo(IVisaoJogo tela) {
        this.tela = tela;
    }

    public int getFaceSorteada() {
        return dado.ultimoLance();
    }

    public String getNomeJogador1() {
        return jogador1.getNome();
    }

    public String getNomeJogador2() {
        return jogador2.getNome();
    }

    public String getNomeQuemJoga() {
        return quemJoga.getNome();
    }

    public String getNomeVencedor() {
        if (this.vencedor != null) {
            return vencedor.getNome();
        } else {
            return null;
        }
    }

    public int getPeoesCasa(int posicaoCasa) {
        int numPeoes = 0;
        if (this.listaPosicoes[posicaoCasa - 1].getJogador1() != null && this.listaPosicoes[posicaoCasa - 1].getJogador2() == null) {
            numPeoes = 1;
        } else if (this.listaPosicoes[posicaoCasa - 1].getJogador1() == null && this.listaPosicoes[posicaoCasa - 1].getJogador2() != null) {
            numPeoes = 2;
        } else if (this.listaPosicoes[posicaoCasa - 1].getJogador1() != null && this.listaPosicoes[posicaoCasa - 1].getJogador2() != null) {
            numPeoes = 3;
        }

        return numPeoes;
    }

}
