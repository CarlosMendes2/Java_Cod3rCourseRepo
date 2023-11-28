package I_Tratamento_de_Erros;

import java.util.Objects;

public class Aluno {

    public final String nome;
    public final double nota;
    public final boolean bomComportamento;
    public Aluno(String nome, double nota){
        this(nome,nota,true);
    }

    public Aluno(String nome, double nota, boolean comportamento){
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = comportamento;
    }

    public String toString(){
        return nome;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Double.compare(aluno.nota, nota) == 0 && bomComportamento == aluno.bomComportamento && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }
}
