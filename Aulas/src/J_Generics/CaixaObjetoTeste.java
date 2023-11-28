package J_Generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {

        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3);

        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);

    }
}

// Já que nem sempre essa conversão vai ser ocorrida, há possibilidade de não ser passado  o valor
// esperado o java faz necessário o casting