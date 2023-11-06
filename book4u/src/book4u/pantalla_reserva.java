package book4u;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;

public class pantalla_reserva extends JFrame {
    public pantalla_reserva() {
        setTitle("Reserva de lugares residenciales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        String colorFondo = "#579514";
        Color backgroundColor = Color.decode(colorFondo);
        getContentPane().setBackground(backgroundColor);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);

        ImageIcon imagen = new ImageIcon("logo.png");
        JLabel label = new JLabel(imagen);
        label.setPreferredSize(new Dimension(450, 100));
        
        String[] lugaresResidenciales = {"Casa", "Apartamento", "Cabaña"};
        JComboBox<String> lugarResidencialCombo = new JComboBox<>(lugaresResidenciales);

        JDateChooser dateChooser = new JDateChooser();

        JLabel precioLabel = new JLabel("Precio de la reserva: $0.00");

        JButton calcularPrecioButton = new JButton("Calcular Precio");

        calcularPrecioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lugarResidencial = lugarResidencialCombo.getSelectedItem().toString();
                java.util.Date selectedDate = dateChooser.getDate();
                // Aquí calcularías el precio según los datos seleccionados

                precioLabel.setText("Precio de la reserva: $XXX.XX"); // Reemplaza XXX.XX con el precio real
            }
        });

        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        add(label);
        add(new JLabel("Lugar Residencial:"));
        add(lugarResidencialCombo);
        add(new JLabel("Fecha de Reserva:"));
        add(dateChooser);
        add(calcularPrecioButton);
        add(precioLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	pantalla_reserva frame = new pantalla_reserva();
                frame.setVisible(true);
            }
        });
    }
}
