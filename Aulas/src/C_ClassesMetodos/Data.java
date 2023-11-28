package C_ClassesMetodos;

public class Data {

    int dia;
    int mes;
    int ano;

    // Desafio Construtor
    Data(){
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        //return this.dia+"/"+this.mes+"/"+this.ano;
        this(1,1,1999);
    }
        // byte, short, int, long -> Padrão = 0;
        // float, double -> Padrão 0.0;
        // boolean -> Padrão = false;
        // char -> Padrão = '\u0000';
    Data(int d,int m, int ano){
        this.dia = d;
        this.mes = m;
        this.ano = ano;
    }
    String obterDataFormatada(){
        final String formato = "%d/%d/%d";
        return String.format(formato,dia,mes,ano);

    }
    void obterDataFormatada2(){
        System.out.printf("%d/%d/%d\n",dia,mes,ano);
    }


}
/* adicionar 2 construtores
* 1 construtor padrão (forma explicita)
* 1 construtor (recebe dia mes e ano)
* 1 construtor que recebev dia mes e ano
* quando for chamado o padrão a data seja primeiro 01/01/1970
* no caso se nao for informado dia,mes e ano a data padrão será 01011970
*/
