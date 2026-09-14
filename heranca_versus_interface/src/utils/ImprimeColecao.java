package utils;
import java.util.Iterator;

import colecao.IColecaoGenerica;
public class ImprimeColecao {

    Iterator colecao;

    public ImprimeColecao(IColecaoGenerica colecaoGenerica) {
        this.colecao = colecaoGenerica.getIterator();
    }

    public void imprimir() {
        int x = 0;
        System.out.print("\n\n");
        while (colecao.hasNext()) {
            IPossuiNome objeto = (IPossuiNome) colecao.next();
            System.out.println((++x) + " - " + objeto.getNome());
        }
        System.out.print("\n\n");
    }
}
