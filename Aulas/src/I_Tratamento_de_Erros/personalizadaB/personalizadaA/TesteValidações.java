package I_Tratamento_de_Erros.personalizadaB.personalizadaA;

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

        try {
            Validar.usuario(null);
        } catch (StringVaziaException e) {
            throw new RuntimeException(e);
        } catch (NumeroForaIntervaloException e) {
            throw new RuntimeException(e);
        }


        System.out.println("fim");

    }
}
