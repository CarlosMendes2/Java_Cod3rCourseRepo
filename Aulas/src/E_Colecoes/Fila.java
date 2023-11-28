package E_Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        // .offer() vs .add() : diferenças de comportamento quando a fila está cheia
        fila.add("Ana"); // Se adicionar a uma fila com restrição de tamanho e estourar o tamanho,
                        // o método .add() retorna um erro
        fila.offer("Bianca"); // Se adiconando a uma fila com restrição, retorna false.
        fila.offer("Rafaela");
        fila.offer("Gabriela");

        // .peek() vs .element(): diferenças esta quando a fila esta vazia
        // ambos obtêm o prox elemento da fila sem remover
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.element()); // retorna uma exceção

        // fila.size();
        // fila.clear();
        // fila.isEmpty();

        // retorna o 1 membro ja removendo
        // .poll() vs remove();
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // retorna null quando esta vazio.
        System.out.println(fila.remove()); // retorna uma exceção // // //.

        //


    }
}
