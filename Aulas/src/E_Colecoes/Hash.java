package E_Colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Mariana"));
        usuarios.add(new Usuario("Roberta"));
        usuarios.add(new Usuario("Lais"));

        boolean resultado = usuarios.contains(new Usuario("Lais"));
        System.out.println(resultado);

    }
}
