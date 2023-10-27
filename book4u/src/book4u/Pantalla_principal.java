
package book4u;

import javax.swing.*;
import java.awt.*;

public class Pantalla_principal extends JFrame {
    public Pantalla_principal() {
        // Establece el título de la ventana
        setTitle("Pantalla Principal");

        // Configura el color de fondo
        String colorfondo = "#579514";
        Color backgroundColor = Color.decode(colorfondo);

        // Establece el color de fondo de la ventana
        this.getContentPane().setBackground(backgroundColor);

        // Establece el diseño de la ventana
        setLayout(new BorderLayout());

        // Crea un JPanel blanco en la parte superior
        JPanel barraBlanca = new JPanel();
        barraBlanca.setBackground(Color.WHITE);
        int alturaPantalla = Toolkit.getDefaultToolkit().getScreenSize().height;
        barraBlanca.setPreferredSize(new Dimension(alturaPantalla / 5, 0));
        add(barraBlanca, BorderLayout.NORTH);

        // Crea un JPanel verde con el mismo color de fondo
        JPanel panelVerde = new JPanel();
        panelVerde.setBackground(backgroundColor);
        add(panelVerde, BorderLayout.CENTER);

        // Establece el tamaño de la ventana y la operación de cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600); // Tamaño predeterminado
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Pantalla_principal();
        });
    }
}


   