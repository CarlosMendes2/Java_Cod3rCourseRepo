package H_StreamAPI.MinMax;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {

        Alunu a1 = new Alunu("Ana",7.1);
        Alunu a2 = new Alunu("Luna",6.1);
        Alunu a3 = new Alunu("Gui",8.1);
        Alunu a4 = new Alunu("Gabi",10);

        List<Alunu> alunos = Arrays.asList(a1,a2,a3,a4);

        Comparator<Alunu> melhorNota = (aluno1,aluno2) ->{
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
        };


        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}
