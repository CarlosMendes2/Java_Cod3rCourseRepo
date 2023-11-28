package E_Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        // generics com 2 tipos
        Map<Integer,String> usuarios = new HashMap<>();

        // o Map não possui o método adicionar

        usuarios.put(1,"Monica"); // adiciona caso não existe e substitui caso já exista
        usuarios.put(1,"Fernanda"); // sobrescreve
        usuarios.put(64,"Raquel"); // coloca a 1 vez e coloca novamente caso já exista.
        usuarios.put(2,"Bia");
        usuarios.put(21,"Elizabeth");
        usuarios.put(96,"Bianca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet()); // somente as keys, não mantem nenhuma ordem
        System.out.println(usuarios.values()); // apenas os valores
        System.out.println(usuarios.entrySet()); // chave e valor
        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Bianca")); // chave e valor
        System.out.println(usuarios.get(21)); // pega pelo índice
        System.out.println(usuarios.remove(2,"Bia"));

        // Formas de percorrer, através só das chaves, dos valores e os dois ao mesmo tempo.
        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        for(String valores: usuarios.values()){
            System.out.println(valores);
        }
        for(Map.Entry<Integer,String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " → ");
            System.out.println(registro.getValue());
        }



    }
}
