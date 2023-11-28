package C_ClassesMetodos;

public class ZEquals {
    public static void main(String[] args) {

        ZUsuario u1 = new ZUsuario();
        u1.nome = "José";
        u1.email = "josezinho@hotmail.com";


        ZUsuario u2 = new ZUsuario();
        u2.nome = "José";
        u2.email = "josezinho@hotmail.com";

        System.out.println(u1==u2); // Estamos comparando endereços de memória

        System.out.println(u1.equals(u2));




    }
}
