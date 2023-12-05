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
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class editar_reserva extends JFrame {
	private Map<String, String> imagenesPorPaisYLugar1 = new HashMap<>();
	private JComboBox<String> combi;
    private JComboBox<String> paisCombo;
    private JDateChooser dateChooser;
    private JDateChooser dateChooser1;
   
    public editar_reserva(int idReserva) throws SQLException {
    	
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

        JLabel tit = new JLabel("MODIFICAR RESERVA");
        tit.setFont(Registro.fuente);
        tit.setBounds(225, 0, 400, 75);
        panelBlanco.add(tit);
        
        
        
        imagenesPorPaisYLugar1.put("DubaiCasa".toLowerCase(), "casadubai.jpg");
        imagenesPorPaisYLugar1.put("JaponCasa".toLowerCase(), "JC.jpg");
        imagenesPorPaisYLugar1.put("CoreaCasa".toLowerCase(), "CC.jpg");
        imagenesPorPaisYLugar1.put("FranciaCasa".toLowerCase(), "FC.jpg");
        imagenesPorPaisYLugar1.put("RusiaCasa".toLowerCase(), "RC1.jpg");
        imagenesPorPaisYLugar1.put("ItaliaCasa".toLowerCase(), "IC.jpg");
        imagenesPorPaisYLugar1.put("GreciaCasa".toLowerCase(), "GC.jpg");
        imagenesPorPaisYLugar1.put("ColombiaCasa".toLowerCase(), "CA.jpg");
        imagenesPorPaisYLugar1.put("MexicoCasa".toLowerCase(), "MC.jpg");
        imagenesPorPaisYLugar1.put("IrlandaCasa".toLowerCase(), "IA.jpg");
        imagenesPorPaisYLugar1.put("AlemaniaCasa".toLowerCase(), "CAT.jpg");
        
        imagenesPorPaisYLugar1.put("DubaiApartamento".toLowerCase(), "DA.jpg");
        imagenesPorPaisYLugar1.put("JaponApartamento".toLowerCase(), "JA.jpg");
        imagenesPorPaisYLugar1.put("CoreaApartamento".toLowerCase(), "CA.jpg");
        imagenesPorPaisYLugar1.put("FranciaApartamento".toLowerCase(), "FA.jpg");
        imagenesPorPaisYLugar1.put("RusiaApartamento".toLowerCase(), "RA.jpg");
        imagenesPorPaisYLugar1.put("ItaliaApartamento".toLowerCase(), "IA.jpg");
        imagenesPorPaisYLugar1.put("GreciaApartamento".toLowerCase(), "GA.jpg");
        imagenesPorPaisYLugar1.put("ColombiaApartamento".toLowerCase(), "CA1.jpg");
        imagenesPorPaisYLugar1.put("MexicoApartamento".toLowerCase(), "MA.jpg");
        imagenesPorPaisYLugar1.put("IrlandaApartamento".toLowerCase(), "IA1.jpg");
        imagenesPorPaisYLugar1.put("AlemaniaApartamento".toLowerCase(), "AA.jpg");
        
        imagenesPorPaisYLugar1.put("DubaiCabaña".toLowerCase(), "DT.jpg");
        imagenesPorPaisYLugar1.put("JaponCabaña".toLowerCase(), "JT.jpg");
        imagenesPorPaisYLugar1.put("CoreaCabaña".toLowerCase(), "CT.jpg");
        imagenesPorPaisYLugar1.put("FranciaCabaña".toLowerCase(), "FT.jpg");
        imagenesPorPaisYLugar1.put("RusiaCabaña".toLowerCase(), "RT.jpg");
        imagenesPorPaisYLugar1.put("ItaliaCabaña".toLowerCase(), "IT.jpg");
        imagenesPorPaisYLugar1.put("GreciaCabaña".toLowerCase(), "GT.jpg");
        imagenesPorPaisYLugar1.put("ColombiaCabaña".toLowerCase(), "CT1.jpg");
        imagenesPorPaisYLugar1.put("MexicoCabaña".toLowerCase(), "MT.jpg");
        imagenesPorPaisYLugar1.put("IrlandaCabaña".toLowerCase(), "IT1.jpg");
        imagenesPorPaisYLugar1.put("AlemaniaCabaña".toLowerCase(), "AC.jpg");
        
        imagenesPorPaisYLugar1.put("DubaiHotel".toLowerCase(), "DH.jpg");
        imagenesPorPaisYLugar1.put("JaponHotel".toLowerCase(), "JH.jpg");
        imagenesPorPaisYLugar1.put("CoreaHotel".toLowerCase(), "CH.jpg");
        imagenesPorPaisYLugar1.put("FranciaHotel".toLowerCase(), "FH.jpg");
        imagenesPorPaisYLugar1.put("RusiaHotel".toLowerCase(), "RH.jpg");
        imagenesPorPaisYLugar1.put("ItaliaHotel".toLowerCase(), "IH.jpg");
        imagenesPorPaisYLugar1.put("GreciaHotel".toLowerCase(), "GH.jpg");
        imagenesPorPaisYLugar1.put("ColombiaHotel".toLowerCase(), "CH1.jpg");
        imagenesPorPaisYLugar1.put("MexicoHotel".toLowerCase(), "MH.jpg");
        imagenesPorPaisYLugar1.put("IrlandaHotel".toLowerCase(), "IH1.jpg");
        imagenesPorPaisYLugar1.put("AlemaniaHotel".toLowerCase(), "AH.jpg");
 
        
        JLabel imagenLabel = new JLabel();
        imagenLabel.setBounds(550, 50, 200, 200);  // Ajusta la posición y el tamaño según tus necesidades
        add(imagenLabel);
        
        JButton reservarButton = new JButton("Guardar");
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
        combi = new JComboBox<>(lugaresResidenciales);
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
        paisCombo = new JComboBox<>(paises);
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
        

        dateChooser = new JDateChooser();
        dateChooser.setBounds(100, 290, 200, 30);
        add(dateChooser);
        dateChooser.setBackground(Color.WHITE);
        dateChooser.setFont(Registro.fuente2);
        dateChooser.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        dateChooser1 = new JDateChooser();
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

            // Verificar si el usuario tiene saldo suficiente
            String correoUsuario = Login.usernameField.getText();
            double saldoUsuario = obtenerSaldoUsuario(correoUsuario);

            if (saldoUsuario < precioReserva) {
                OtrasCosas sa =new OtrasCosas();
                sa.saldo();
                return;  // Salir del método si no hay saldo suficiente
            }
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
            	try {
                    // Calcular el precio antes de la reserva
                    double precioAntes = obtenerPrecioActual(idReserva);

                    // Actualizar la base de datos con la nueva reserva
                    String query = "UPDATE RESERVAS SET DIA = ?, LUGAR = ?, PRECIO = ?, PAIS = ?, DIA_SALIDA = ? WHERE IDRESERVA = ?";
                    try (PreparedStatement preparedStatement = Login.connection.prepareStatement(query)) {
                        preparedStatement.setDate(1, new java.sql.Date(dateChooser.getDate().getTime()));
                        preparedStatement.setString(2, lugarResidencial);
                        preparedStatement.setDouble(3, precioReserva);
                        preparedStatement.setString(4, pais);
                        preparedStatement.setDate(5, new java.sql.Date(dateChooser1.getDate().getTime()));
                        preparedStatement.setInt(6, idReserva);

                        preparedStatement.executeUpdate();

                        // Calcular el precio después de la reserva
                        double precioDespues = calcularPrecio(combi, paisCombo, dateChooser, dateChooser1);

                        // Realizar la devolución de dinero
                        double cantidadDevuelta = precioAntes - precioDespues;
                        devolverDinero(correoUsuario, cantidadDevuelta);

                        // Otros pasos si es necesario

                        precioLabel.setText("Precio de la reserva en " + pais + ": " + precioReserva);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
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
            
            if(selectedDate == null) {
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
            String rutaImagen = imagenesPorPaisYLugar1.get((pais + lugarResidencial).toLowerCase());
            


            // Verificar si la ruta de la imagen existe y mostrarla en el JLabel
            if (rutaImagen != null) {
                ImageIcon imagenSeleccionada = new ImageIcon(rutaImagen);
                imagenLabel.setIcon(imagenSeleccionada);
            } else {
                // Manejar el caso en el que no haya una imagen asociada
                JOptionPane.showMessageDialog(editar_reserva.this, "No hay imagen disponible para esta combinación");
            }
        });
            };
            
    
            private void devolverDinero(String correoUsuario, double cantidad) {
                // Obtener el saldo actual del usuario
                double saldoActual = obtenerSaldoUsuario(correoUsuario);

                // Calcular el nuevo saldo después de devolver el dinero
                double nuevoSaldo = saldoActual + cantidad;

                // Actualizar el saldo en la base de datos
                try {
                    String updateQuery = "UPDATE USUARIO SET DINERO = ? WHERE CORREO = ?";
                    try (PreparedStatement preparedStatement = Login.connection.prepareStatement(updateQuery)) {
                        preparedStatement.setDouble(1, nuevoSaldo);
                        preparedStatement.setString(2, correoUsuario);
                        preparedStatement.executeUpdate();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            public void modificarReserva(int idReserva) {
            	
                try {
                	 
                    String query = "UPDATE RESERVAS SET DIA = ?, LUGAR = ?, PRECIO = ?, PAIS = ?, DIA_SALIDA = ? WHERE IDRESERVA = ?";
                    try (PreparedStatement preparedStatement = Login.connection.prepareStatement(query)) {
                        preparedStatement.setDate(1, new java.sql.Date(dateChooser.getDate().getTime()));
                        preparedStatement.setString(2, (String) combi.getSelectedItem());
                        double precioReserva = calcularPrecio(combi, paisCombo, dateChooser, dateChooser1);
                        preparedStatement.setDouble(3, precioReserva);
                        preparedStatement.setString(4, (String) paisCombo.getSelectedItem());
                        preparedStatement.setDate(5, new java.sql.Date(dateChooser1.getDate().getTime()));
                        preparedStatement.setInt(6, idReserva);

                        // Obtén el precio anterior de la reserva antes de la actualización
                        double precioAntiguo = obtenerPrecioActual(idReserva);

                        // Ejecuta la actualización en la base de datos
                        int filasActualizadas = preparedStatement.executeUpdate();

                        if (filasActualizadas > 0) {
                            // Actualiza el saldo del usuario si la actualización fue exitosa
                            actualizarSaldoDespuesDeModificacion(Login.getUsernameField().getText(), precioAntiguo, precioReserva);

                            OtrasCosas tra = new OtrasCosas();
                        	tra.AF();
                        	                      
                        } else {
                        	OtrasCosas tra = new OtrasCosas();
                        	tra.AF();
                        	
                        }

                        // Cierra la ventana después de la modificación
                        dispose();
                        Pantalla_principal pa = new Pantalla_principal();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        

            private double obtenerPrecioActual(int idReserva) {
                double precioActual = 0.0;
                try {
                    String query = "SELECT PRECIO FROM RESERVAS WHERE IDRESERVA = ?";
                    try (PreparedStatement preparedStatement = Login.connection.prepareStatement(query)) {
                        preparedStatement.setInt(1, idReserva);
                        ResultSet resultSet = preparedStatement.executeQuery();
                        if (resultSet.next()) {
                            precioActual = resultSet.getDouble("PRECIO");
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return precioActual;
            }


            private void actualizarSaldoDespuesDeModificacion(String correoUsuario, double precioAnterior, double precioNuevo) {
                // Obtener el saldo actual del usuario
                double saldoActual = obtenerSaldoUsuario(correoUsuario);

                // Calcular la diferencia entre el precio anterior y el nuevo precio
                double diferenciaPrecio = precioNuevo - precioAnterior;

                // Calcular el nuevo saldo del usuario
                double nuevoSaldo = saldoActual - diferenciaPrecio;

                // Actualizar el saldo en la base de datos
                try {
                    String updateQuery = "UPDATE USUARIO SET DINERO = ? WHERE CORREO = ?";
                    try (PreparedStatement preparedStatement = Login.connection.prepareStatement(updateQuery)) {
                        preparedStatement.setDouble(1, nuevoSaldo);
                        preparedStatement.setString(2, correoUsuario);
                        preparedStatement.executeUpdate();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            private double obtenerSaldoUsuario(String correoUsuario) {
                try {
                    Statement statement = Login.connection.createStatement();
                    String query = "SELECT DINERO FROM USUARIO WHERE CORREO = '" + correoUsuario + "'";
                    ResultSet resultSet = statement.executeQuery(query);

                    if (resultSet.next()) {
                        return resultSet.getDouble("DINERO");
                    }

                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                return 0.0; // Valor predeterminado si hay un error
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
