package E_Colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        ArrayList<Usuario>lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        Scanner entrada = new Scanner(System.in);

//        while (lista.size()< 5){
//            System.out.println("Digite o nome do usuario");
//            String criador = entrada.nextLine();
//            lista.add(new Usuario(criador));
//        }


        lista.add(new Usuario("Carlos")); // incrível isso aqui, tá?
        lista.add(new Usuario("Lia")); // incrível isso aqui, tá?
        lista.add(new Usuario("Maria")); // incrível isso aqui, tá?
        lista.add(new Usuario("Bárbara")); // incrível isso aqui, tá?
        lista.add(new Usuario("Mariana")); // incrível isso aqui, tá?

        System.out.println(lista.get(4).nome); // pega o índice

        System.out.println(">>>"+ lista.remove(1));
        System.out.println("Tem? "+ lista.contains(new Usuario("Mariana"))); // só funciona com equals e hashcode

        for(Usuario u: lista){
            System.out.println(u.toString());
        }

        /* Pode ser heterogêneo :(
        * Pode ser homogêneo :)
        * aceita obj duplicados
        * É orientado
        * É indexado
        */
        entrada.close();
    }
}
