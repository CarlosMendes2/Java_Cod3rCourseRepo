package G_Lambdas2;

public class CalculoTeste2 {
    public static void main(String[] args) {
        // Podemos criar métodos anonimos
        // métodos sem nome, e associar seu resultado a uma variável.

        Calculo calc = (double x,double y) -> {return x + y;};
        System.out.println(calc.executar(2,3));

        calc = (x,y) -> x*y; // o não uso as chaves está implicito que tem apenas 1 sentença e ela será o retorno.
        System.out.println(calc.executar(2,3));

        // Criamos interface com um único método
        // Criamos classes que implementam essa interface
        //


    }
}
