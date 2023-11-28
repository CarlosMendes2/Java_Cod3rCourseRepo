package G_Lambdas2.interfaceFuncional;

@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);

    default String legal(){
        return "legal";
    }

    static String massa(){
        return "massa";
    }
}


//@FunctionalInterface -> Força a interface a ter apenas 1 método *abstrato*!!.
// O java vai substituir exatamente esse método no momento da criação da lambda