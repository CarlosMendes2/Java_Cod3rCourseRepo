package A_Fundamentos;

import javax.swing.*;

public class DesafioCapituloCalculadora {
    public static void main(String[] args) {
        // .equal → operador de string
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        String operacao = JOptionPane.showInputDialog("Digite a operação");

        double resultado = "+".equals(operacao) ? num1+num2 : 0;
        resultado = "-".equals(operacao) ? num1-num2 : resultado;
        resultado = "*".equals(operacao) ? num1*num2 : resultado;
        resultado = "/".equals(operacao) ? num1/num2 : resultado;
        resultado = "%".equals(operacao) ? num1%num2 : resultado;

        System.out.printf("%.0f %s %.0f = %.2f",num1,operacao,num2,resultado);


    }
    // Ler num1
    // Ler num2
    // ler a operação + - * / %
    // Realizar a operação do num1 com num2
}
