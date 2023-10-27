package book4u;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Historial extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JButton button1;

    public Historial() {
        // Configurar el frame
        setTitle("Historial");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Usamos un diseño absoluto para posicionar los paneles manualmente
        this.setLocationRelativeTo(null);
        String colorfondo = "#579514";
        Color backgroundColor = Color.decode(colorfondo);
        this.getContentPane().setBackground(backgroundColor);
        
        ImageIcon imagen = new ImageIcon("Logo.png");
        JLabel label = new JLabel(imagen);
        label.setBounds( 10, 10, 10, 10);
        
        // Crear los paneles
        panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel1.setBounds(0, 0, 1200, 180); // Posición y tamaño
        panel1.add(label);
        
        panel2 = new JPanel();
        panel2.setBackground(Color.BLACK);
        panel2.setBounds(30, 200, 1125, 540);

        panel3 = new JPanel();
        panel3.setBackground(Color.WHITE);
        panel3.setBounds(30, 200, 1125, 100);
        this.toFront();

        panel4 = new JPanel();
        panel4.setBackground(Color.YELLOW);
        panel4.setBounds(0, 0, 0, 0);
        
       
        ImageIcon iniciarsesion = new ImageIcon("botonMenu.png"); 

        button1 = new JButton(iniciarsesion);
        button1.setBounds(1050, 25, 100, 100);
        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.setBackground(Color.WHITE);
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Agregar aquí el código para volver a la clase "Menu"
                dispose(); // Cierra la ventana actual
              //  new Menu(); // Crea una nueva instancia de la clase "Menu" (ajusta esto según tu implementación)
            }
        });
        
        
       
        
        // Agregar los paneles al frame
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(button1);

        // Mostrar el frame
        setVisible(true);
    }

    public static void main(String[] args) {
        Historial historial = new Historial();
    }
}
