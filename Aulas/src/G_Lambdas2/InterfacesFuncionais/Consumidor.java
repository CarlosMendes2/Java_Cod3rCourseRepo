package G_Lambdas2.InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!");
        Produto p1 = new Produto("p1",999.9,0.15);
        Produto p2 = new Produto("p2",999.9,0.15);
        Produto p3 = new Produto("p3",999.9,0.15);
        Produto p4 = new Produto("p4",999.9,0.15);
        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);

        produtos.forEach(imprimir);
        produtos.forEach(produto -> System.out.println(produto.preco));
        produtos.forEach(System.out::println); // fazer toString na classe Produto

    }
}
