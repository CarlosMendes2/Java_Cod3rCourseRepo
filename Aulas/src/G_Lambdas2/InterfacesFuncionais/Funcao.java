package G_Lambdas2.InterfacesFuncionais;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function <Integer,String> parOuImpar = entrada -> entrada % 2 == 0 ? "Par" : "Ímpar";


        Function<String,String> oResultado =  valor -> "O resultado é "+valor;

        Function<String, String> empolgado = valor -> valor + "!!!";

        String resultadoFinal = parOuImpar.andThen(oResultado).andThen(empolgado).apply(24);

        System.out.println(resultadoFinal);
        System.out.println(parOuImpar.apply(24));

    }

}
