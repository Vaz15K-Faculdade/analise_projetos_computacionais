package arquivos;

/** Leaf (Folha): possui tamanho proprio e nao pode conter outros componentes. */
public class Arquivo implements ComponenteFileSystem {

    private final String nome;
    private final long tamanho;

    public Arquivo(String nome, long tamanho) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do arquivo e obrigatorio.");
        }
        if (tamanho < 0) {
            throw new IllegalArgumentException("O tamanho do arquivo nao pode ser negativo.");
        }
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public long getTamanho() {
        return tamanho;
    }

    @Override
    public void exibirEstrutura(String indentacao) {
        System.out.println(indentacao + "- " + nome + " (" + tamanho + " bytes)");
    }
}
