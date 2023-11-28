package I_Tratamento_de_Erros.personalizadaA;

import I_Tratamento_de_Erros.Aluno;

public class TesteValidações {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Aninha",-7);
            Validar.usuario(aluno);
        }catch (NumeroForaIntervaloException
                | StringVaziaException e){
            System.out.println(e.getMessage());
        }


        System.out.println("fim");

    }
}
