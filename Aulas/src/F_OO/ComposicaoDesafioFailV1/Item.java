package F_OO.ComposicaoDesafioFailV1;

public class Item {

    int quantidade;

    Produto p;

    Item( String n,double p, int q){
        this.quantidade = q;
        this.p = new Produto(n, p);
    }


}


// Item vai criar um produto e vai se adicionar ao carrinho de compras da classe
// Compra, que vai se adicionar a lista da classe cliente.

