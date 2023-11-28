package B_Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        double total = 0;
        int notasValidas = 0;
        double controle = 0;

        Scanner entrada = new Scanner(System.in);
        // Com Do While
         do {
            System.out.println("Digite uma média válida");
            double entradaDig = entrada.nextDouble();
            if (entradaDig>=0 && entradaDig<=10){
                total+=entradaDig;
                notasValidas++;
            }else if (entradaDig == -1) {
                controle++;
            }else{
                System.out.println("Nota Inválida");
            }
         }while (controle == 0);

         // Com While
        while (controle!=-1){
            System.out.println("Insira uma nota válida");
            controle = entrada.nextDouble();
            if (controle>=0 && controle<=10) {
                total += controle;
                notasValidas++;
            }else if (controle < 0 && controle >10 ) {
                System.out.println("Entrada inválida");
            }
        }

        double media = total/notasValidas;
        System.out.printf("Notas válidas = %d | Média = %.1f | Controle = %f | Total %.1f\n",notasValidas,media,controle,total);
        System.out.printf("Média = %.1f | Notas Válidas = %d",media,notasValidas);



    }
}
