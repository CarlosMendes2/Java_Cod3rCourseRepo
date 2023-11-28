package F_OO.ComposicaoMultiMulti;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    final String nome;
    final List<Aluno> classe = new ArrayList<>();

    Disciplina(String nome){
        this.nome = nome;
    }

    void adicionarAluno (Aluno aluno){
        this.classe.add(aluno);
        aluno.disciplinas.add(this);
    }
}