package D_Arrays_e_Collections.Arrays;

import java.util.Scanner;

public class DesafioArray05 {
    public static void main(String[] args) {
        /* Calcular as média de um aluno
        * O usuario vai passar as medias para o programa
        * primeira pergunta, quantas notas você vai informar?
        * uma vez informado, vai criar um array com a quantidade de notas
        * após armazenar todas as notas no array vou percorrer ele usando um foreach
        * e por fimapresentar a media ao final
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas notas?");
        int quantidadeNotas = entrada.nextInt();

        double[] notas = new double[quantidadeNotas];
        double notaFinal = 0;

        for (int i = 0 ; i<notas.length ; i++){
            System.out.println("Digite a nota " + (1+i));
            double notinha = entrada.nextDouble();  // podia ter feito direito na nota
            notas[i] = notinha;                    // notas[i] = entrada.nextDouble();
        }
/*
        for (int i = 0; i < notas.length; i++) {  // se fosse permitido assim seria mais fácil
            notaFinal+=notas[i];
            if(i == (notas.length-1)){
                double media = notaFinal/notas.length;
                System.out.println(media);
                }
*/
        int indiceForEach = 0;
        for (double n:notas){
            notaFinal+=n;
            indiceForEach++;
            if(indiceForEach == notas.length){  // se 4 notas , indice   // perdi quase 1 hora por não perceber que estava usando notas[notas.length] ao invés e notas.length, burro burro burro.
                double media = notaFinal/notas.length;
                System.out.printf("\nNota final = %.2f",media);
            }
        }
        entrada.close();
    }
}
