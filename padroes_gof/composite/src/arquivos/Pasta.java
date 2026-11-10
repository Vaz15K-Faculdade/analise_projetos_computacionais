package arquivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Composite (Composto): agrega componentes e calcula seu tamanho recursivamente. */
public class Pasta implements ComponenteFileSystem {

    private final String nome;
    private final List<ComponenteFileSystem> componentes = new ArrayList<>();

    public Pasta(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da pasta e obrigatorio.");
        }
        this.nome = nome;
    }

    public void adicionar(ComponenteFileSystem componente) {
        Objects.requireNonNull(componente, "O componente e obrigatorio.");
        if (componente == this) {
            throw new IllegalArgumentException("Uma pasta nao pode conter a si mesma.");
        }
        componentes.add(componente);
    }

    public void remover(ComponenteFileSystem componente) {
        componentes.remove(componente);
    }

    @Override
    public long getTamanho() {
        long tamanhoTotal = 0;
        for (ComponenteFileSystem componente : componentes) {
            tamanhoTotal += componente.getTamanho();
        }
        return tamanhoTotal;
    }

    @Override
    public void exibirEstrutura(String indentacao) {
        System.out.println(indentacao + "+ " + nome + "/ (" + getTamanho() + " bytes)");
        for (ComponenteFileSystem componente : componentes) {
            componente.exibirEstrutura(indentacao + "    ");
        }
    }
}
