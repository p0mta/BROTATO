package book4u;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class pantalla_reserva extends JFrame {
    public pantalla_reserva() {
        setTitle("Reserva de lugares residenciales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);

        String colorFondo = "#579514";
        Color backgroundColor = Color.decode(colorFondo);
        getContentPane().setBackground(backgroundColor);

        JPanel panelBlanco = new JPanel();
        panelBlanco.setBounds(0, 0, 800, 75);
        panelBlanco.setVisible(true);
        panelBlanco.setBackground(Color.WHITE);
        panelBlanco.setLayout(null);
        add(panelBlanco);

        JLabel tit = new JLabel("PANTALLA RESERVA");
        tit.setFont(Registro.fuente);
        tit.setBounds(225, 0, 400, 75);
        panelBlanco.add(tit);

        ImageIcon imagen = new ImageIcon("logo.png");
        JLabel label = new JLabel(imagen);
        label.setBounds(0, 0, 150, 100);
        panelBlanco.add(label);
        
        ImageIcon back = new ImageIcon("back.png");
        JButton but = new JButton(back);
        but.setBounds(10, 90, 30, 30);
        but.setFont(Registro.fuente1);
        but.setFocusPainted(false);
        but.setBorderPainted(false);
        but.setContentAreaFilled(false);
        this.add(but);

        JLabel lugarLabel = new JLabel("Lugar Residencial:");
        lugarLabel.setBounds(200, 150, 150, 30);
        add(lugarLabel);
        lugarLabel.setFont(Registro.fuente1);

        String[] lugaresResidenciales = {"Casa", "Apartamento", "Cabaña","Hotel"};
        JComboBox<String> combi = new JComboBox<>(lugaresResidenciales);
        combi.setBounds(350, 150, 200, 30);
        combi.setFont(Registro.fuente2);
        combi.setBackground(Color.WHITE);
        combi.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        add(combi);

        JLabel paisLabel = new JLabel("País:");
        paisLabel.setBounds(200, 200, 150, 30);
        add(paisLabel);
        paisLabel.setFont(Registro.fuente1);

        String[] paises = {"Dubai", "Japon", "Corea","Francia","Russia","Italia","Grecia","Colombia","Mexico","Irlanda","Alemania", };
        JComboBox<String> paisCombo = new JComboBox<>(paises);
        paisCombo.setBounds(350, 200, 200, 30);
        paisCombo.setFont(Registro.fuente2);
        paisCombo.setBackground(Color.WHITE);
        paisCombo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
     
        add(paisCombo);

        JLabel fechaLabel = new JLabel("Fecha de Reserva:");
        fechaLabel.setBounds(200, 250, 150, 30);
        add(fechaLabel);
        fechaLabel.setFont(Registro.fuente1);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(350, 250, 200, 30);
        add(dateChooser);
        dateChooser.setBackground(Color.WHITE);
        dateChooser.setFont(Registro.fuente2);
        dateChooser.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel precioLabel = new JLabel("Precio de la reserva: $0.00");
        precioLabel.setBounds(200, 300, 350, 30);
        add(precioLabel);
        precioLabel.setFont(Registro.fuente1);

        JButton calcularPrecioButton = new JButton("Calcular Precio");
        calcularPrecioButton.setBounds(200, 350, 150, 30);
        add(calcularPrecioButton);
        calcularPrecioButton.setFont(Registro.fuente1);
        calcularPrecioButton.setBackground(Color.white);
        calcularPrecioButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        calcularPrecioButton.addActionListener(e -> {
            String lugarResidencial = (String) combi.getSelectedItem();
            String pais = (String) paisCombo.getSelectedItem();
            Date selectedDate = dateChooser.getDate();
            Date today = new Date();  // Fecha actual

            if (selectedDate.before(today)) {
                JOptionPane.showMessageDialog(null, "No se puede reservar para una fecha anterior al día actual", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Aquí calcularías el precio según los datos seleccionados
                precioLabel.setText("Precio de la reserva en " + pais + ": $XXX.XX"); // Reemplaza XXX.XX con el precio real
            }
        });
    
    but.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	dispose();
        	Pantalla_principal pat = new Pantalla_principal();
        }
    });

}
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            pantalla_reserva frame = new pantalla_reserva();
        });
    }
    Connection connection = null;{

    try {
        connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.3.26:1521:xe", "23_24_DAM2_BROTATO", "123456");
        System.out.println("Conexión exitosa a la base de datos Oracle.");
        // Puedes realizar consultas y otras operaciones con 'connection' aquí
    } catch (SQLException e) {
        System.err.println("Error al conectar a la base de datos: " + e.getMessage());
    } finally {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    
    }



    
}
