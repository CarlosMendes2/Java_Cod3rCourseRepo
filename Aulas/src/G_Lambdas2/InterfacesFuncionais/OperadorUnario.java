package G_Lambdas2.InterfacesFuncionais;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        // Tipo de entrada é o mesmo de saida.
        // É bom para composição pois trabalha com o mesmo tipo.
        // Funções específicas tem um potencial de reuso muito grande.

        UnaryOperator<Integer> maisDois = num -> num + 2;
        UnaryOperator<Integer> vezesDois = num -> num * 2;
        UnaryOperator<Integer> aoQuadrado = num -> num * num;
        //                    #2             #3                #4               #1
        System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0));
        //                    #4              #3                  #2            #1
        System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(0));

    }

}
