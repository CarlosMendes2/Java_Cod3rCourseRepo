package G_Lambdas;
@FunctionalInterface // não preciso usar essa anotation, pois é padrao
// mas ela vai limitar a interface a um único método.(interface funcional)
// essa anotação aplica uma validação.
public interface Calculo {

    public abstract double executar(double a, double b);

    //public abstract double exect (double a);

}
