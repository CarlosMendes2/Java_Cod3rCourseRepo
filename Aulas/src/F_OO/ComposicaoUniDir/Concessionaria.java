package F_OO.ComposicaoUniDir;


public class Concessionaria {
    public static void main(String[] args) {

        Carro unoEscadinha = new Carro();

        unoEscadinha.ligar();
        unoEscadinha.desligar();
        unoEscadinha.ligar();

        unoEscadinha.acelerar();
        unoEscadinha.acelerar();
        unoEscadinha.acelerar();

        System.out.println(unoEscadinha.motor.giros());

        unoEscadinha.frear();
        unoEscadinha.frear();

        System.out.println(unoEscadinha.motor.giros());

        unoEscadinha.desligar();

        System.out.println(unoEscadinha.motor.giros());



        /*
        *faltou Encapsulamento
        *unoEscadinha.ligar();
        *unoEscadinha.motor.fatorInjecao = 900;
        *System.out.println(unoEscadinha.motor.giros());
        */
    }
}
