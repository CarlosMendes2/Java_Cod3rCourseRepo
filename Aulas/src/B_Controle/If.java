package B_Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média");
        double entryMed = entrada.nextDouble();

        if (entryMed>=7 && entryMed<=10){
            System.out.println("Aprovado");
        }
        else if(entryMed<7 && entryMed>0) {
            System.out.println("reprovado");
        }else{
            System.out.println("Nota inválida");
        }


        entrada.close();
    }
}
