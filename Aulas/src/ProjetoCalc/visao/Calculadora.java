package ProjetoCalc.visao;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    
    public Calculadora(){
        organizarLayout();
        setSize(232,322);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // DISPOSE_ON_CLOSE finaliza a tela atual.
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizarLayout() {
        setLayout( new BorderLayout());
        Display display = new Display();
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}

// Como eu estou herdando JFrame não preciso ficar mandando JFrame.EXIT_ON_CLOSE
// EXIT_ON_CLOSE fecha a aplicação.
// setLocaleRelativeTo é onde ele vai inicializar na tela, null centraliza no meio da tela.