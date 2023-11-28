package G_Lambdas;

public class CalculoTeste2 {
    // Podemos criar metodos anonimas, sem nome e o resultado associar a uma variavel
    public static void main(String[] args) {

        // Método anônimo
        // O java entende que esse lambda abaixo esta associado ao único método da classe
        // Calculo que possui a mesma assinatura.

        Calculo soma = (x,y) -> {return x + y;};

        // outra forma de declarar uma lambda, quando omitimos o corpo da função
        // fica subtendido para o java que temos apenas 1 sentença de código na função
        // e seu resultado será retornado da função.
        soma = (x,y) -> x * y;
        System.out.println(soma.executar(99,9));

    }

}

// Aula 3. Interfaces funcionais