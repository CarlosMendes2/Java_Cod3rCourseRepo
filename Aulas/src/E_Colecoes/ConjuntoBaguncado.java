package E_Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes","unchecked"}) // Coisa mais linda isso aqui
    public static void main(String[]args){

        HashSet conjunto = new HashSet();

        // primitivo → Wrapper
        conjunto.add(1.2); //  double → Double
        conjunto.add(true);// boolean → Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int → Integer
        conjunto.add('X'); // char → Character

        System.out.println(conjunto.size());

        System.out.println(conjunto.remove('X'));

        System.out.println(conjunto.size());

        System.out.println(conjunto.contains(true)); // elemento x esta contido?

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // União entre dois conjuntos

        conjunto.retainAll(nums); // Interseção

        conjunto.clear(); // Limpa tudo

        System.out.println(conjunto);

    }

}
