package A_Fundamentos;

public class ConversaoDeTipos {
	public static void main(String[] args) {

    // Aula 22
//		double a = 1;
//		System.out.println(a);
//
//		float b = 1.0;
//		System.out.println(b);
//
//		float f = (float)1.12345678987654321; // maneira explícita
//		System.out.println(f);  //So imprime até 1.1234568 com perda de informação

//		int c = 1350;
//		byte d = (byte)c; // O java não analisa os valores, ele analisa TIPOS
//					// Portanto, tantofodase se o valor é 4 ou 10^6, tem que ter casting.
//		System.out.println(d);
    // Aula 23
    // numero → string
		Integer num1 = 1000;
		System.out.println(num1.toString().length()); // Função disponível apenas p/ Strings


//
//		int num2 = 100000;
//		System.out.println(Integer.toString(num2).length());
    // Aula 24
    // string → numero;

//		String valor1= JOptionPane.showInputDialog(
//				"Digite o primeiro numero");
//		String valor2= JOptionPane.showInputDialog(
//				"Digite o segundo numero");
//		System.out.println(valor1+valor2);
//		double numero1 = Double.parseDouble(valor1);
//		double numero2 = Double.parseDouble(valor2);
//
//		double soma = numero1+numero2;
//		System.out.println(soma);

		//BigDecimal é o tipo com maior precisão para uma operação.


	}
}