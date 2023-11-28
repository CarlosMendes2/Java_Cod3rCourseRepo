package C_ClassesMetodos;

public class DataTeste {
    public static void main(String []args){
        Data data1 = new Data();
        Data data2 = new Data();
        Data data3 = new Data(24,5,1999);
        Data data4 = new Data();


        data1.dia = 24;
        data1.mes = 5;
        data1.ano = 1999;
        String imprimirD1 = data1.obterDataFormatada();

        data2.dia = 7;
        data2.mes = 7;
        data2.ano = 1977;
        String imprimirD2 = data2.obterDataFormatada();


        System.out.println(imprimirD1);
        System.out.println(imprimirD2);
        data1.obterDataFormatada2();
        //String desafio2 = data1.returnData();


        System.out.println("----Desafio Construtor -----");
        String imprimirD3 = data3.obterDataFormatada();
        String imprimirD4 = data4.obterDataFormatada();
        System.out.println(imprimirD3);
        System.out.println(imprimirD4);

        System.out.println("----Desafio Pessoal -----");

        Datinha feriadao = new Datinha(3,5);
        System.out.printf("%d %d",feriadao.feriado,feriadao.feriadoDois);


    }
}
