package C_ClassesMetodos.DesafioDoModulo;

public class Pessoa {
    String nome;
    double peso;
    Pessoa(){

    }
    Pessoa(String n, double p){
        this.nome = n;
        this.peso = p;
    }
    void comer(Comida c){
         System.out.printf("%s comeu %s | peso inicial = %.2f | peso final = %.2f\n",nome,c.nome,peso,peso+c.peso);
    }
    void comer(Comida c, Comida b, Comida a){
        System.out.printf("%s comeu %s,%s e %s | peso inicial = %.2f | peso final = %.2f\n",nome,c.nome,b.nome,a.nome,peso,peso+c.peso+b.peso+a.peso);
    }
    void comer(Comida c, Comida b){
        System.out.printf("%s comeu %s e %s | peso inicial = %.2f | peso final = %.2f\n",nome,c.nome,b.nome,peso,peso+c.peso+b.peso);
    }

        // p.comer(comida)
}
