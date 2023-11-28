package F_OO.ComposicaoMultiDir;

import java.util.ArrayList;

public class Compra {

    // 1 item tem 1 compra
    // 1 compra tem vários itens
    String cliente;
    ArrayList<Item> carrinho = new ArrayList<>();


    void adicionarItem(String nome, int quantidade, double preco){
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    void adicionarItem(Item item){
        carrinho.add(item);
    }


    double getValorTotal(){
        double total = 0;
        for(Item cadaItem: carrinho){
            total+= cadaItem.quantidade * cadaItem.preco;
        }
        return total;
    }
}
