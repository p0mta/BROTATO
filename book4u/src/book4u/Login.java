
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

public class Login extends JFrame {
    static JTextField usernameField;
    private static JPasswordField passwordField;
    static Connection connection;
    Font fuente = new Font("Comic Sans MS",Font.PLAIN,23);
    Font texto = new Font("Comic Sans MS",Font.PLAIN,14);
    Font titulo1 = new Font("Comic Sans MS",Font.PLAIN,35);
    private boolean contraseniasVisible = false;

        public Login() {
            // Configurar el frame
            setTitle("BOOK4U- Login");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(900, 700);
            setLocationRelativeTo(null);

            
            String colorFondo = "#579514";
            Color backgroundColor = Color.decode(colorFondo);
            getContentPane().setBackground(backgroundColor);

            // Crear un JPanel en la parte superior con el logo
            JPanel logoPanel = new JPanel();
            logoPanel.setBounds(0, 0, 900, 100);
            logoPanel.setBackground(Color.WHITE); // Fondo blanco

            ImageIcon imagen = new ImageIcon("logo.png");
            JLabel label = new JLabel(imagen);
            label.setPreferredSize(new Dimension(450, 100));
            logoPanel.add(label);
            

            // Crear los componentes de inicio de sesión
            Font fuente = new Font("Agency FB", Font.PLAIN, 23);
            Font texto = new Font("Agency FB", Font.PLAIN, 18);

            JLabel usernameLabel = new JLabel("CORREO");
            usernameLabel.setFont(Registro.fuente1);
            usernameLabel.setForeground(Color.BLACK);
            usernameLabel.setBounds(230, 260, 90, 20);

            usernameField = new JTextField();
            usernameField.setBounds(165, 300, 200, 25);
            usernameField.setFont(texto);
            usernameField.setForeground(Color.BLACK);
            usernameField.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            
            JLabel passwordLabel = new JLabel("CONTRASEÑA");
            passwordLabel.setFont(Registro.fuente1);
            passwordLabel.setForeground(Color.BLACK);
            passwordLabel.setBounds(550, 260, 150, 25);

            passwordField = new JPasswordField();
            passwordField.setBounds(500, 300, 200, 25);
            passwordField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            ImageIcon ima4 = new ImageIcon("ojo.png");
            JButton botonvision2 = new JButton(ima4);
            botonvision2.setBounds(230, 230, 30, 30);
            botonvision2.setBackground(Color.white);
            botonvision2.setBounds(passwordField.getWidth() - 30, 1, 25, 25); 
            botonvision2.setBackground(Color.white);
            botonvision2.setFocusPainted(false);
            botonvision2.setBorderPainted(false);
            botonvision2.setContentAreaFilled(false);
            passwordField.add(botonvision2);
            
            ImageIcon iniciarsesion = new ImageIcon("login.png"); 
            JButton loginButton = new JButton(iniciarsesion);
            loginButton.setBounds(360, 375, 150, 55);
            loginButton.setFocusPainted(false);
            loginButton.setBorderPainted(false);
            loginButton.setContentAreaFilled(false);
            
            

            botonvision2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	 contraseniasVisible = !contraseniasVisible;
                     
                     if (contraseniasVisible) {
                    	 passwordField.setEchoChar((char) 0);
                        
                    	 passwordField.setFont(Registro.fuente2);
                      
                     } else {
                    	 passwordField.setEchoChar('·');
                         
                    	 passwordField.setFont(Registro.fuente2);
                         
                     }
                }
            });
            
            
           
            
            
            JLabel registroLabel = new JLabel("No estás registrado? Registrate!");
            registroLabel.setFont(Registro.fuente1);
            registroLabel.setForeground(Color.BLACK);
            registroLabel.setBounds(310,570, 400, 25);
            
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                }
            });
            ImageIcon registro = new ImageIcon("botonregistro.png");
            JButton registerButton = new JButton(registro);
            registerButton.setBounds(360, 500, 150, 48);
            registerButton.setFocusPainted(false);
            registerButton.setBorderPainted(false);
            registerButton.setContentAreaFilled(false);

           
            
           


            registerButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  
                }
            });

            // Agregar los componentes al frame
            add(logoPanel);
            add(usernameLabel);
            add(usernameField);
            add(passwordLabel);
            add(passwordField);
            add(loginButton);
            add(registerButton);
            add(registroLabel);
            
            

            setLayout(null);
            setVisible(true);
            

    

       
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = usernameField.getText();
                String password = new String(getPasswordField().getPassword());
                boolean loginSuccessful = loginUser(usuario, password);
                if (loginSuccessful) {
                	
                    OtrasCosas lp2 = new OtrasCosas();
                    lp2.a();
                   
                    lp2.bi.addActionListener(new ActionListener() {
	                    public void actionPerformed(ActionEvent e) {	                    	
	                    		lp2.j9.dispose(); 
	                    		dispose();
	                            Pantalla_principal pant = new Pantalla_principal();
	                            
	                    }
	                });

                    // Aquí iría el código para abrir la ventana principal de la aplicación
                } else {
                	OtrasCosas lp = new OtrasCosas();
                    lp.b();
                }
            }
        });
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.ilerna.es:1521:xe", "23_24_DAM2_BROTATO", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
            OtrasCosas lp = new OtrasCosas();
            lp.c();
            System.exit(1);
        }
        
        
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            	dispose();
            	Registro re = new Registro();

            }
        });
        setVisible(true);
    }

    private boolean loginUser(String nombre, String password) {
    	
        try {
        	String select = "SELECT CORREO, CONTRASEÑA FROM USUARIO WHERE CORREO = '"+usernameField.getText()+"' AND CONTRASEÑA = '"+String.valueOf(getPasswordField().getPassword())+"'";
            PreparedStatement statement = connection.prepareStatement(select);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
            	nombre = resultSet.getString("CORREO");
            	password = resultSet.getString("CONTRASEÑA");
            	return true;
            }

           
            return resultSet.next(); // Retorna true si se encontró un usuario con las credenciales proporcionadas
           
        } catch (SQLException e) {
            e.printStackTrace();
            OtrasCosas lp = new OtrasCosas();
            lp.d();
        }
        return false;
    }
    
    public static JTextField getUsernameField() {
        return usernameField;
    }
    
    public void setUsernameField(JTextField usernameField) {
        this.usernameField = usernameField;
    }

	public static JPasswordField getPasswordField() {
		return passwordField;
	}

	public static void setPasswordField(JPasswordField passwordField) {
		Login.passwordField = passwordField;
	}

	
    
}