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
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        this.setLayout(null); // Usamos un diseño absoluto para posicionar los paneles manualmente
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        String colorfondo = "#579514";
        Color backgroundColor = Color.decode(colorfondo);
        this.getContentPane().setBackground(backgroundColor);

        ImageIcon imagen = new ImageIcon("Logo.png");
        JLabel label = new JLabel(imagen);
        label.setBounds(525, -10, 150, 150);

        // Crear los paneles
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.WHITE);
        panel1.setBounds(0, 0, 1200, 100); // Posición y tamaño
        panel1.add(label);

        panel2 = new JPanel();
        panel2.setBackground(Color.BLACK);
        panel2.setBounds(30, 200, 1125, 540);
        panel2.setLayout(null);

        panel3 = new JPanel();
        panel3.setBackground(Color.WHITE);
        panel3.setBounds(30, 200, 1125, 100);
        this.toFront();
        
        ImageIcon back = new ImageIcon("back.png");
        JButton but = new JButton(back);
        but.setBounds(10, 120, 30, 30);
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
        JLabel dataLabel1 = new JLabel("DIA D'ENTRADA                         LUGAR                         PRECIO                         PAIS                         DIA_SALIDA " );
        dataLabel1.setBounds(40, 170, 850, 30);
        this.add(dataLabel1);
        dataLabel1.setFont(Registro.fuente1);
        // Recuperar y mostrar los datos desde la base de datos
        retrieveAndDisplayData();
    }

    private void retrieveAndDisplayData() {
        try {
            
            Statement statement = Login.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT IDRESERVA, DIA, LUGAR, PRECIO, PAIS, DIA_SALIDA FROM RESERVAS WHERE CORREO = '"+Login.usernameField.getText()+"'");

            boolean hasData = false;

            while (resultSet.next()) {
            	Date fecha = resultSet.getDate("DIA");
            	Date today = new Date();
            	if(fecha.before(today)) {
            		 String idReserva = resultSet.getString("IDRESERVA");                
                     String lugar = resultSet.getString("LUGAR");
                     String precio = resultSet.getString("PRECIO");
                     String pais = resultSet.getString("PAIS");
                     Date diaSalida = resultSet.getDate("DIA_SALIDA");
                     SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                     String diaFormateado = dateFormat.format(fecha);
                     
                     SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
                     String diaFormateado1 = dateFormat1.format(diaSalida);
                     
                     // Crear etiquetas para cada columna y agregarlas al panel2
                     Font font = new Font("Agency FB", Font.BOLD, 23);
                     JLabel dataLabel = new JLabel(diaFormateado);
                     
                     // Ajustar la posición vertical de cada etiqueta
                     int labelHeight = 30; // Altura estimada de cada etiqueta
                     int labelSpacing = 10; // Espacio entre etiquetas
                     int yPosition = (resultSet.getRow() - 1) * (labelHeight + labelSpacing);
                     
                     dataLabel.setBounds(10, yPosition, 150, labelHeight);
                     dataLabel.setFont(font);
                     
                     ImageIcon moni = new ImageIcon("moneda.gif");
                     JLabel lugar1 = new JLabel(lugar);

                  
                     int labelHeight1 = 30; // Altura estimada de cada etiqueta
                     int labelSpacing1 = 10; // Espacio entre etiquetas
                     int yPosition1 = (resultSet.getRow() - 1) * (labelHeight1 + labelSpacing1);
                     
                     lugar1.setBounds(245, yPosition1, 150, labelHeight1);
                     lugar1.setFont(font);
                     
                     
                     JLabel precio1 = new JLabel(precio);
                     int labelHeight2 = 30; // Altura estimada de cada etiqueta
                     int labelSpacing2 = 10; // Espacio entre etiquetas
                     int yPosition2 = (resultSet.getRow() - 1) * (labelHeight2 + labelSpacing2);
                     
                     precio1.setBounds(400, yPosition2, 150, labelHeight2);
                     precio1.setFont(font);
                     
                     
                     precio1.setIcon(moni);
                     
                     JLabel pais1 = new JLabel(pais);
                     int labelHeight3 = 30; // Altura estimada de cada etiqueta
                     int labelSpacing3 = 10; // Espacio entre etiquetas
                     int yPosition3 = (resultSet.getRow() - 1) * (labelHeight3 + labelSpacing3);
                     
                     pais1.setBounds(595, yPosition3, 150, labelHeight3);
                     pais1.setFont(font);
                     
                     JLabel diasalida = new JLabel(diaFormateado1);
                     int labelHeight4 = 30; // Altura estimada de cada etiqueta
                     int labelSpacing4 = 10; // Espacio entre etiquetas
                     int yPosition4 = (resultSet.getRow() - 1) * (labelHeight4 + labelSpacing4);
                     
                     diasalida.setBounds(755, yPosition4, 150, labelHeight4);
                     diasalida.setFont(font);
                     
                     
                     
                     panel2.add(lugar1);
                     panel2.add(dataLabel);
                     panel2.add(precio1);
                     panel2.add(pais1);
                     panel2.add(diasalida);
                     dataLabel.setForeground(Color.white);
                     lugar1.setForeground(Color.white);
                     precio1.setForeground(Color.white);
                     pais1.setForeground(Color.white);
                     diasalida.setForeground(Color.white);
                     hasData = true;
            	}   
            }

            resultSet.close();
            statement.close();
           

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

}
