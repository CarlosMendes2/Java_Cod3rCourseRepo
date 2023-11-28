package A_Fundamentos;

public class DesafioOpLogicos {
    public static void main(String[] args) {

        // Job 1 (V OU F)
        // Job 2 (V OU F)

        // 1 trabalho = tv de 32 + sorvete
        // 2 trabalhos = tv de 50 + sorvete
        // 1 e 2 = casa sem sorvete sem tv

        // Entrada
        boolean jobOne = true;
        boolean jobTwo = true;
        // Processamento
        boolean gainSmallTv = jobOne||jobTwo;
        boolean gainBigTv = jobOne && jobTwo;
        boolean gainIceCream = gainSmallTv || gainBigTv;
        boolean nothing = !jobOne&&!jobTwo;
        // Saída
        System.out.printf("Ganhou tv de 32? %b\n",gainSmallTv);
        System.out.printf("Ganhou tv de 50? %b\n",gainBigTv);
        System.out.printf("Vai tomar sorvete? %b\n",gainIceCream);
        System.out.printf("Vai ficar sem nada? %b\n",nothing);
    }
}
