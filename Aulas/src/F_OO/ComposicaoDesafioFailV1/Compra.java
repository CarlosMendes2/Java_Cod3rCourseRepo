package F_OO.ComposicaoDesafioFailV1;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> carrinhoCompras = new ArrayList<> ();

    void criarCompraCliente(String nome){
        Cliente cliente = new Cliente(nome);
    }

    void adicionarItem(String n, double p, int q){
        this.carrinhoCompras.add(new Item(n,p,q));

    }

    double getPreco(){
        double total = 0;
        for(Item i:carrinhoCompras){
            total += i.p.preco * i.quantidade;
        }
        return total;
    }
}
