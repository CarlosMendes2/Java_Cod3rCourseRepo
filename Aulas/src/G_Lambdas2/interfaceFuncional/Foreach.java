package G_Lambdas2.interfaceFuncional;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");

        // Forma tradicional
        for (String n:aprovados) {
            System.out.println(n);
        }
        // Com lambda #01
        aprovados.forEach(nome->System.out.println(nome+"!!!"));

        // Method Reference #01
         aprovados.forEach(System.out::println);
         // estou passando cada nome como parametro para o println

        // Com lambda #02
        aprovados.forEach(nome -> meuImprimir(nome));

        // Method Reference #02 ***
        aprovados.forEach(Foreach::meuImprimir);
        // estou passando cada nome como parametro para o println

    }
    static void meuImprimir(String nome){
        System.out.println("Oi meu nome é "+nome+".");
    }
}
