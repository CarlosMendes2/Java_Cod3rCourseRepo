package F_OO.Heranca;

public class Heroi extends Jogador{

    public Heroi(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean atacar(Jogador oponente){
        boolean ataque1 = super.atacar(oponente); // chamo o método pai.
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return  ataque1 || ataque2 || ataque3;
    }



}
    /*
    Sobrescrevendo o método.
    boolean atacar(Jogador oponente){

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX==0 && deltaY == 1){
            oponente.life -= 20;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.life -= 20;
            return true;
        }
        return false;
    }
*/


