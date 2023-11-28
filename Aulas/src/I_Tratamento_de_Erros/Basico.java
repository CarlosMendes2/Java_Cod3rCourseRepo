package I_Tratamento_de_Erros;

public class Basico {
    public static void main(String[] args) {
        Aluno a1 = null;
        try {
            impimirNomeAluno(a1);
        }catch (Exception e){
            System.out.println("Ocorreu um erro no momento de imprimir o nome do user");
        }

        try {
            System.out.println(7/0);
        }catch (ArithmeticException e){
            System.out.println("Ocorreu um erro na operação aritmética: " + e.getMessage());
        }


    }
    public static void impimirNomeAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
