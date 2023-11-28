package F_OO.ComposicaoMultiMulti;

public class Universidade {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno("Alice");
        Aluno aluno02 = new Aluno("Roberta");
        Aluno aluno03 = new Aluno("Morgana");

        Disciplina disciplina01 = new Disciplina("Introdução a Programação");
        Disciplina disciplina02 = new Disciplina("Introdução ao Computador");
        Disciplina disciplina03 = new Disciplina("Administração");

        //aluno01.adicionarDisciplina(disciplina03);
        aluno01.adicionarDisciplina(disciplina01);
        aluno01.adicionarDisciplina(disciplina02);

        disciplina01.adicionarAluno(aluno02);
        disciplina01.adicionarAluno(aluno03);

        disciplina03.adicionarAluno(aluno03);

        aluno03.adicionarDisciplina(disciplina02);

        aluno02.adicionarDisciplina(disciplina02);
        aluno02.adicionarDisciplina(disciplina03);

        for(Aluno aluno: disciplina01.classe){
            System.out.println("Estou matriculado em Introd. a Programação");
            System.out.printf("E meu nome é %s \n",aluno.nome);
            System.out.println("--");
        }


        // aluno 1 → disciplinas → IntrodProgr → classe
        //System.out.println(aluno01.disciplinas.get(0).classe);

        Disciplina buscaCurso = aluno02.getDisciplinaByName("Administração");

        if (buscaCurso != null){
            System.out.printf("Curso: %s foi encontrado\n",buscaCurso.nome);
            System.out.println(buscaCurso.classe);
        }
    }
}
