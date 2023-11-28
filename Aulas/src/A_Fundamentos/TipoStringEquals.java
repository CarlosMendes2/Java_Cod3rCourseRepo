package A_Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        //System.out.println("2" == "2");
        String s = new String("2");
        //System.out.println("2".equals(s));
        //System.out.println("2" == s); //*******######
        // Comparar Strings

        Scanner entrada = new Scanner(System.in);
        String s2 = entrada.nextLine(); // next tira os espaços em branco
                                        // nextline nao tira os espaços
        System.out.println("2" == s2.trim()); // O trim tira os espaços
        // em branco
        System.out.println("2".equals(s2));

        // não comparar strings com igual igual


        entrada.close();

    }
}
