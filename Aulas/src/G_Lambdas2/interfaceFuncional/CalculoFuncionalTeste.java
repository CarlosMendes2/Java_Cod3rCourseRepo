package G_Lambdas2.interfaceFuncional;

public class CalculoFuncionalTeste {
    public static void main(String[] args) {

        Calculo cal = (x,y)-> x + y ;
        System.out.println(cal.executar(5,5));
        System.out.println(cal.legal());
        System.out.println(Calculo.massa());
    }
}
