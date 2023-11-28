package G_Lambdas2.InterfacesFuncionais;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {
        // Dois parametros e retorno do mesmo tipo
        BinaryOperator<Double> media = (n1,n2)-> (n1+n2)/2;
        System.out.println(media.apply(10.0,9.8));

        // Dois parametros e um retorno, cada um dos três pode ser de um tipo diferente
        // Seguindo as BPP da ProgFunc, não é legal a função acumular 2 tarefas
        BiFunction<Double,Double,String> resultado = (n1,n2) -> ((n1+n2)/2) >= 7? "Aprovado":"Reprovado";
        System.out.println(resultado.apply(10.0,9.8));

        // Composição de função
        Function<Double,String> conceito = m -> m>=7?"Aprovado":"Reprovado";
        System.out.println(media.andThen(conceito).apply(10.0,9.8));

    }

}
