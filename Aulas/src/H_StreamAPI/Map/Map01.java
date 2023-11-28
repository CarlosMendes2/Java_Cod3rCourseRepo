package H_StreamAPI.Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map01 {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW","Audi","Honda","Toyota");
        marcas.stream().map( m-> m.toUpperCase()).forEach(print);

        //System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));

        System.out.println("Usando composição...");
        marcas.stream().map(utilitarios::grito).forEach(print);



    }
}


/* MAP #01
* [MAP.PDF]
* Sempre um Map vai gerar um stream de mesmo tamanho, com os dados modificados.
*
 */
