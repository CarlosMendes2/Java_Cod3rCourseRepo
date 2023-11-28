package C_ClassesMetodos;

public class ZUsuario {
    String nome;
    String email;


    public boolean equals(Object objeto) {  // recebe um objeto como parametro, generico.
        if (objeto instanceof ZUsuario){
            ZUsuario outro = (ZUsuario) objeto; // e faz um casting para o tipo zusuario
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        }else{
            return false;
        }
    }
}

