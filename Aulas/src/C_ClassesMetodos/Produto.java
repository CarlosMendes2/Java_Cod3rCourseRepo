package C_ClassesMetodos;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial){
        nome = nomeInicial;

    }
    Produto(String nomeInicial,double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;

    }
    Produto(String nomeInicial,double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;

    }
    Produto(){ // faz ter o construtor default e o explícito ao msm tempo.

    }

    double retornoComDesconto(){
        return this.preco *(1-this.desconto);
    }
}

// Essa classe faz parte de um sistema de uma loia chamada 25% de dsconto
// quando um desconto é aplicado, é aplicado para todos os produtos da loja(static)
// Por padrão o desconto é 25% mas em datas comemorativas podemos alterar o desconto
// para 28%,30% ou 35%, ele varia, e varia para todos os produtos sem excessão.

