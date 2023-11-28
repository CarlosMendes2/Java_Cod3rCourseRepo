package F_OO.ComposicaoMultiDir;

public class Mercado {
    public static void main(String[] args) {

        Compra compra1 = new Compra();

        compra1.cliente = "Mariana";

        Item item1 = new Item("Caneta",4,4.5);
        Item item2 = new Item("Borracha",2,1.5);
        Item item3 = new Item("Caneta",3,3.5);
        Item item4 = new Item("Caderno",1,19.9);

        compra1.carrinho.add(item1);
        compra1.carrinho.add(item2);
        compra1.carrinho.add(item3);

        compra1.adicionarItem(item4);

        compra1.adicionarItem("Marca Texto",2, 5);

        System.out.println(compra1.carrinho.size());
        System.out.println(compra1.getValorTotal());

    }
}
