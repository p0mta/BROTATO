package book4u;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class pantalla_usuario extends JFrame {
	
	static Font fuente = new Font("AGENCY FB", Font.BOLD,50);
	static JTextField nombre3;
	static JPasswordField contra;
	static JTextField correo;
	private boolean visiongucci = false;
	private boolean visiongucci2 = false;
	static JPasswordField rep;
	ImageIcon papi = new ImageIcon("panel.png");
	JLabel act = new JLabel("VALOR EN DINERO: " );
	JTextField saldo1 = new JTextField();
	
	public pantalla_usuario() {
		
		setTitle("Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 500);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setLayout(null);
		JPanel pan = new JPanel();
		pan.setBounds(0, 0, 800, 75);
		pan.setVisible(true);
		pan.setBackground(Color.WHITE);
		pan.setLayout(null);
		this.add(pan);
		
		
		
		JLabel tit = new JLabel("USUARIO");
        tit.setBounds(315, 20, 200, 40);
        tit.setFont(fuente);
        pan.add(tit);
        
        
        nombre3 = new JTextField();
		nombre3.setBounds(100, 150, 200, 25);
		nombre3.setFont(Registro.fuente2);
		nombre3.setHorizontalAlignment(JTextField.CENTER);
		nombre3.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(nombre3);
		String correo = Login.usernameField.getText();
		String contraseña = String.valueOf(Login.getPasswordField().getPassword());
		String nombre = obtenerNombreDesdeBaseDeDatos(correo, contraseña);
		JLabel nombre2 = new JLabel("CAMBIAR NOMBRE ("+nombre+")");
		nombre2.setHorizontalAlignment(JLabel.CENTER);
		nombre2.setBounds(50, 120, 300, 30);
		nombre2.setFont(Registro.fuente1);
		this.add(nombre2);
		
		
		contra = new JPasswordField();
		contra.setBounds(500, 150, 200, 25);
		contra.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(contra);
		JLabel conti = new JLabel("CAMBIAR CONTRASEÑA");
		conti.setBounds(450, 120, 300, 30);
		conti.setFont(Registro.fuente1);
		conti.setHorizontalAlignment(JLabel.CENTER);
		ImageIcon ima2 = new ImageIcon("ojo.png");
        JButton botonvision = new JButton(ima2);
        botonvision.setBounds(230, 230, 30, 30);
        botonvision.setBackground(Color.white);
        botonvision.setBounds(contra.getWidth() - 30, 1, 25, 25); 
        botonvision.setBackground(Color.white);
        botonvision.setFocusPainted(false);
        botonvision.setBorderPainted(false);
        botonvision.setContentAreaFilled(false);
        this.add(conti);
        contra.add(botonvision);
        
        rep = new JPasswordField();
        rep.setBounds(500, 280, 200, 25);
		rep.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(rep);
		JLabel repe = new JLabel("REPETIR CONTRASEÑA");
		repe.setBounds(520, 250, 200, 30);
		repe.setFont(Registro.fuente1);
		this.add(repe);
		ImageIcon ima9 = new ImageIcon("ojo.png");
        JButton botonvisio9 = new JButton(ima9);
        botonvisio9.setBounds(230, 230, 30, 30);
        botonvisio9.setBackground(Color.white);
        botonvisio9.setBounds(rep.getWidth() - 30, 1, 25, 25); 
        botonvisio9.setBackground(Color.white);
        botonvisio9.setFocusPainted(false);
        botonvisio9.setBorderPainted(false);
        botonvisio9.setContentAreaFilled(false);
        rep.add(botonvisio9);
		
		
		
		ImageIcon icono = new ImageIcon("change.png");
		JButton siu = new JButton(icono);
		siu.setBounds(518, 180, 150, 30);
		siu.setText("CHANGE"); 
		siu.setFont(Registro.fuente1);
		siu.setFocusPainted(false);
		siu.setBorderPainted(false);
		siu.setContentAreaFilled(false);
		this.add(siu);
		
		
		
        
        ImageIcon back = new ImageIcon("back.png");
        JButton but = new JButton(back);
        but.setBounds(10, 90, 30, 30);
        but.setFont(Registro.fuente1);
        but.setFocusPainted(false);
        but.setBorderPainted(false);
        but.setContentAreaFilled(false);
        this.add(but);
        
        botonvision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visiongucci = !visiongucci; // Invertir la visibilidad

                if(visiongucci) {
                	contra.setEchoChar((char) 0); 
                    contra.setFont(Registro.fuente2);
                }
                else {
                	contra.setEchoChar('·');
                }
               
            }
        });
        botonvisio9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visiongucci2 = !visiongucci2; // Invertir la visibilidad

                if(visiongucci2) {
                	rep.setEchoChar((char) 0); 
                    rep.setFont(Registro.fuente2);
                }
                else {
                	rep.setEchoChar('·');
                }
               
            }
        });
		ImageIcon imagen = new ImageIcon("Logo.png");
		JLabel ima = new JLabel(imagen);
		ima.setBounds(0, 0, 150, 100); 
		pan.add(ima);
	
		ImageIcon cir = new ImageIcon("circulo.png");
		JLabel cir1 = new JLabel(cir);
		cir1.setBounds(670, -10, 100, 100);

		if (nombre != null) {
		    // Obtener la primera letra del nombre
		    if (!nombre.isEmpty()) {
		        char primeraLetra = nombre.toUpperCase().charAt(0);
		        // Luego puedes usar "primeraLetra" como lo hiciste anteriormente
		        JLabel let = new JLabel(String.valueOf(primeraLetra));
		        let.setHorizontalAlignment(JLabel.CENTER);
		        let.setBounds(695, 15, 50, 50);
		        let.setForeground(Color.white);
		        let.setFont(fuente);
		        pan.add(let);
		    } else {
		        OtrasCosas ne = new OtrasCosas();
		        ne.e();
		    }
		} else {
			OtrasCosas ne = new OtrasCosas();
	        ne.f();
		}

		pan.add(cir1);	
        
        // Crear un botón y establecer la imagen y el texto
        JButton change = new JButton(icono);
        change.setBounds(118, 180, 150, 30);
        change.setFont(Registro.fuente1);
        change.setText("CHANGE"); // Establece el texto del botón
        change.setFocusPainted(false);
        change.setBorderPainted(false);
        change.setContentAreaFilled(false);
        this.add(change);
        
        double saldo3 = obtenerSaldoDesdeBaseDeDatos(correo, contraseña);
        JLabel saldo = new JLabel("AÑADIR BROCOINS( ACTUALES:"+saldo3+")");
        saldo.setHorizontalAlignment(JLabel.CENTER);
        saldo.setFont(Registro.fuente1);
        saldo.setBounds(25, 250, 350, 30);
        add(saldo);
        saldo1 = new JTextField();
        saldo1.setFont(Registro.fuente2);
        saldo1.setBounds(100, 280, 200, 25);
        saldo1.setBorder(BorderFactory.createLineBorder(Color.black));
        add(saldo1);
        JButton change2 = new JButton(icono);
        change2.setBounds(118, 310, 150, 30);
        change2.setFont(Registro.fuente1);
        change2.setText("CHANGE"); // Establece el texto del botón
        change2.setFocusPainted(false);
        change2.setBorderPainted(false);
        change2.setContentAreaFilled(false);
        this.add(change2);
        act = new JLabel();
        act.setBounds(10, 330, 400, 30);
        act.setFont(Registro.fuente1);
        act.setHorizontalAlignment(JLabel.CENTER);
        this.add(act);
        saldo1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarLabel(); // Método para actualizar el JLabel
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarLabel();
            }
        });
        JLabel contras = new JLabel("REPETIR CONTRASEÑA");
        
		 String colorfondo = "#579514";
	        Color backgroundColor = Color.decode(colorfondo);
	        this.getContentPane().setBackground(backgroundColor);
		
	        
	        change2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String correo = Login.usernameField.getText();
	                String contraseña = String.valueOf(Login.getPasswordField().getPassword());

	                // Obtener el saldo actual desde la base de datos
	                double saldoActual = obtenerSaldoDesdeBaseDeDatos(correo, contraseña);
	                
	                if (saldo1.getText().length() > 10) {
	                    OtrasCosas ja = new OtrasCosas();
	                    ja.Otrascosas();
	                    return;
	                }
	                if (saldoActual != -1) { // Se encontró un saldo válido en la base de datos
	                    try {
	                        // Obtener el texto ingresado en el JTextField
	                        String saldoIngresado = saldo1.getText();

	                        // Validar que el texto ingresado sea un número (entero o decimal)
	                        if (saldoIngresado.matches("^\\d+(,\\d+)?(\\.\\d+)?$")) {
	                            // Reemplazar comas por puntos para asegurarse de que sea un número válido
	                            saldoIngresado = saldoIngresado.replace(",", ".");

	                            // Convertir el saldo ingresado a un número
	                            double cantidadIngresada = Double.parseDouble(saldoIngresado);

	                            // Validar que la cantidad ingresada sea positiva
	                            if (cantidadIngresada > 0) {
	                                // Calcular el nuevo saldo sumando la cantidad ingresada
	                                double nuevoSaldo = saldoActual + cantidadIngresada;

	                                // Actualizar el saldo en la base de datos
	                                if (actualizarSaldoEnBaseDeDatos(correo, contraseña, nuevoSaldo)) {
	                                	OtrasCosas ja = new OtrasCosas();
	                                	ja.casi();
	                                	
	                                } else {
	                                	OtrasCosas ja = new OtrasCosas();
	                                	ja.g();
	                                }
	                            } else {
	                            	OtrasCosas ja = new OtrasCosas();
                                	ja.h();
	                            }
	                        } else {
	                        	OtrasCosas ja = new OtrasCosas();
                            	ja.i();
	                        }
	                    } catch (NumberFormatException ex) {
	                    	OtrasCosas ja = new OtrasCosas();
                        	ja.i();
	                    }
	                } else {
	                	OtrasCosas ja = new OtrasCosas();
                    	ja.j();
	                }
	            }
	        });


	        
	        change.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String correo = Login.usernameField.getText();
	                String contraseña = String.valueOf(Login.getPasswordField().getPassword());

	                // Obtener el nombre de usuario desde la base de datos
	                String nombre = obtenerNombreDesdeBaseDeDatos(correo, contraseña);

	                if (nombre != null) {
	                    // Validar que el nombre no tenga más de 15 caracteres
	                    if (nombre3.getText().isEmpty()) {
	                        OtrasCosas ja = new OtrasCosas();
	                        ja.k();
	                    } else if (nombre3.getText().length() > 15) {
	                        OtrasCosas ja = new OtrasCosas();
	                        ja.l();
	                    } else if (!nombre3.getText().matches("^[a-zA-Z]+$")) {
	                        // Validar que el nuevo nombre solo contenga letras
	                        OtrasCosas ja = new OtrasCosas();
	                        ja.nosololetras();
	                    } else {
	                        // Realizar la actualización con el nuevo nombre
	                        String update = "UPDATE USUARIO SET NOMBRE = ? WHERE CORREO = ? AND CONTRASEÑA = ?";
	                        try {
	                            PreparedStatement preparedStatement = Login.connection.prepareStatement(update);
	                            preparedStatement.setString(1, nombre3.getText());
	                            preparedStatement.setString(2, correo);
	                            preparedStatement.setString(3, contraseña);

	                            int rowsUpdated = preparedStatement.executeUpdate();

	                            if (rowsUpdated > 0) {
	                                dispose();
	                               Pantalla_principal panta = new Pantalla_principal();
	                                
	                            } else {
	                                OtrasCosas ja = new OtrasCosas();
	                                ja.n();
	                            }
	                        } catch (SQLException ex) {
	                            ex.printStackTrace();
	                            OtrasCosas ja = new OtrasCosas();
	                            ja.n();
	                        }
	                    }
	                } else {
	                    OtrasCosas ja = new OtrasCosas();
	                    ja.o();
	                }
	            }
	        });
	        
	        siu.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Mostrar un diálogo de confirmación
	            	OtrasCosas otra = new OtrasCosas();
	                otra.botonpregunta();
	               
	                otra.ja.addActionListener(new ActionListener() {
	                    public void actionPerformed(ActionEvent e) {
	                    	 // El usuario ha confirmado que quiere cambiar la contraseña
		                    String update = "UPDATE usuario SET contraseña = ? WHERE CORREO = ? AND contraseña = ?";
		                    String password = new String(contra.getPassword());
		                    String password2 = new String(rep.getPassword());

		                    if (password.length() > 20) {
		                    	OtrasCosas ja = new OtrasCosas();
		                    	ja.q(); 
		                    	otra.j.dispose(); 
		                        return;
		                    }

		                    if (!password.equals(password2)) {
		                    	OtrasCosas ja = new OtrasCosas();
		                    	ja.p(); 
		                        otra.j.dispose(); 
		                        return;
		                    }

		                    try {
		                        // Crear un PreparedStatement en lugar de un Statement para evitar SQL Injection
		                        PreparedStatement preparedStatement = Login.connection.prepareStatement(update);
		                        preparedStatement.setString(1, String.valueOf(contra.getPassword()));
		                        preparedStatement.setString(2, Login.usernameField.getText());
		                        preparedStatement.setString(3, String.valueOf(Login.getPasswordField().getPassword()));

		                        int rowsUpdated = preparedStatement.executeUpdate();

		                        if (rowsUpdated > 0) {
		                        	dispose();
				                    Login logi = new Login();
		                        	OtrasCosas ja = new OtrasCosas();
			                    	ja.r(); 
			                        otra.j.dispose(); 
		                        } else {
		                        	OtrasCosas ja = new OtrasCosas();
			                    	ja.s(); 
			                        otra.j.dispose(); 
		                        }

		                    } catch (SQLException ex) {
		                        ex.printStackTrace();
		                        OtrasCosas ja = new OtrasCosas();
		                    	ja.s(); 
		                        otra.j.dispose(); 
		                    }

		                    // Cerrar la ventana actual y volver a la ventana de inicio de sesión
		                    
		                    
		                    
	                            otra.j.dispose(); 
	                        
	                    }
	                });
	                otra.ja2.addActionListener(new ActionListener() {
	                    public void actionPerformed(ActionEvent e) {
	                    	
	                    	if (otra.j != null) {
	                            otra.j.dispose(); // Cerrar la ventana al presionar "NO"
	                        }
	    	                
	                        return;
	                    }
	                });
	            }
	        });
	        but.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	dispose();
	            	Pantalla_principal pat = new Pantalla_principal();
	            }
	        });
	       

	    }

	    
	
	
	private void actualizarLabel() {
	    try {
	        // Obtener el texto ingresado en el JTextField
	        String saldoIngresado = saldo1.getText();

	        // Validar que el texto ingresado sea un número (entero o decimal)
	        if (saldoIngresado.matches("^\\d{1,9}(\\.\\d+)?(,\\d+)?$")) {
	            // Reemplazar comas por puntos para asegurarse de que sea un número válido
	            saldoIngresado = saldoIngresado.replace(",", "");

	            // Convertir el saldo ingresado a un número
	            double cantidadIngresada = Double.parseDouble(saldoIngresado);

	            // Multiplicar por 10 y actualizar el texto del JLabel
	            double resultado = cantidadIngresada * 10;

	            // Formatear el resultado para evitar la notación científica y limitar los decimales
	            String resultadoFormateado = String.format("%.2f", resultado);

	            act.setText("VALOR EN DINERO: " + resultadoFormateado + "€");
	        } else {
	            // Si no es un número válido, puedes mostrar un mensaje de error o dejar el JLabel vacío
	            act.setText("VALOR EN DINERO: VALOR MAXIMO 999999999.99");
	        }
	    } catch (NumberFormatException ex) {
	        // Manejar la excepción si ocurre algún error al convertir a double
	        act.setText("VALOR EN DINERO: ");
	    }
	}


	public double obtenerSaldoDesdeBaseDeDatos(String correo, String contraseña) {
	    double saldo3 = -1; // Valor por defecto si no se encuentra el saldo
	    try {
	        String selectQuery = "SELECT DINERO FROM USUARIO WHERE CORREO = ? AND CONTRASEÑA = ?";
	        PreparedStatement preparedStatement = Login.connection.prepareStatement(selectQuery);
	        preparedStatement.setString(1, correo);
	        preparedStatement.setString(2, contraseña);
	        ResultSet resultSet = preparedStatement.executeQuery();

	        if (resultSet.next()) {
	            saldo3 = resultSet.getDouble("DINERO");
	        }

	        resultSet.close();
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	    return saldo3;
	}

	// Método para actualizar el saldo en la base de datos
	public boolean actualizarSaldoEnBaseDeDatos(String correo, String contraseña, double nuevoSaldo) {
	    // Validar que el nuevo saldo no supere el límite máximo
	    if (nuevoSaldo > 9999999.99) {
	    	OtrasCosas ja = new OtrasCosas();
        	ja.D(); 
	        return false;
	    }

	    try {
	        String updateQuery = "UPDATE USUARIO SET DINERO = ? WHERE CORREO = ? AND CONTRASEÑA = ?";
	        PreparedStatement preparedStatement = Login.connection.prepareStatement(updateQuery);
	        preparedStatement.setDouble(1, nuevoSaldo);
	        preparedStatement.setString(2, correo);
	        preparedStatement.setString(3, contraseña);

	        int rowsUpdated = preparedStatement.executeUpdate();

	        return rowsUpdated > 0;
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	        return false;
	    }
	}

public String obtenerNombreDesdeBaseDeDatos(String correo, String contraseña) {
    String nombre = null;
    try {
        String selectQuery = "SELECT NOMBRE FROM USUARIO WHERE CORREO = ? AND CONTRASEÑA = ?";
        PreparedStatement preparedStatement = Login.connection.prepareStatement(selectQuery);
        preparedStatement.setString(1, correo);
        preparedStatement.setString(2, contraseña);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            nombre = resultSet.getString("NOMBRE");
        }

        resultSet.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return nombre;
}




public void actualizarSaldoDespuesDeReserva(String correoUsuario, double precioReserva) {
    try {
        // Consulta para obtener el saldo actual del usuario
        String obtenerSaldoQuery = "SELECT DINERO FROM USUARIO WHERE CORREO = ?";
        try (PreparedStatement obtenerSaldoStatement = Login.connection.prepareStatement(obtenerSaldoQuery)) {
            obtenerSaldoStatement.setString(1, correoUsuario);
            ResultSet resultSet = obtenerSaldoStatement.executeQuery();

            if (resultSet.next()) {
                // Obtener el saldo actual
                double saldoActual = resultSet.getDouble("DINERO");

                // Calcular el nuevo saldo restando el precio de la reserva
                double nuevoSaldo = saldoActual - precioReserva;

                // Actualizar el saldo en la base de datos
                String actualizarSaldoQuery = "UPDATE USUARIO SET DINERO = ? WHERE CORREO = ?";
                try (PreparedStatement actualizarSaldoStatement = Login.connection.prepareStatement(actualizarSaldoQuery)) {
                    actualizarSaldoStatement.setDouble(1, nuevoSaldo);
                    actualizarSaldoStatement.setString(2, correoUsuario);
                    actualizarSaldoStatement.executeUpdate();
                }

                // Aquí puedes realizar otras acciones o mostrar mensajes según sea necesario
            } else {
                // El usuario no fue encontrado
                System.out.println("Usuario no encontrado: " + correoUsuario);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
