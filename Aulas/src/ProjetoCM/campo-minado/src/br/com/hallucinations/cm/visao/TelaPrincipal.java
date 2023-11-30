package br.com.hallucinations.cm.visao;

import br.com.hallucinations.cm.modelo.Tabuleiro;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal(){
        Tabuleiro tabuleiro = new Tabuleiro(16,30,50);
        add( new PainelTabuleiro(tabuleiro));
        setTitle("Campo Minado");
        setSize(690,438);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
