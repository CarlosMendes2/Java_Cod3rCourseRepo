package F_OO.ComposicaoDesafioFailV1;

public class Mercado {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("Carlos");

        cliente01.compra.adicionarItem("Caderno",19.5,2);
        cliente01.compra.adicionarItem("Celular",2000,1);
        cliente01.compra.adicionarItem("Bolsa",200,1);
        cliente01.compra.adicionarItem("Teclado Mecânico",600,1);
        cliente01.compra.adicionarItem("Caneta Preta",10.20,4);

        System.out.println(cliente01.getValorTotal());


    }
}


// método() que retorne quanto de dinheiro o cliente gastou, getValorTotal
// com um for percorrer todas as compras feitas na lista de compras
// item vai ter um atributo de quantidade e uma ref ao produto
// produto vai ter um preço e nome
// compra vai ter uma lista de itens list<Item>
// cliente nome e lista<compra>