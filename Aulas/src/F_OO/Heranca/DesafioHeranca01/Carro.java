package F_OO.Heranca.DesafioHeranca01;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    private int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    public void acelerar(){
        if ((velocidadeAtual + getDelta()) > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            this.velocidadeAtual += getDelta();
        }
    }
    public void freiar(){
        if(this.velocidadeAtual<=0){
            System.out.println("Carro parado");
        }else{
             this.velocidadeAtual-=5;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public void getVelocidade(){
        System.out.println(this.velocidadeAtual);
    }

    // criar dois carros específicos.
    // se for ferrari, ferrari extends Carro
    // assim como palio extends
    // Carro vai ter velocidadeAtual, acelerar(): aumenta 5 velocidade
    // freiar(): diminui 5 velocidade
    // a velocidade do carro nucna pode ser menor que 0
    // dentro da ferrari, ela vai acelerar de 15 em 15.
    // o carro normal vai acelerar de 5 em 5.

}
