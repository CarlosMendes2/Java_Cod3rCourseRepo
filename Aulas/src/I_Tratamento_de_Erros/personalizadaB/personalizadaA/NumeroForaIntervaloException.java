package I_Tratamento_de_Erros.personalizadaB.personalizadaA;

public class NumeroForaIntervaloException extends Exception{

    private String nomeAtributo;
    public NumeroForaIntervaloException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O Número %s está fora do intervalo",nomeAtributo);
    }


}
