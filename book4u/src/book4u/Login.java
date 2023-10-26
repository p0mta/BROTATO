
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
            Font fuente = new Font("Arial", Font.PLAIN, 18);
            Font texto = new Font("Arial", Font.PLAIN, 14);

            JLabel usernameLabel = new JLabel("Usuario:");
            usernameLabel.setFont(fuente);
            usernameLabel.setForeground(Color.BLACK);
            usernameLabel.setBounds(150, 300, 90, 20);

            usernameField = new JTextField();
            usernameField.setBounds(250, 300, 150, 25);
            usernameField.setFont(texto);
            usernameField.setForeground(Color.BLACK);
            usernameField.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            
            JLabel passwordLabel = new JLabel("Contraseña:");
            passwordLabel.setFont(fuente);
            passwordLabel.setForeground(Color.BLACK);
            passwordLabel.setBounds(450, 300, 150, 25);

            passwordField = new JPasswordField();
            passwordField.setBounds(580, 300, 150, 25);
            passwordField.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            JButton loginButton = new JButton("Iniciar sesión");
            loginButton.setBounds(350, 375, 150, 50);
            loginButton.setBackground(Color.GREEN);
            loginButton.setForeground(Color.WHITE);
            
            JLabel registroLabel = new JLabel("No estás registrado? Registrate!");
            registroLabel.setFont(fuente);
            registroLabel.setForeground(Color.BLACK);
            registroLabel.setBounds(200,450, 150, 25);
            
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Aquí puedes agregar la lógica para el inicio de sesión
                }
            });

            JButton registerButton = new JButton("Registrarse");
            registerButton.setBounds(350, 450, 150, 50);
            registerButton.setBackground(Color.GREEN);
            registerButton.setForeground(Color.WHITE);
            registerButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Aquí puedes agregar la lógica para el registro
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
                    JOptionPane.showMessageDialog(Login.this, "Inicio de sesión exitoso");
                    dispose();
                    pantalla_usuario pant = new pantalla_usuario();
                   
                    
                    // Aquí iría el código para abrir la ventana principal de la aplicación
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Inicio de sesión fallido");
                }
            }
        });
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.ilerna.com:1521:xe", "23_24_DAM2_BROTATO", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(Login.this, "Error al conectar a la base de datos");
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
            JOptionPane.showMessageDialog(Login.this, "Error al consultar la base de datos");
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