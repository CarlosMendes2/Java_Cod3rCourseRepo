package H_StreamAPI.Match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {
        Alunu a1 = new Alunu("Ana",7.1);
        Alunu a2 = new Alunu("Luna",6.1);
        Alunu a3 = new Alunu("Gui",8.1);
        Alunu a4 = new Alunu("Gabi",10);

        List<Alunu> alunos = Arrays.asList(a1,a2,a3,a4);
        Predicate<Alunu> aprovado = a -> a.nota >= 7.0;
        Predicate<Alunu> reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado));
    }
}


/*
*
 */