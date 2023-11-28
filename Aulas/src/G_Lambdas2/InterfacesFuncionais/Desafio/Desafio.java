package G_Lambdas2.InterfacesFuncionais.Desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;


/*
 * 1. A partir do produto calcular o preço real (com desconto)
 * 2. Imposto Municipal: >= 2500 (8,5% ) | <2500 (isento)
 * 3. Frete: >= 3000(100) | < 3000 (50)
 * 4. Arredondar: Deixar duas casas decimais
 * 5. Formatar: R$ 1234,56
 */
public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("Ipad",3235.89,0.13);

        Function<Produto,Double> precoReal = a -> {
            Double preco = a.preco - (a.preco * a.desconto);
            return preco;};

        UnaryOperator<Double> impostoMunicipal = valor -> valor>=2500.0? valor+(valor*0.085):valor;

        UnaryOperator<Double> frete = valor -> valor>=3000? valor+100:valor+50;

        UnaryOperator<Double> arredonda = valor -> Math.round(valor*100.0)/100.0;
                                                    // Double.parseDouble(String.format("%.2f",valor))

        Function<Double,String> formata = valor -> "R$"+valor;

        System.out.println(precoReal.andThen(impostoMunicipal).andThen(frete).andThen(arredonda).andThen(formata).apply(p));


    }
}


// 3000 - (3000*0.15)