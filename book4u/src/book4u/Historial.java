package book4u;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Historial extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
   

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
        label.setBounds(10, 10, 10, 10);

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
        
        ImageIcon back = new ImageIcon("back.png");
        JButton but = new JButton(back);
        but.setBounds(10, 90, 30, 30);
        but.setFont(Registro.fuente1);
        but.setFocusPainted(false);
        but.setBorderPainted(false);
        but.setContentAreaFilled(false);
        this.add(but);
        but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            	Pantalla_principal pat = new Pantalla_principal();
            }
        });

    

        panel4 = new JPanel();
        panel4.setBackground(Color.YELLOW);
        panel4.setBounds(0, 0, 0, 0);

        

        // Agregar los paneles al frame
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        

        // Mostrar el frame
        setVisible(true);

        // Recuperar y mostrar los datos desde la base de datos
        retrieveAndDisplayData();
    }

    private void retrieveAndDisplayData() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.3.26:1521:xe", "23_24_DAM2_BROTATO", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT IDRESERVA, DIA, LUGAR, PRECIO, PAIS, DIA_SALIDA FROM RESERVAS");

            boolean hasData = false;

            while (resultSet.next()) {
                String idReserva = resultSet.getString("IDRESERVA");
                String dia = resultSet.getString("DIA");
                String lugar = resultSet.getString("LUGAR");
                String precio = resultSet.getString("PRECIO");
                String pais = resultSet.getString("PAIS");
                String diaSalida = resultSet.getString("DIA_SALIDA");

                // Crear etiquetas para cada columna y agregarlas al panel2
                Font font = new Font("Agency FB", Font.BOLD, 23); // Puedes ajustar la fuente y el tamaño según tus preferencias
                JLabel dataLabel = new JLabel("DIA: " + dia + ", LUGAR: " + lugar + ", PRECIO: " + precio + ", PAIS: " + pais + ", DIA_SALIDA: " + diaSalida);
                dataLabel.setFont(font); // Establecer la fuente y el tamaño
                panel2.add(dataLabel);
                dataLabel.setForeground(Color.white);
                hasData = true;

            }

            resultSet.close();
            statement.close();
            connection.close();

            if (!hasData) {
                JLabel noDataLabel = new JLabel("No hay datos disponibles todavía.");
                noDataLabel.setForeground(Color.white);
                panel2.add(noDataLabel);
            }

            // Actualizar el panel para reflejar los cambios
            panel2.revalidate();
            panel2.repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        Historial historial = new Historial();
    }
}
