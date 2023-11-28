package C_ClassesMetodos;

public class PrimeiroTrauma {
    int a = 3; // não pode mexer aqui!

    public static void main(String[] args) {
    // pode mecher aqui
        //int b = a
        PrimeiroTrauma primeiroT = new PrimeiroTrauma();
        int b = primeiroT.a;
        System.out.println(b);
        // algo statico pode acessar outro membro statico
        // ou então tenho que criar uma instância.
    }
}
