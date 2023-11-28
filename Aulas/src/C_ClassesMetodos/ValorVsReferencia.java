package C_ClassesMetodos;

public class ValorVsReferencia {
    public static void main(String[]args){

        double a = 2;
        double b = a; // Atribuição por valor a = 2 e b = 2
        a++;          // 3
        b--;          // 1
        System.out.println(a+" "+b); // Valores independentes

        Data d1 = new Data(1,1,2022);
        Data d2 = d1; // Atribuição por referência
        d1.dia=31;
        d2.mes=12;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());


    }
}
