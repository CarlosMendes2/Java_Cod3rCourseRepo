package B_Controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // if (...){}else if(...){}else{}
        // while(...){} , pode nao ser executado nenhuma vez,
        // do{} while(...);  Unica sentença que possui ponto e vírgula, é ao menos 1.
        // for(...;...;...){}
        // for > while > do() while
        //* Templates/Snipets

        Scanner entrada = new Scanner(System.in);
        String valor;
        int tentativas = 0;

        do{
            System.out.println("Qual a senha?");
            valor = entrada.nextLine();

            if (tentativas!=0){
                System.out.println("Senha Incorreta");

            }
            tentativas++;
        }while (!valor.equalsIgnoreCase("coxinha123"));

        // Era melhor ter tentado fazer isso com If
        System.out.println("Senha Correta");

        entrada.close();
    }
}
