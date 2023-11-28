package G_Lambdas2.InterfacesFuncionais;

import java.util.function.Predicate;

public class Predicado {
    // Recebe um argumento e retorna um valor boolean
    public static void main(String[] args) {
        Predicate<Produto> isCaro =
                prod -> (prod.preco >= 750);

        Produto produto = new Produto("Notebook", 3899,0.15);

        System.out.println(isCaro.test(produto));

    }
}
