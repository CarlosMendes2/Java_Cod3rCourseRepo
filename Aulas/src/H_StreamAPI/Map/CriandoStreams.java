package H_StreamAPI.Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;
        Stream<String> langs = Stream.of("Java ","Lua ","JS\n");

        langs.forEach(print);

        String[] maisLangs = {"Python ","Lisp ","Pearl ","Go\n"};

        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);

        Arrays.stream(maisLangs,1,3).forEach(print);

        List<String> outrasLangs = Arrays.asList("C","PHP","Kotlin\n");

        outrasLangs.stream().forEach(print);
        System.out.println("Parallel");
        outrasLangs.parallelStream().forEach(print);

        Stream.generate(()->"a\n").forEach(print); // Gera de forma infinida, muito cuidado!
        //Stream.iterate(0, n-> n+1).forEach(print); // também gera infinitamente.

    }
}
