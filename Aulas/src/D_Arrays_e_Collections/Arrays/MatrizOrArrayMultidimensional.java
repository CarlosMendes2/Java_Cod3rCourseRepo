package D_Arrays_e_Collections.Arrays;

import java.util.Scanner;

public class MatrizOrArrayMultidimensional {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos temos na turma?");
        int quantidadeAlunos = entrada.nextInt();
        System.out.println("Quantas notas por aluno?");
        int quantidadeNotas = entrada.nextInt();

        double[][] matrizMae = new double[quantidadeAlunos][quantidadeNotas];

        double total = 0;

        for (int a = 0; a < matrizMae.length; a++) {
            for(int n = 0 ; n<matrizMae[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d\n", n+1 , a+1 );
                matrizMae[a][n]=entrada.nextDouble();
                total+=matrizMae[a][n];
            }
        }
        double media = total/(quantidadeAlunos*quantidadeNotas);
        System.out.println("Media final "+media);
        entrada.close();
    }

}
