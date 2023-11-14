package book4u;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class pantalla_reserva extends JFrame {
    public pantalla_reserva() throws SQLException {
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
        
        JButton reservarButton = new JButton("Reservar");
        reservarButton.setBounds(400, 400, 150, 30);
        add(reservarButton);
        reservarButton.setFont(Registro.fuente1);
        reservarButton.setBackground(Color.white);
        reservarButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));


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
        lugarLabel.setBounds(165, 150, 150, 30);
        add(lugarLabel);
        lugarLabel.setFont(Registro.fuente1);

        String[] lugaresResidenciales = {"Casa", "Apartamento", "Cabaña","Hotel"};
        JComboBox<String> combi = new JComboBox<>(lugaresResidenciales);
        combi.setBounds(310, 150, 200, 30);
        combi.setFont(Registro.fuente2);
        combi.setBackground(Color.WHITE);
        combi.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        add(combi);

        JLabel paisLabel = new JLabel("País:");
        paisLabel.setBounds(250, 200, 150, 30);
        add(paisLabel);
        paisLabel.setFont(Registro.fuente1);

        String[] paises = {"Dubai", "Japon", "Corea","Francia","Russia","Italia","Grecia","Colombia","Mexico","Irlanda","Alemania", };
        JComboBox<String> paisCombo = new JComboBox<>(paises);
        paisCombo.setBounds(310, 200, 200, 30);
        paisCombo.setFont(Registro.fuente2);
        paisCombo.setBackground(Color.WHITE);
        paisCombo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
     
        add(paisCombo);

        JLabel fechaLabel = new JLabel("Fecha de Reserva:");
        fechaLabel.setBounds(125, 250, 150, 30);
        add(fechaLabel);
        fechaLabel.setFont(Registro.fuente1);
        
        JLabel fechaLabel1 = new JLabel("Fecha de Salida:");
        fechaLabel1.setBounds(510, 250, 150, 30);
        add(fechaLabel1);
        fechaLabel1.setFont(Registro.fuente1);
        

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(100, 290, 200, 30);
        add(dateChooser);
        dateChooser.setBackground(Color.WHITE);
        dateChooser.setFont(Registro.fuente2);
        dateChooser.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JDateChooser dateChooser1 = new JDateChooser();
        dateChooser1.setBounds(475, 290, 200, 30);
        add(dateChooser1);
        dateChooser1.setBackground(Color.WHITE);
        dateChooser1.setFont(Registro.fuente2);
        dateChooser1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            	Pantalla_principal pat = new Pantalla_principal();
            }
        });
        

        
        JLabel precioLabel = new JLabel("Precio de la reserva: $0.00");
        precioLabel.setBounds(250, 350, 350, 30);
        add(precioLabel);
        precioLabel.setFont(Registro.fuente1);

        JButton calcularPrecioButton = new JButton("Calcular Precio");
        calcularPrecioButton.setBounds(200, 400, 150, 30);
        add(calcularPrecioButton);
        calcularPrecioButton.setFont(Registro.fuente1);
        calcularPrecioButton.setBackground(Color.white);
        calcularPrecioButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        reservarButton.addActionListener(e -> {
            String lugarResidencial = (String) combi.getSelectedItem();
            String pais = (String) paisCombo.getSelectedItem();
            Date selectedDate = dateChooser.getDate();
            Date selectedDate2 = dateChooser1.getDate();
            Date today = new Date();  // Fecha actual

            if (selectedDate == null || selectedDate2 == null) {
                JOptionPane.showMessageDialog(pantalla_reserva.this, "Por favor, completa todas las fechas.");
            return;
            } else if (selectedDate.before(today)) {
                JOptionPane.showMessageDialog(null, "No se puede reservar para una fecha anterior al día actual", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            } else if (selectedDate2.before(selectedDate)) {
                JOptionPane.showMessageDialog(null, "La fecha de salida no puede ser anterior a la fecha de reserva", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            } else {
                try {
                    // Insertar datos en la tabla de reservas
                    String query = "INSERT INTO reservas (dia, lugar, precio, pais,dia_salida) VALUES (?, ?, ?, ?,?)";
                    try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                        preparedStatement.setDate(1, new java.sql.Date(selectedDate.getTime()));
                        preparedStatement.setString(2, lugarResidencial);
                        preparedStatement.setDouble(3, calcularPrecio(combi, paisCombo, dateChooser, dateChooser1));
                        preparedStatement.setString(4, pais);
                        preparedStatement.setDate(5, new java.sql.Date(selectedDate2.getTime()));
                    

                        preparedStatement.executeUpdate();
                    }

                    // Otros pasos si es necesario

                    precioLabel.setText("Precio de la reserva en " + pais + ": " + calcularPrecio(combi, paisCombo, dateChooser, dateChooser1) + "");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        calcularPrecioButton.addActionListener(e -> {
           
			String lugarResidencial = (String) combi.getSelectedItem();
            
			String pais = (String) paisCombo.getSelectedItem();
            
			Date selectedDate = dateChooser.getDate();
   
			Date selectedDate2 = dateChooser1.getDate();
            Date today = new Date();  // Fecha actual
            
            if(selectedDate == null) {
            	JOptionPane.showMessageDialog(pantalla_reserva.this, "Por favor, completa todos los campos.");
            	return;
            }
          if (selectedDate2.before(selectedDate)) {
            JOptionPane.showMessageDialog(null, "La fecha de salida no puede ser anterior a la fecha de reserva", "Error", JOptionPane.ERROR_MESSAGE);
            	return;
            }
            if (selectedDate.before(today)) {
                JOptionPane.showMessageDialog(null, "No se puede reservar para una fecha anterior al día actual", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                precioLabel.setText("Precio de la reserva en " + pais + ": "+calcularPrecio(combi, paisCombo, dateChooser, dateChooser1)+"");
            }
            });}
    
    
       
    
    
    private double calcularPrecio(JComboBox<String> combi, JComboBox<String> paisCombo, JDateChooser dateChooser, JDateChooser dateChooser1) {
        Date selectedDate = dateChooser.getDate();
        Date selectedDate2 = dateChooser1.getDate();
        String lugarResidencial = (String) combi.getSelectedItem();
        String pais = (String) paisCombo.getSelectedItem();

        // Lógica para calcular el precio basado en lugar residencial y país
        double precioBase = 100.0;  // Precio base, puedes ajustarlo según tus necesidades

        switch (lugarResidencial) {
            case "Casa":
                precioBase += 50.0;  // Puedes ajustar el incremento/decremento según el tipo de lugar
                break;
            case "Apartamento":
                precioBase += 30.0;
                break;
            case "Cabaña":
                precioBase += 40.0;
                break;
            case "Hotel":
                precioBase += 80.0;
                break;
            // Puedes agregar más casos según sea necesario
        }

        // Ajustes adicionales basados en el país
        switch (pais) {
            case "Dubai":
                precioBase *= 2;  // Ajuste según el país
                break;
            case "Japon":
                precioBase *= 1.8;
                break;
            case "Corea":
                precioBase *= 1.7;
                break;
            case "Francia":
                precioBase *= 1.2;
                break;
            case "Russia":
                precioBase *= 1.5;
                break;
            case "Italia":
                precioBase *= 1.1;
                break;
            case "Grecia":
                precioBase *= 1.4;
                break;
            case "Colombia":
                precioBase *= 1.3;
                break;
            case "Mexico":
                precioBase *= 1.9;
                break;
            case "Irlanda":
                precioBase *= 1.4;
                break;
            case "Alemania":
                precioBase *= 1.25;
                break;
            }
			
        long diferenciaMillis = selectedDate2.getTime() - selectedDate.getTime();
        long diferenciaDias = TimeUnit.MILLISECONDS.toDays(diferenciaMillis);

        // Ajustar el precio según la duración de la reserva
        precioBase += 50.0 * diferenciaDias;  // Ajusta el 10 según tus necesidades


       

        return precioBase;
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
				pantalla_reserva frame = new pantalla_reserva();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        });
    }
    Connection connection = null;{

    try {
        connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.3.26:1521:xe", "23_24_DAM2_BROTATO", "123456");
        System.out.println("Conexión exitosa a la base de datos Oracle.");
        // Puedes realizar consultas y otras operaciones con 'connection' aquí
    } catch (SQLException e) {
        System.err.println("Error al conectar a la base de datos: " + e.getMessage());
    } 
    

    
    }



    
}
