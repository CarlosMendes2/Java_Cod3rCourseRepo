package A_Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        // A partir do scanner, pegar 3 strings usando nextLine
        // receber os ultimos 3 salarios
        // calcular a média dos ultimos 3 salarios
        // o funcionario pode declarar com vírgula ou com ponto.
        // mostrar a média dos ultimos 3 salarios.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro salário");
        String salario1 = entrada.nextLine().replace(",",".");
        System.out.println("\nInforme o primeiro salário");
        String salario2 = entrada.nextLine().replace(",",".");
        System.out.println("\nInforme o primeiro salário");
        String salario3 = entrada.nextLine().replace(",",".");

        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);
        double media = (valor1+valor2+valor3)/3;
        System.out.printf(
                "Média dos ultimos 3 salários: %f",media);
        entrada.close();

    }
}
