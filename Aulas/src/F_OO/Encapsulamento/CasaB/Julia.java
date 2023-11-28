package F_OO.Encapsulamento.CasaB;

import F_OO.Encapsulamento.CasaA.Ana;

public class Julia {

    Ana sogra = new Ana();
    void testeAcessos(){
//        System.out.println(sogra.segredo);  // private
//        System.out.println(sogra.facoDentroDeCasa); // default
//        System.out.println(sogra.formaDeFalar); // package
        System.out.println(sogra.todosSabem); // public
    }
}
