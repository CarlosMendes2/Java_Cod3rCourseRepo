package H_StreamAPI.Filter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana",7);
        Aluno a2 = new Aluno("Bia",5.8);
        Aluno a3 = new Aluno("Daniel",9.8);
        Aluno a4 = new Aluno("Gui",6.8);
        Aluno a5 = new Aluno("Rebeca",7.1);
        Aluno a6 = new Aluno("Pedro",8.8);

        List<Aluno> aprovados = new ArrayList<>();
        List<Aluno> reprovados = new ArrayList<>();

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
        Function<Aluno,String> mensagemAprovado = a -> "Parabéns "+ a.nome + "! Você foi aprovado!!";
        Predicate<Aluno> aprovado = n -> n.nota >= 7;
        Predicate<Aluno> reprovado = n -> n.nota < 7;

        alunos.stream().filter(aprovado).map(mensagemAprovado).forEach(System.out::println);
        alunos.stream().filter(aprovado).forEach(aprovados::add);
        alunos.stream().filter(reprovado).forEach(reprovados::add);


        System.out.println("Aprovados:");
        aprovados.stream().map(aluno -> aluno.nome).forEach(System.out::println);
        System.out.println("Reprovados");
        reprovados.stream().map(a -> a.nome).forEach(System.out::println);
    }
}


// Filter #01
/* [Filter.pdf]
* Filter -> Predicate
*
*
*
 */