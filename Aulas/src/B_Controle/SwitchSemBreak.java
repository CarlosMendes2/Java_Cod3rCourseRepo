package B_Controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        // if(bool)
        // while (bool)
        // for (;bool;)

        /* Esse formato de switch sem "break" QUER IMPRIMIR TUDO
        * até o nível que eu sei. Esse tipos é mais uma excessão.
        */

        String faixa = "preta";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Não sei nada");//
        // O Switch assim que é true ler tudo abaixo
        // a não ser que tenha o break que faz sair do laço
        }
    }
}
