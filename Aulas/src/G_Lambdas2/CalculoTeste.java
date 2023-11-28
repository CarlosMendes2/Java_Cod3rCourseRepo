package G_Lambdas2;

public class CalculoTeste {
    public static void main(String[] args) {

        Calculo calculo = new Soma();
        System.out.println(calculo.executar(2,3));
        calculo = new Multiplicar();
        System.out.println(calculo.executar(2,3));

        // Acima podemos ver o polimorfismo acontecendo.
        // Essa maneira é a forma mais trabalhosa de fazer.
    }
}
