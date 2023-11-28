package G_Lambdas;

public class CalculoTeste {
    public static void main(String[] args) {
        Calculo soma = new Soma();
        Calculo multi = new Multiplica();

        System.out.println(soma.executar(5,3));
        System.out.println(multi.executar(5,3));
    }
}
