package C_ClassesMetodos;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        // var p2 = new Produto();
        //p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;
        double finPreco1 = p1.retornoComDesconto();
        var p2 = new Produto();

        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;
        double finPreco2 = p2.retornoComDesconto();

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        //double precoFinal1 = p1.preco*(1- p1.desconto);
        //double precoFinal2 = p2.preco*(1- p2.desconto);
        //double precoFinal = precoFinal1+precoFinal2;
        //System.out.printf("Preço %s %.2f\n",p1.nome,precoFinal1);
        //System.out.printf("Preço %s %.2f\n",p2.nome,precoFinal2);
        //System.out.printf("Preço carrinho: %.2f\n--",precoFinal);
        System.out.printf("\n Retorno método %.2f\n--",finPreco1);
        System.out.printf("\n Retorno método %.2f\n--",finPreco2);

    }
}
