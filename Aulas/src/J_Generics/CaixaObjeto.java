package J_Generics;

public class CaixaObjeto {
    //Sem Generics

    private Object coisa;

    public void guardar(Object coisa){
        this.coisa =  coisa;
    }

    public Object abrir(){
        return coisa;
    }

}
