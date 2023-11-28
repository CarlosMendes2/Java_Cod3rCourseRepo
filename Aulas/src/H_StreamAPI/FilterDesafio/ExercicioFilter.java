package H_StreamAPI.FilterDesafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ExercicioFilter {

    public static void main(String[] args) {

        Produto p1 = new Produto("Samsung QLED 4K",2199.99,"Eletrônicos");
        Produto p2 = new Produto("Adidas Ultraboost",699.99,"Calçados");
        Produto p3 = new Produto("Harry Potter Box Se",999.99,"Livros");
        Produto p4 = new Produto("De'Longhi Magnifica",2499.99,"Eletrodomésticos");
        Produto p5 = new Produto("Specialized S-Works",4999.99,"Esportes e Lazer");
        Produto p6 = new Produto("Schott Perfecto",899.99,"Moda");
        Produto p7 = new Produto("Bang & Olufsen Beoplay H9",1799.99,"Eletrônicos");

        List<Produto> estoque = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
        List<Produto> milReais = new ArrayList<>();
        List<Produto> eletronicos = new ArrayList<>();
        Predicate<Produto> caroMil = n -> n.preco>1000.00;
        Predicate<Produto> catEletronic = n -> n.categoria.equalsIgnoreCase("Eletrônicos");

        estoque.stream().filter(caroMil).forEach(milReais::add);
        estoque.stream().filter(catEletronic).forEach(eletronicos::add);

        System.out.println("Estoque disponível:\n");
        estoque.stream().map(a -> "Nome: "+a.nome + " |Preço: "+a.preco+" |Categoria: "+a.categoria).forEach(System.out::println);

        System.out.println("\nProdutos acima de mil reais:");
        milReais.stream().map(a -> "Nome: "+a.nome + " |Preço: "+a.preco+" |Categoria: "+a.categoria).forEach(System.out::println);

        System.out.println("\nProdutos Eletrônicos:");
        eletronicos.stream().map(a -> "Nome: "+a.nome + " |Preço: "+a.preco+" |Categoria: "+a.categoria).forEach(System.out::println);






    }

}
