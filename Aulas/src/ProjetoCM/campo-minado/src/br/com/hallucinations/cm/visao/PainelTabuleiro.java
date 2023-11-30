package br.com.hallucinations.cm.visao;

import br.com.hallucinations.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {
    public PainelTabuleiro(Tabuleiro tabuleiro){
        setLayout(new GridLayout(tabuleiro.getLinhas(),tabuleiro.getColunas()));

        int total = tabuleiro.getLinhas()*tabuleiro.getColunas();
        for (int i = 0; i<total; i++){add(new BotaoCampo(null));
        }
    }
}
