package book4u;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class reservas extends JFrame {
	
	JPanel panel2 = new JPanel();
	public reservas() {
		setSize(1200,800);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		String colorfondo = "#579514";
        Color backgroundColor = Color.decode(colorfondo);
        this.getContentPane().setBackground(backgroundColor);
        JPanel pan = new JPanel();
        pan.setBounds(0, 0, 1200, 75);
        pan.setVisible(true);
        pan.setBackground(Color.WHITE);
        pan.setLayout(null);
        this.add(pan);
        panel2 = new JPanel();
        panel2.setBackground(Color.BLACK);
        panel2.setBounds(30, 130, 1125, 600);
        panel2.setLayout(null);
        JLabel tit = new JLabel("RESERVAS");
        tit.setHorizontalAlignment(JLabel.CENTER);
        tit.setFont(Registro.fuente);
        tit.setBounds(375, 0, 400, 75);
        pan.add(tit);
        JLabel dataLabel1 = new JLabel("DIA D'ENTRADA                              LUGAR                              PRECIO                              PAIS                              DIA_SALIDA " );
        dataLabel1.setBounds(100, 90, 1000, 30);
        this.add(dataLabel1);
        dataLabel1.setFont(Registro.fuente1);
        retrieveAndDisplayData();
		
        this.add(panel2);
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
		this.setVisible(true);
	}
	private void retrieveAndDisplayData() {
        try {
            
            Statement statement = Login.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT IDRESERVA, DIA, LUGAR, PRECIO, PAIS, DIA_SALIDA FROM RESERVAS");

            boolean hasData = false;

            while (resultSet.next()) {
                String idReserva = resultSet.getString("IDRESERVA");
                Date fecha = resultSet.getDate("DIA");
                String lugar = resultSet.getString("LUGAR");
                String precio = resultSet.getString("PRECIO");
                String pais = resultSet.getString("PAIS");
                Date diaSalida = resultSet.getDate("DIA_SALIDA");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String diaFormateado = dateFormat.format(fecha);
                String diasalida = dateFormat.format(diaSalida);
                
                // Crear etiquetas para cada columna y agregarlas al panel2
                Font font = new Font("Agency FB", Font.BOLD, 23);
                JLabel dataLabel = new JLabel(diaFormateado);
                
                // Ajustar la posición vertical de cada etiqueta
                int labelHeight = 30; // Altura estimada de cada etiqueta
                int labelSpacing = 10; // Espacio entre etiquetas
                int yPosition = (resultSet.getRow() - 1) * (labelHeight + labelSpacing);
                
                dataLabel.setBounds(70, yPosition, 150, labelHeight);
                dataLabel.setFont(font);
                
                ImageIcon moni = new ImageIcon("moneda.gif");
                JLabel lugar1 = new JLabel(lugar);

             
                int labelHeight1 = 30; // Altura estimada de cada etiqueta
                int labelSpacing1 = 10; // Espacio entre etiquetas
                int yPosition1 = (resultSet.getRow() - 1) * (labelHeight1 + labelSpacing1);
                
                lugar1.setBounds(330, yPosition1, 150, labelHeight1);
                lugar1.setFont(font);
                
                
                JLabel precio1 = new JLabel(precio);
                int labelHeight2 = 30; // Altura estimada de cada etiqueta
                int labelSpacing2 = 10; // Espacio entre etiquetas
                int yPosition2 = (resultSet.getRow() - 1) * (labelHeight2 + labelSpacing2);
                
                precio1.setBounds(510, yPosition2, 150, labelHeight2);
                precio1.setFont(font);
                precio1.setIcon(moni);
                
                JLabel pais1 = new JLabel(pais);
                int labelHeight3 = 30; // Altura estimada de cada etiqueta
                int labelSpacing3 = 10; // Espacio entre etiquetas
                int yPosition3 = (resultSet.getRow() - 1) * (labelHeight3 + labelSpacing3);
                
                pais1.setBounds(730, yPosition3, 150, labelHeight3);
                pais1.setFont(font);
                
                JLabel salida = new JLabel(diasalida);
                int labelHeight4 = 30; // Altura estimada de cada etiqueta
                int labelSpacing4 = 10; // Espacio entre etiquetas
                int yPosition4 = (resultSet.getRow() - 1) * (labelHeight4 + labelSpacing4);
                
                salida.setBounds(910, yPosition4, 150, labelHeight4);
                salida.setFont(font);
                
                panel2.add(salida);
                panel2.add(pais1);
                panel2.add(lugar1);
                panel2.add(dataLabel);
                panel2.add(precio1);
                salida.setForeground(Color.white);
                pais1.setForeground(Color.white);
                dataLabel.setForeground(Color.white);
                lugar1.setForeground(Color.white);
                precio1.setForeground(Color.white);
                hasData = true;
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
