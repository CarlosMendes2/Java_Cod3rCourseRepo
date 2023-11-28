package F_OO.Heranca.DesafioHeranca01;

public class Ferrari extends Carro implements Esportivo,Luxo{

    private boolean ligarTurbo;
    private boolean ligarAr;
    public Ferrari(){
        super(315);
    }
    public Ferrari(int velocidadeMax){
        super(velocidadeMax);
        setDelta(15);   // definir o delta faz eu não precisar sobrescrever a funçao acelerar
    }

    public void ligarTurbo(){
         ligarTurbo = true;
    }
    public void desligarTurbo(){
        ligarTurbo = false;
    }
    public void ligarAr(){
        ligarAr = true;
    }
    public void desligarAr(){
        ligarAr = false;
    }
    /*
    @Override // indica que esta sobrescrevendo
    void acelerar(){
        this.velocidadeAtual+=15;
    }
    */

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        }else{
            return 15;
        }
    }

    @Override
    public void freiar(){
        if(this.velocidadeAtual<=0){
            System.out.println("Carro parado");
        }else{
            this.velocidadeAtual-=15;
        }

    }

    // Quando sobrescrevemos algo não podemos diminuir o nível de visibilidade
}
