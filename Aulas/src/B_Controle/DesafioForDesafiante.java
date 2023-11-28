package B_Controle;

public class DesafioForDesafiante {
    public static void main(String[] args) {

        for (String valor = "#"; !valor.equals("######"); valor+="#"){
            // Escadinha de 5 #
            System.out.printf("%S\n",valor);
        }

        // Versão do desafio
        // Não pode usar valor numérico para controlar o laço;

        /*
        * Resultado esperado
        * #
        * ##
        * ###
        * ####
        * #####
        */
    }
}
