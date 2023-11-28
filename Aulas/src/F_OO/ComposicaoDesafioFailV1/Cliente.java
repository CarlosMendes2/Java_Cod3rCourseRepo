package F_OO.ComposicaoDesafioFailV1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    List <Compra>  totalCompras = new ArrayList<>();

    Compra compra = new Compra();
    Cliente(String n){
        this.nome = n;
        compra.criarCompraCliente(this.nome);

    }

    void addCarrinho(Compra a){
        totalCompras.add(a);
    }
    double getValorTotal(){
        return compra.getPreco();
    }

}
