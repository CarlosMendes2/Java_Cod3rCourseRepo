package F_OO.Heranca.Teste;

import F_OO.Heranca.DesafioHeranca01.Carro;
import F_OO.Heranca.DesafioHeranca01.Ferrari;
import F_OO.Heranca.DesafioHeranca01.Sandero;

public class Br230 {
    public static void main(String[] args) {

        Ferrari superCar = new Ferrari(280);
        Carro popularCar = new Sandero();


        superCar.acelerar();
        superCar.ligarTurbo();
        superCar.acelerar();
        superCar.acelerar();
        superCar.acelerar();
        superCar.acelerar();



        superCar.getVelocidade();

        popularCar.acelerar();
        popularCar.acelerar();
        popularCar.acelerar();
        popularCar.acelerar();
        popularCar.acelerar();
        popularCar.freiar();
        popularCar.freiar();

        popularCar.getVelocidade();

    }
}
