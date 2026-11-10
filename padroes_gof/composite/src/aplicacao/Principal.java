package aplicacao;

import arquivos.Arquivo;
import arquivos.ComponenteFileSystem;
import arquivos.Pasta;

public class Principal {

    public static void main(String[] args) {
        Arquivo contrato = new Arquivo("contrato.pdf", 1200);
        Arquivo foto = new Arquivo("foto.png", 3500);
        Arquivo anotacoes = new Arquivo("anotacoes.txt", 300);

        Pasta documentos = new Pasta("documentos");
        documentos.adicionar(contrato);
        documentos.adicionar(anotacoes);

        Pasta imagens = new Pasta("imagens");
        imagens.adicionar(foto);

        Pasta projetos = new Pasta("projetos");
        projetos.adicionar(new Arquivo("projeto.zip", 2000));
        documentos.adicionar(projetos);

        Pasta raiz = new Pasta("meus_arquivos");
        raiz.adicionar(documentos);
        raiz.adicionar(imagens);

        System.out.println("Estrutura completa:");
        raiz.exibirEstrutura("");

        System.out.println("\nArquivo e pasta tratados pelo mesmo contrato:");
        exibirTamanho(contrato);
        exibirTamanho(raiz);

        documentos.remover(anotacoes);
        System.out.println("\nEstrutura apos remover anotacoes.txt:");
        raiz.exibirEstrutura("");
    }

    private static void exibirTamanho(ComponenteFileSystem componente) {
        System.out.println("Tamanho: " + componente.getTamanho() + " bytes");
    }
}
