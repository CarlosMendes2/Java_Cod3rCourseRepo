package F_OO.Abstrato;

public class Cachorro  extends Mamifero{
    @Override
    public String mover() {
        return "Usando as patas";
    }
    // Se o filho define o neto não precisa definir.
    // Desse modo, não seria necessário definir mover, ja que M definiu.
    // Se eu definir um método como final ele não vai poder
    // ser sobrescrito.


    // EM UMA INTERFACE Há TAMBÉM A POSSÍBILIDADE DE DEFINIR UM MÉTODO COMO
    // DEFAULT PARA NÃO HAVER A OBRIGAÇÃO DE DEFINIR ELE NAS CLASSES FILHAS.
    //
    @Override
    public String mamar() {
        return "Com leite";
    }
}
