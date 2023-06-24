import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;


public class Ventana extends JFrame {
    public Ventana (){
        this.setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Editor de texto con Java");
        setLocationRelativeTo(null);
        inicializarComponentes();
    }
    private void inicializarComponentes (){
        JPanel panel = new JPanel(null, false);
        panel.setBackground(new Color(51, 51, 51));
        this.getContentPane().add(panel);
    }
}


