package F_OO.Encapsulamento.CasaB;

import F_OO.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {

    //Ana mae = new Ana();
    void testeAcessos(){
        //System.out.println(esposa.segredo);
        //System.out.println(mae.facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
        /*
        * Nos casos acima, não é necessário instanciar a mãe ja que Pedro herdou os atributos
        * da Ana, isso seria necessário se estivessemos usando por coposição, o que não é o caso
        *
         */
    }

}
