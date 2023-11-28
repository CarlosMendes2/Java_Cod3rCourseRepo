package E_Colecoes;

import java.util.Objects;

public class Usuario {

    String nome;

    Usuario(String nome){

        this.nome = nome;

    }
    public String toString(){
        return "Meu nome é "+ this.nome+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);

    }

//    public int hashCode() {
//        return this.nome.length();  // varrer pelo tamanho da string
//
//    }
}
