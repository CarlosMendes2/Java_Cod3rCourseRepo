package E_Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe"); // retorna true ou false se tiver espaço ou não
        livros.push("Dom Quixote"); // retorna erro de exceção se não tiver espaço
        livros.push("O Hobbit");

        System.out.println(livros.peek()); // imprime o último, retorna null
        System.out.println(livros.element()); // imprime o último


        //System.out.println(livros.remove()); // remove O Hobbit
        System.out.println(livros.poll()); // remove O Hobbit
        System.out.println(livros.pop()); // da errro de exception
        System.out.println(livros.pop());
        System.out.println(livros.pop());
        System.out.println(livros.pop());

        // livros.clear();
        // livros.contains();
        // livros.isEmpty();
        // livros.size();

        for(String livro: livros){
            System.out.println(livro);
        }

    }
}
