package G_Lambdas2.InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {

        // Não recebe parametro e retorna algo
        // Não conseguimos fazer uma composição com o Supplier

        Supplier<List<String>> umLista = () -> Arrays.asList("Ana","Bia","Guia","Lia");
        //Supplier<Object> umLista = () -> Arrays.asList("Ana","Bia","Guia","Lia");

        System.out.println(umLista.get());
    }
}
