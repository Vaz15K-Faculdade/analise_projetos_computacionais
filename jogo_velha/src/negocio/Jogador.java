package negocio;

public class Jogador {

    private String nome;
    private String simbolo;

    public Jogador() {
    }

    public Jogador(String nome, String simbolo) throws Exception {
        this.setNome(nome);
        this.setSimbolo(simbolo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.length() > 3) {
            this.nome = nome;
        }else{
            throw new Exception("Nome inválido");
        }
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) throws Exception {
        if (simbolo.equals("X") || simbolo.equals("O")) {
            this.simbolo = simbolo;
        }else{
            throw new Exception("Símbolo inválido");
        }
    }
}
