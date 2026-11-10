package modelo;

public class DadosCliente {

    private final String nome;
    private final String email;

    public DadosCliente(String nome, String email) {
        if (nome == null || nome.trim().isEmpty() || email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome e o e-mail do cliente sao obrigatorios.");
        }
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
