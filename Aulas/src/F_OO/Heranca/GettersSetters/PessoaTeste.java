package F_OO.Heranca.GettersSetters;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Carlos",-45);
        p1.setIdade(230); // alterar

        System.out.println(p1.getIdade()); // ler
        System.out.println(p1);
    }
}
