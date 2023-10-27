package book4u;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Registro extends JFrame {
	private boolean contraseniasVisible = false;
	static JTextField nombre;
	static JTextField correo;
	static JTextField ciudad;
	static JPasswordField contraseña;
	static JTextField apellidos;
	static JPasswordField contraseña2;
	static String usuario = "";
	static Font fuente = new Font("Agency FB",Font.BOLD,50);
	static Font fuente1 = new Font("Agency FB",Font.BOLD, 23);
	static Font fuente2 = new Font("Agency FB",Font.BOLD, 18);
	public Registro(){
		
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setLayout(null);
		ImageIcon ima2 = new ImageIcon("ojo.png");
        JButton botonvision = new JButton(ima2);
        botonvision.setBounds(700, 147, 30, 30);
        botonvision.setBackground(Color.white);
        
        this.add(botonvision);
		
		
		JPanel pan = new JPanel();
		pan.setBounds(0, 0, 800, 75);
		pan.setVisible(true);
		pan.setBackground(Color.WHITE);
		pan.setLayout(null);
		
		ImageIcon imagen = new ImageIcon("Logo.png");
		JLabel ima = new JLabel(imagen);
		ima.setBounds(0, 0, 150, 100); // Establecer las coordenadas x e y
		pan.add(ima);
		
		//textos y bainas
		nombre = new JTextField();
		this.nombre.setBounds(140, 150, 200, 25);
		nombre.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		nombre.setFont(fuente2);
		nombre.setHorizontalAlignment(JTextField.CENTER);
		this.add(nombre);
		JLabel nombre1 = new JLabel("NOMBRE");
		nombre1.setBounds(210, 120, 60, 30);
		nombre1.setFont(fuente1);
		this.add(nombre1);
		
		apellidos = new JTextField();
		apellidos.setBounds(140, 230, 200, 25);
		apellidos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		apellidos.setFont(fuente2);
		apellidos.setHorizontalAlignment(JTextField.CENTER);
		this.add(apellidos);
		JLabel apellidos1 = new JLabel("APELLIDOS");
		apellidos1.setBounds(205, 200, 80, 30);
		apellidos1.setFont(fuente1);
		this.add(apellidos1);
		
		contraseña = new JPasswordField();
		contraseña.setBounds(460, 150, 200, 25);
		contraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		this.add(contraseña);
		JLabel contraseña1 = new JLabel("CONTRASEÑA");
		contraseña1.setBounds(510, 120, 105, 30);
		contraseña1.setFont(fuente1);
		this.add(contraseña1);
		
		ciudad = new JTextField();
		ciudad.setBounds(460, 310, 200, 25);
		ciudad.setBorder(BorderFactory.createLineBorder(Color.black));
		ciudad.setHorizontalAlignment(JTextField.CENTER);
		ciudad.setFont(fuente2);
		this.add(ciudad);
		JLabel ciudad1 = new JLabel("CIUDAD");
		ciudad1.setBounds(530, 280, 60, 30);
		ciudad1.setFont(fuente1);
		this.add(ciudad1);
		
		correo = new JTextField();
		correo.setBounds(140, 310, 200, 25);
		correo.setBorder(BorderFactory.createLineBorder(Color.black));
		correo.setHorizontalAlignment(JTextField.CENTER);
		correo.setFont(fuente2);
		this.add(correo);
		JLabel dni1 = new JLabel("CORREO");
		dni1.setBounds(210, 280, 60, 30);
		dni1.setFont(fuente1);
		this.add(dni1);
		
		contraseña2 = new JPasswordField();
		contraseña2.setBounds(460, 230, 200, 25);
		contraseña2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		this.add(contraseña2);
		JLabel contraseña3 = new JLabel("REPETIR CONTRASEÑA");
		contraseña3.setBounds(480, 200, 180, 30);
		contraseña3.setFont(fuente1);
		this.add(contraseña3);
		
		ImageIcon regi = new ImageIcon("registro.png");
		JButton registro = new JButton(regi);
		registro.setBounds(327, 350, 150, 75);
		this.add(registro); 
		registro.setFocusPainted(false);
		registro.setBorderPainted(false);
		registro.setContentAreaFilled(false);
		
        String colorfondo = "#579514";
        Color backgroundColor = Color.decode(colorfondo);
        this.getContentPane().setBackground(backgroundColor);
        
        JLabel tit = new JLabel("REGISTRO");
        tit.setBounds(315, 20, 200, 40);
        
        tit.setFont(fuente);
        this.add(tit);
        this.add(pan);
        
        

        

     // ...

     botonvision.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             // Cambiar el estado de visibilidad de las contraseñas
             contraseniasVisible = !contraseniasVisible;
             
             if (contraseniasVisible) {
                 contraseña.setEchoChar((char) 0);
                 contraseña2.setEchoChar((char) 0);
                 contraseña.setFont(fuente2);
                 contraseña2.setFont(fuente2);
             } else {
                 contraseña.setEchoChar('·');
                 contraseña2.setEchoChar('·');
                 contraseña.setFont(fuente2);
                 contraseña2.setFont(fuente2);
             }
         }
     });
        registro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	usuario = correo.getText();
                String password = new String(contraseña.getPassword());
                String password2 = new String(contraseña2.getPassword());
                String nombreText = nombre.getText();
                String apellidosText = apellidos.getText();
                String ciudadText = ciudad.getText();

                // Comprueba si algún campo está vacío y muestra un mensaje de error.
                if (usuario.isEmpty() || password.isEmpty() || password2.isEmpty() ||
                        nombreText.isEmpty() || apellidosText.isEmpty() || ciudadText.isEmpty()) {
                        JOptionPane.showMessageDialog(Registro.this, "Por favor, completa todos los campos.");
                        return;
                    }
                if (!password.equals(password2)) {
                    JOptionPane.showMessageDialog(Registro.this, "La contraseña no coincide, vuelve a intentarlo");
                    return;
                }

               
                if (!usuario.endsWith("@gmail.com")) {
                    JOptionPane.showMessageDialog(Registro.this, "Debes utilizar un correo valido para registrarte.");
                    return; // Sale de la acción si el correo no es válido.
                }
                if(nombre.getText().length() > 15) {
                	JOptionPane.showMessageDialog(Registro.this, "No puede rebasar de 15 caracteres en su nombre");
                    return; 
                }
                else if(contraseña.getPassword().length > 20) {
                	JOptionPane.showMessageDialog(Registro.this, "No puede rebasar de 20 caracteres en la contraseña");
                    return; 
                }
                else if(ciudad.getText().length() > 20) {
                	JOptionPane.showMessageDialog(Registro.this, "No puede rebasar de 20 caracteres en la ciudad");
                    return; 
                }
                else if(apellidos.getText().length() > 50) {
                	JOptionPane.showMessageDialog(Registro.this, "No puede rebasar de 50 caracteres en sus apellidos");
                    return; 
                }
                else if(correo.getText().length() > 30) {
                	JOptionPane.showMessageDialog(Registro.this, "No puede rebasar de 30 caracteres en el correo");
                    return; 
                }

                // Conectar a la base de datos y realizar el registro
                boolean userExists = false;

                try {
                    String query = "SELECT * FROM USUARIO WHERE CORREO = ?";
                    PreparedStatement statement = Login.connection.prepareStatement(query);
                    statement.setString(1, usuario);

                    ResultSet result = statement.executeQuery();
                    if (result.next()) {
                        userExists = true;
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                if (userExists) {
                    JOptionPane.showMessageDialog(Registro.this, "Este usuario ya está registrado. Cambia el correo o inicia sesión.");
                } else {
                    JOptionPane.showMessageDialog(Registro.this, "Registro exitoso. Ahora inicia sesión.");
                    dispose();
                    Login log = new Login();
                    try {
                        String insert = "INSERT INTO USUARIO (NOMBRE, CONTRASEÑA, CORREO, CIUDAD, APELLIDOS) VALUES (?, ?, ?, ?, ?)";
                        PreparedStatement statement = Login.connection.prepareStatement(insert);
                        statement.setString(1, nombre.getText());
                        statement.setString(2, String.valueOf(contraseña.getPassword()));
                        statement.setString(3, correo.getText());
                        statement.setString(4, ciudad.getText());
                        statement.setString(5, apellidos.getText());
                        int rowsInserted = statement.executeUpdate();

                        if (rowsInserted > 0) {
                            // Éxito en la inserción
                        } else {
                            JOptionPane.showMessageDialog(Registro.this, "Error al registrar el usuario intentelo de nuevo");
                        }
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                        JOptionPane.showMessageDialog(Registro.this, "Error al registrar el usuario");
                    }
                }
            }
        });

	}
        
}
