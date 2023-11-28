package I_Tratamento_de_Erros;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        try {
            geraErro1();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        geraErro2();

        System.out.println("Fim.");
    }

    // Não checada ou não verificada
        static void geraErro1(){
        throw new RuntimeException("Erro legal #01");
    }

    // Exceção checada ou verificada               ↓
        static void geraErro2(){
        try {
            throw new Exception("Erro bem legal #02");
        }catch (Exception e){
            System.out.println("Que legal!");
        }

    }

}
