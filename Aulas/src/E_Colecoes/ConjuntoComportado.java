package E_Colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        // o tipo dentro de <> esta limitando o tipo de dados do conjunto
        SortedSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Carlos");
        listaAprovados.add("Maria");
        listaAprovados.add("Bárbara");

        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }


    }
}

/* Uma vez definido o tipo no Set<String> não é necessário repetir em new HashSet<>
*  Podemos usar apenas o operador diamond <> : new Hashset<>(); Isso foi add no java7/8
*/

/* Primeiro fiz Set<String> lista = new HashSet<>(); Desta forma é desordenado
*  Mas temos a opção de fazer: SortedSet<> lista = new TreeSet<>();
* Sempre tendo que fazer os imports dos Sets
* O SortedSet tem vários tipos ordenação, nesse caso usamos o TreeSet.
*/

/* conceito de autobox, que é automaticamente colocar os tipos primitivos para Wrappers.
 *No conjunto bagunçado, por ser homogêneo, a entrada era um objeto e ocorria o autobox
 *Aqui no conjunto comportado, eu defini o tipo como String, então o unico conteúdo que
 * vai entrar será do tipo String.
 */