package F_OO.ComposicaoMultiMulti;
 // Relação tio e sobrinho
// Um tio pode ter vários sobrinhos e 1 sobrinho pode ter vários tios

import java.util.List;
import java.util.ArrayList;

//  Relação aluno e disciplina
//  1 aluno tem várias disciplinas e 1 disciplina tem vários alunos

// Uma lista constante, mantém apenas o endereço de memória constante
// Isto é, posso alterar os elementos contidos nela, posso utilizar os .metodos();
// o que não posso é, fazer a lista apontar para outro local na memoria, como
// disciplina = new ArrayList<Disciplina>();
public class Aluno {
    final String nome;
    final List<Disciplina> disciplinas = new ArrayList<>();

    Aluno(final String nome){
        this.nome = nome;
    }
    void adicionarDisciplina (Disciplina disciplina){
        this.disciplinas.add(disciplina);
        disciplina.classe.add(this);
    }

    Disciplina getDisciplinaByName(String nome){
        for(Disciplina disc: this.disciplinas){
                if (disc.nome.equalsIgnoreCase(nome)){
                    return disc;
                }
        }
        return  null;
    }

    public String toString(){
        return nome;
    }
}
