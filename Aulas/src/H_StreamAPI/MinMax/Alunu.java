package H_StreamAPI.MinMax;

public class Alunu {

    final String nome;
    final double nota;
    final boolean bomComportamento;
    public Alunu(String nome, double nota){
        this(nome,nota,true);
    }

    public Alunu(String nome, double nota, boolean comportamento){
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = comportamento;
    }

    public String toString(){
        return nome + " tem nota "+nota;
    }
}
