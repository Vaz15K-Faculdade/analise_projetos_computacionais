package colecao;
import java.util.ArrayList;
import java.util.Iterator;

import model.Aluno;
import utils.ComparaNome;

import java.util.Collections;

public class ColecaoAluno implements IColecaoGenerica {

    ArrayList listaAluno;

    public ColecaoAluno() {
        listaAluno = new ArrayList();
    }

    public void adicionaAluno(Aluno aluno) {
        listaAluno.add(aluno);
    }

    public Iterator getIterator() {
        return listaAluno.iterator();
    }

    public void ordena() {
        Collections.sort(listaAluno, new ComparaNome());
    }
}
