package C_ClassesMetodos;

public class AreaCirc {
    double raio;
    static double pi = 3.14;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return (raio*raio)*pi;
    }
}
