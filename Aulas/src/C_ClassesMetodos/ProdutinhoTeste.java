package C_ClassesMetodos;

public class ProdutinhoTeste {
    public static void main(String[]args){
        Produtinho cerveja = new Produtinho();
        Produtinho arroz = new Produtinho(26.92);
        cerveja.preco = 4.70;

        Produtinho.desconto=0.50;

        System.out.println(cerveja.finalPreco());
        System.out.println(arroz.finalPreco());
        cerveja.precoDireto();


    }
}
