package G_Lambdas2.interfaceFuncional;

import java.util.function.BinaryOperator;

public class CalculoFuncionalTeste2 {
    public static void main(String[] args) {

        BinaryOperator<Double> cal = (x, y)-> x + y ;
        System.out.println(cal.apply(2.0,3.0));
        cal = (x, y)-> x * y ;
        System.out.println(cal.apply(2.0,3.0));
        // ----
        BinaryOperator<Integer> cal2 = (x, y)-> x + y ;
        System.out.println(cal2.apply(2,3));
        cal = (x, y)-> x * y ;
        System.out.println(cal2.apply(2,3));
    }
}


// O java não converter um número literal inteiro primitivo para um Wrapper Double
// Apenas é possível ir de um int para um Interger ou de um double para Double.