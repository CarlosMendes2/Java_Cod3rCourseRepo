package B_Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // Domingo -> 1
        // Quarta -> 4
        // Terça -> 3

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia da semana");
        String diaDaSemana = entrada.nextLine();

        if (diaDaSemana.equalsIgnoreCase("DOMINGO")){
            System.out.println("Valor 1");
        }else if (diaDaSemana.equalsIgnoreCase("SEGUNDA")) {
            System.out.println("Valor 2");
        }else if (diaDaSemana.equalsIgnoreCase("TERÇA")){
            System.out.println("Valor 3");
        }else if (diaDaSemana.equalsIgnoreCase("QUARTA")){
            System.out.println("Valor 4");
        }else if (diaDaSemana.equalsIgnoreCase("QUINTA")){
            System.out.println("Valor 5");
        }else if (diaDaSemana.equalsIgnoreCase("SEXTA")){
            System.out.println("Valor 6");
        }else if (diaDaSemana.equalsIgnoreCase("SABADO")){
            System.out.println("Valor 7");
        }else{
            System.out.println("Valor Incorreto");
        }
        entrada.close();
    }
}
