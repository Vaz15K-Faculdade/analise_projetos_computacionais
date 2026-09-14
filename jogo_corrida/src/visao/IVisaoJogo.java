package visao;

import conceito.Jogo;

public interface IVisaoJogo {

    void atualizaTela();

    String lerNomeJogador1();

    String lerNomeJogador2();

    void mensagem(String texto);

    void setJogo(Jogo jogo);

    void setNomeJogador1(String nome);

    void setNomeJogador2(String nome);

    void setNomeVencedor(String nome);

    void setQuemJoga(String nome);
    
}
