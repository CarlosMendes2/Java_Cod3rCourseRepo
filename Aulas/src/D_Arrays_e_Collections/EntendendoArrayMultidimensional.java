package D_Arrays_e_Collections;

import java.util.Scanner;

public class EntendendoArrayMultidimensional {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Quantos alunos temos na sala?");
        int entradaQuantidadeAlunos = entrada.nextInt();
        System.out.println("Quantas notas?");
        int entradaQuantidadeNotas = entrada.nextInt();

        double[][] arrayMulti = new double[entradaQuantidadeAlunos][entradaQuantidadeNotas];
        //double notas = 0;
        for(int i = 0; i < arrayMulti.length; i++){
            for (int j = 0; j<arrayMulti[i].length; j++){
                System.out.printf("Informe a nota %d do aluno %d",(j+1),(i+1));
                double entradaCadaNota = entrada.nextDouble();
                arrayMulti[i][j]= entradaCadaNota;
            }
        }
        for(int i = 0; i < arrayMulti.length; i++){
            System.out.printf("Notas Aluno %d",i);
            for (int j = 0; j<arrayMulti[i].length; j++){;
                System.out.printf("Nota %d : %f",(j+1),(arrayMulti[i][j]));
            }
            System.out.println("---");
        }


    }
}
