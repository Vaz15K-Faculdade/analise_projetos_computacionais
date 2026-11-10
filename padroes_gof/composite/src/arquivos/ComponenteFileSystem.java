package arquivos;

/** Component: contrato comum para arquivos e pastas. */
public interface ComponenteFileSystem {

    long getTamanho();

    void exibirEstrutura(String indentacao);
}
