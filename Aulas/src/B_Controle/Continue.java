package B_Controle;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if (i % 2 == 1){
                continue;     // Ele interrompe apenas a repetição
            }                   // faz continuar o laço, ao contrario do break
            System.out.println(i);// que quebra o laço finalizando
        }
    }
}
