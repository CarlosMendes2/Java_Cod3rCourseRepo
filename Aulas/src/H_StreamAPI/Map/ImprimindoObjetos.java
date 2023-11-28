package H_StreamAPI.Map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu","Gui","Ana","Luca");

        System.out.println("Usando foreach");
        for (String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator");
        //  Iterator tem dois métodos, 1 retornar boolean(tem próx.?), se sim, me dê.
        Iterator<String> it = aprovados.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nUsando Stream");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);

    }

}




/* Streams
* Operações
* - Build Ops : Operações de criação - > Criação de streams, construção da streams
* - Int. Ops : operações intermediarias -> Transformas os dados, operações encadeadas, sempre retorna nova stream
* - Terminal Ops : operações terminais -> Pode gerar algo diferente de uma stream.
*
* Streams Ordenadas   -> Seguem ordem predefinidas
* Streams Não Ordenadas -> Não seguem ordem predefinida
*
* Streams sequencial -> Processamento sequencial dos dados, uma única thread.
* Paral. Streams -> Processa dados de formas paralela.
*
*
*
*
*
*
*
*
*
*
*
*
*
*
 */
