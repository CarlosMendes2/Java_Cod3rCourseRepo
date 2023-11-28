package H_StreamAPI.MapDesafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class desafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Consumer<Integer> printa = System.out::println;

        //Do Professor
        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

        nums.stream().map(Integer::toBinaryString).map(Conversores::reverse).map(n -> Integer.parseInt(n,2)).forEach(printa);


        System.out.println();
        // .



        /*
        * 1. Número para string binária... 6 => "110"
        * 2. Inverter a string... "110" => "011"
        * 3. Converter de volta para inteiro => "011" => 3
         */

    }
}
