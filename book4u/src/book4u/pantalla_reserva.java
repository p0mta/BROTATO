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
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class pantalla_reserva extends JFrame {
	private Map<String, String> imagenesPorPaisYLugar = new HashMap<>();
    public pantalla_reserva() throws SQLException {
        setTitle("Reserva de lugares residenciales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        this.setUndecorated(true);
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
        
        
        
        imagenesPorPaisYLugar.put("DubaiCasa".toLowerCase(), "casadubai.jpg");
        imagenesPorPaisYLugar.put("JaponCasa".toLowerCase(), "JC.jpg");
        imagenesPorPaisYLugar.put("CoreaCasa".toLowerCase(), "CC.jpg");
        imagenesPorPaisYLugar.put("FranciaCasa".toLowerCase(), "FC.jpg");
        imagenesPorPaisYLugar.put("RusiaCasa".toLowerCase(), "RC1.jpg");
        imagenesPorPaisYLugar.put("ItaliaCasa".toLowerCase(), "IC.jpg");
        imagenesPorPaisYLugar.put("GreciaCasa".toLowerCase(), "GC.jpg");
        imagenesPorPaisYLugar.put("ColombiaCasa".toLowerCase(), "CA.jpg");
        imagenesPorPaisYLugar.put("MexicoCasa".toLowerCase(), "MC.jpg");
        imagenesPorPaisYLugar.put("IrlandaCasa".toLowerCase(), "IA.jpg");
        imagenesPorPaisYLugar.put("AlemaniaCasa".toLowerCase(), "CAT.jpg");
        
        imagenesPorPaisYLugar.put("DubaiApartamento".toLowerCase(), "DA.jpg");
        imagenesPorPaisYLugar.put("JaponApartamento".toLowerCase(), "JA.jpg");
        imagenesPorPaisYLugar.put("CoreaApartamento".toLowerCase(), "CA.jpg");
        imagenesPorPaisYLugar.put("FranciaApartamento".toLowerCase(), "FA.jpg");
        imagenesPorPaisYLugar.put("RusiaApartamento".toLowerCase(), "RA.jpg");
        imagenesPorPaisYLugar.put("ItaliaApartamento".toLowerCase(), "IA.jpg");
        imagenesPorPaisYLugar.put("GreciaApartamento".toLowerCase(), "GA.jpg");
        imagenesPorPaisYLugar.put("ColombiaApartamento".toLowerCase(), "CA1.jpg");
        imagenesPorPaisYLugar.put("MexicoApartamento".toLowerCase(), "MA.jpg");
        imagenesPorPaisYLugar.put("IrlandaApartamento".toLowerCase(), "IA1.jpg");
        imagenesPorPaisYLugar.put("AlemaniaApartamento".toLowerCase(), "AA.jpg");
        
        imagenesPorPaisYLugar.put("DubaiCabaña".toLowerCase(), "DT.jpg");
        imagenesPorPaisYLugar.put("JaponCabaña".toLowerCase(), "JT.jpg");
        imagenesPorPaisYLugar.put("CoreaCabaña".toLowerCase(), "CT.jpg");
        imagenesPorPaisYLugar.put("FranciaCabaña".toLowerCase(), "FT.jpg");
        imagenesPorPaisYLugar.put("RusiaCabaña".toLowerCase(), "RT.jpg");
        imagenesPorPaisYLugar.put("ItaliaCabaña".toLowerCase(), "IT.jpg");
        imagenesPorPaisYLugar.put("GreciaCabaña".toLowerCase(), "GT.jpg");
        imagenesPorPaisYLugar.put("ColombiaCabaña".toLowerCase(), "CT1.jpg");
        imagenesPorPaisYLugar.put("MexicoCabaña".toLowerCase(), "MT.jpg");
        imagenesPorPaisYLugar.put("IrlandaCabaña".toLowerCase(), "IT1.jpg");
        imagenesPorPaisYLugar.put("AlemaniaCabaña".toLowerCase(), "AC.jpg");
        
        imagenesPorPaisYLugar.put("DubaiHotel".toLowerCase(), "DH.jpg");
        imagenesPorPaisYLugar.put("JaponHotel".toLowerCase(), "JH.jpg");
        imagenesPorPaisYLugar.put("CoreaHotel".toLowerCase(), "CH.jpg");
        imagenesPorPaisYLugar.put("FranciaHotel".toLowerCase(), "FH.jpg");
        imagenesPorPaisYLugar.put("RusiaHotel".toLowerCase(), "RH.jpg");
        imagenesPorPaisYLugar.put("ItaliaHotel".toLowerCase(), "IH.jpg");
        imagenesPorPaisYLugar.put("GreciaHotel".toLowerCase(), "GH.jpg");
        imagenesPorPaisYLugar.put("ColombiaHotel".toLowerCase(), "CH1.jpg");
        imagenesPorPaisYLugar.put("MexicoHotel".toLowerCase(), "MH.jpg");
        imagenesPorPaisYLugar.put("IrlandaHotel".toLowerCase(), "IH1.jpg");
        imagenesPorPaisYLugar.put("AlemaniaHotel".toLowerCase(), "AH.jpg");
 
        
        JLabel imagenLabel = new JLabel();
        imagenLabel.setBounds(550, 50, 200, 200);  // Ajusta la posición y el tamaño según tus necesidades
        add(imagenLabel);
        
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

        String[] paises = {"Dubai", "Japon", "Corea","Francia","Rusia","Italia","Grecia","Colombia","Mexico","Irlanda","Alemania", };
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
            String corr = new String();
            corr = Login.usernameField.getText();
            double precioReserva = calcularPrecio(combi, paisCombo, dateChooser, dateChooser1);
            
            if (selectedDate == null || selectedDate2 == null) {
            	OtrasCosas tra = new OtrasCosas();
            	tra.AG();
            return;
            } else if (selectedDate.before(today)) {
            	OtrasCosas tra = new OtrasCosas();
            	tra.GA();
                
            return;
            } else if (selectedDate2.before(selectedDate)) {
            	OtrasCosas tra = new OtrasCosas();
            	tra.DA();
               
            return;
            } else {
            	 if (verificarSaldoSuficiente(corr, precioReserva)) {
            	try {
                    // Insertar datos en la tabla de reservas
                    String query = "INSERT INTO reservas (dia, lugar, precio, pais, dia_salida,correo) VALUES (?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement preparedStatement = Login.connection.prepareStatement(query)) {
                        preparedStatement.setDate(1, new java.sql.Date(selectedDate.getTime()));
                        preparedStatement.setString(2, lugarResidencial);
                        preparedStatement.setDouble(3, precioReserva);
                        preparedStatement.setString(4, pais);
                        preparedStatement.setDate(5, new java.sql.Date(selectedDate2.getTime()));
                        preparedStatement.setString(6, corr);

                        preparedStatement.executeUpdate();

                        // Restar el precio de la reserva al saldo del usuario
                        String correoUsuario = Login.getUsernameField().getText();  // Ajusta esto según cómo obtienes el correo del usuario
                        pantalla_usuario pantallaUsuario = new pantalla_usuario();
                        pantallaUsuario.dispose();
                        pantallaUsuario.actualizarSaldoDespuesDeReserva(correoUsuario, precioReserva);
                    }

                    // Otros pasos si es necesario

                    precioLabel.setText("Precio de la reserva en " + pais + ": " + calcularPrecio(combi, paisCombo, dateChooser, dateChooser1) + "");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            	 }
            	 else {
            		 OtrasCosas co = new OtrasCosas();
            		 co.saldo();
            		 return;
            	 }
                dispose();
                Pantalla_principal pa = new Pantalla_principal();
            }
        });
        calcularPrecioButton.addActionListener(e -> {
           
			String lugarResidencial = (String) combi.getSelectedItem();
            
			String pais = (String) paisCombo.getSelectedItem();
            
			Date selectedDate = dateChooser.getDate();
   
			Date selectedDate2 = dateChooser1.getDate();
            Date today = new Date();  // Fecha actual
            
            if(selectedDate == null || selectedDate2 == null) {
            	OtrasCosas tra = new OtrasCosas();
            	tra.AG();
            	return;
            }
            
          if (selectedDate2.before(selectedDate)) {
        	  OtrasCosas tra = new OtrasCosas();
          	  tra.GA();
              return;
            }
            if (selectedDate.before(today)) {
            	OtrasCosas tra = new OtrasCosas();
            	tra.DA();
            	return;
            } else {
                precioLabel.setText("Precio de la reserva en " + pais + ": "+calcularPrecio(combi, paisCombo, dateChooser, dateChooser1)+"");
            }
         

            // Obtener la ruta de la imagen correspondiente
            String rutaImagen = imagenesPorPaisYLugar.get((pais + lugarResidencial).toLowerCase());
            


            // Verificar si la ruta de la imagen existe y mostrarla en el JLabel
            if (rutaImagen != null) {
                ImageIcon imagenSeleccionada = new ImageIcon(rutaImagen);
                imagenLabel.setIcon(imagenSeleccionada);
            } else {
                // Manejar el caso en el que no haya una imagen asociada
                JOptionPane.showMessageDialog(pantalla_reserva.this, "No hay imagen disponible para esta combinación");
            }
        });
            };
            
    
    
            private boolean verificarSaldoSuficiente(String correo, double precioReserva) {
                try {
                    String query = "SELECT dinero FROM usuario WHERE correo = ?";
                    try (PreparedStatement preparedStatement = Login.connection.prepareStatement(query)) {
                        preparedStatement.setString(1, correo);

                        try (ResultSet resultSet = preparedStatement.executeQuery()) {
                            if (resultSet.next()) {
                                double saldoUsuario = resultSet.getDouble("dinero");
                                return saldoUsuario >= precioReserva;
                            }
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                return false;
            }
    
    
            private double calcularPrecio(JComboBox<String> combi, JComboBox<String> paisCombo, JDateChooser dateChooser, JDateChooser dateChooser1) {
                Date selectedDate = dateChooser.getDate();
                Date selectedDate2 = dateChooser1.getDate();
                String lugarResidencial = (String) combi.getSelectedItem();
                String pais = (String) paisCombo.getSelectedItem();

                double precioBase = 2;  // Precio base, puedes ajustarlo según tus necesidades

                switch (lugarResidencial) {
                    case "Casa":
                        precioBase += 6.0;  // Puedes ajustar el incremento/decremento según el tipo de lugar
                        break;
                    case "Apartamento":
                        precioBase += 4.0;
                        break;
                    case "Cabaña":
                        precioBase += 3.0;
                        break;
                    case "Hotel":
                        precioBase += 7.0;
                        break;
                    // Puedes agregar más casos según sea necesario
                }

                switch (pais) {
                    case "Dubai":
                        precioBase *= 2.2;  // Ajuste según el país
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
                    case "Rusia":
                        precioBase *= 1.5;
                        break;
                    case "Italia":
                        precioBase *= 1.1;
                        break;
                    case "Grecia":
                        precioBase *= 1.4;
                        break;
                    case "Colombia":
                        precioBase *= 1.35;
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

                // Ajustar el precio según la duración de la reserva y tipo de lugar residencial
                switch (lugarResidencial) {
                    case "Casa":
                        precioBase += 5.0 * diferenciaDias;  // Ajuste específico para Casas
                        break;
                    case "Apartamento":
                        precioBase += 4.0 * diferenciaDias;  // Ajuste específico para Apartamentos
                        break;
                    case "Cabaña":
                        precioBase += 3.0 * diferenciaDias;  // Ajuste específico para Cabañas
                        break;
                    case "Hotel":
                        precioBase += 6.0 * diferenciaDias;  // Ajuste específico para Hoteles
                        break;
                    // Puedes agregar más casos según sea necesario
                }

                return precioBase;
            }


    
    



    
}
