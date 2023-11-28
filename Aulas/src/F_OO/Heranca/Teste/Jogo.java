package F_OO.Heranca.Teste;

import F_OO.Heranca.Direcao;
import F_OO.Heranca.Heroi;
import F_OO.Heranca.Jogador;
import F_OO.Heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Jogador heroi = new Heroi(10,10);

        heroi.andar(Direcao.NORTE);
        heroi.andar(Direcao.NORTE);
        heroi.andar(Direcao.SUL);
        heroi.andar(Direcao.LESTE);

        heroi.andar(Direcao.LESTE);
        heroi.andar(Direcao.OESTE);

        Jogador monstrinho = new Monstro(10,11);

        monstrinho.andar(Direcao.NORTE);
        monstrinho.andar(Direcao.NORTE);
        monstrinho.andar(Direcao.SUL);
        monstrinho.andar(Direcao.LESTE);

        monstrinho.andar(Direcao.LESTE);
        monstrinho.andar(Direcao.OESTE);



        System.out.println(heroi.y);
        System.out.println(heroi.x);

        System.out.println(monstrinho.y);
        System.out.println(monstrinho.x);

        System.out.println("Vida heroi: "+heroi.life);
        System.out.println("Vida monstrinho: "+monstrinho.life);
        heroi.atacar(monstrinho);
        heroi.atacar(monstrinho);
        heroi.atacar(monstrinho);
        monstrinho.atacar(heroi);
        monstrinho.atacar(heroi);
        System.out.println("Vida heroi: "+heroi.life);
        System.out.println("Vida monstrinho: "+monstrinho.life);

    }
}
