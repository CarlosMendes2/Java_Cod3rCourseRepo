package C_ClassesMetodos;

public class Produtinho {
    // Essa classe faz parte de um sistema de uma loja chamada 25% de dsconto
// quando um desconto é aplicado, é aplicado para todos os produtos da loja(static)
// Por padrão o desconto é 25% mas em datas comemorativas podemos alterar o desconto
// para 28%,30% ou 35%, ele varia, e varia para todos os produtos sem excessão.
    double preco;
    static double desconto = 0.25;

    Produtinho(){

    }
    Produtinho(double precinho){
        preco = precinho;
    }
    double finalPreco(){
        return  (preco *(1-desconto));
    }
    void precoDireto(){
        System.out.println(preco*(1-desconto));
    }

}
