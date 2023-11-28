package I_Tratamento_de_Erros.personalizadaA;

public class StringVaziaException extends RuntimeException{

    private String nomeAtributo;
    public StringVaziaException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está vazio",nomeAtributo);
    }



}
