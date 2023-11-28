package F_OO.Polimorfismo;

public class Jantar {

    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Comida ingrediente1 = new Arroz(0.2);
        Comida ingrediente2 = new Feijao(0.1);

        Comida ingrediente3 = new Arroz(0.3);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);


        Comida sobremesa = new Sorvete(0.4);


        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente2);

        System.out.println(convidado.getPeso());


    }
}
// Super nas sub classes