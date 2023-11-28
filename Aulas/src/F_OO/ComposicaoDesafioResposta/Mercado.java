package F_OO.ComposicaoDesafioResposta;

public class Mercado {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Julia");

        Compra compra1 = new Compra();
        compra1.addItem("CaNETA",9.67,100);
        compra1.addItem("Notebook",1897.66,2);

        Compra compra2 = new Compra();
        compra2.addItem("Caderno",10,10);
        compra2.addItem("Impressora",998.90,1);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.getValorTotal());


    }
}
