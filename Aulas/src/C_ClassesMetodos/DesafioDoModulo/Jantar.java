package C_ClassesMetodos.DesafioDoModulo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa carlos = new Pessoa("Carlos",70.1);
        Pessoa rafaela = new Pessoa("Rafaela",60.2);
        Pessoa rosildo = new Pessoa("Rosildo",50.3);
        Comida arroz = new Comida("Arroz",0.250);
        Comida feijao = new Comida("Feijão",0.200);
        Comida carne = new Comida("Carne",0.350);
        Comida frango = new Comida("Frango",0.375);

        carlos.comer(carne,arroz);
        rafaela.comer(frango);
        rosildo.comer(arroz,feijao,carne);
    }
}
/*
*crie 3 classes, 1 classe pessoa, 1 classe comida, 1 classe jantar
* jantar será a main.
* Classe pessoa vai ter nome e peso
* Além do nome e peso, vai ter o método comer
* o método comer vai receber como parametro outro objeto da classe comida
* a classe comida também vai ter o nome da comida e o peso da comida
* quando o objeto for passado para o método comer da classe pessoa,
* o peso da comida será acrescentado ao peso da pessoa, de tal forma que quando chamarmos
* o método comer passando a instância de comida, o peso da comida será acrescentado ao peso da pessoa
* No final mostrar no console o nome da pessoa e o peso antes e depois
*/
