package B_Controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";
        int i = 0;

        while (!valor.equalsIgnoreCase("sair") ){

            System.out.printf("testing...%d\n",i);
            valor = entrada.nextLine();
            i++;
        }
        System.out.println("Finish");
        entrada.close();


    }


}