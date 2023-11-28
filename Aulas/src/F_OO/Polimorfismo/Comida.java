package F_OO.Polimorfismo;

public abstract class Comida {

    public double peso;

    public Comida(){}
    public Comida (double p){
        setPeso(p);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >=0){
            this.peso = peso;
        }
    }
}
