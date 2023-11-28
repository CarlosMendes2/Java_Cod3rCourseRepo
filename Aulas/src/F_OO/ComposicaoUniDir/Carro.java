package F_OO.ComposicaoUniDir;

public class Carro {

    Motor motor = new Motor();

    void acelerar(){
        if(motor.fatorInjecao < 2.6){
            motor.fatorInjecao+= 0.4;
        }
    }

    void frear(){
        if (motor.fatorInjecao > 0.5){
            motor.fatorInjecao-=0.4;
        }
    }

    void ligar(){

        motor.ligado = true;
        estaLigado();
    }

    void desligar(){
        motor.ligado = false;
        estaLigado();
    }
    void estaLigado(){
        if (motor.ligado){
            System.out.println("Vrummmmm");
        }else{
            System.out.println("*Silêncio*");
        }
    }

}
