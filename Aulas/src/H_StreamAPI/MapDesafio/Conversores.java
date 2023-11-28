package H_StreamAPI.MapDesafio;

public class Conversores {

    public static String reverse(String a){

        String resultante = "";

        for (int i = a.length() -1 ; i >= 0;i--){
            resultante += a.charAt(i);
        }
        return resultante;
    }

}
