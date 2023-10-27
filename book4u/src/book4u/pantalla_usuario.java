package book4u;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class pantalla_usuario extends JFrame {
	
	static Font fuente = new Font("AGENCY FB", Font.BOLD,50);
	static JTextField nombre3;
	static JPasswordField contra;
	static JTextField correo;
	public pantalla_usuario() {
		
		setTitle("Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 500);
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
		nombre3.setHorizontalAlignment(JTextField.CENTER);
		nombre3.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(nombre3);
		JLabel nombre2 = new JLabel("CAMBIAR NOMBRE");
		nombre2.setBounds(130, 120, 140, 30);
		nombre2.setFont(Registro.fuente1);
		this.add(nombre2);
		
		ImageIcon imagen = new ImageIcon("Logo.png");
		JLabel ima = new JLabel(imagen);
		ima.setBounds(0, 0, 150, 100); 
		pan.add(ima);
		
		ImageIcon cir = new ImageIcon("circulo.png");
		JLabel cir1 = new JLabel(cir);
		cir1.setBounds(670, -10, 100, 100);
		
		String nombreUsuario;
		nombreUsuario = Login.getUsernameField().getText().toUpperCase();
		char primeraLetra = nombreUsuario.charAt(0);

		JLabel let = new JLabel(String.valueOf(primeraLetra));
		let.setHorizontalAlignment(JLabel.CENTER);
		let.setBounds(696, 15, 50, 50);
		let.setForeground(Color.white);
		let.setFont(fuente);
		pan.add(let);
		pan.add(cir1);
		
		ImageIcon icono = new ImageIcon("change.png");
        
        // Crear un botón y establecer la imagen y el texto
        JButton change = new JButton(icono);
        change.setBounds(118, 180, 150, 30);
        change.setFont(Registro.fuente1);
        change.setText("CHANGE"); // Establece el texto del botón
        change.setFocusPainted(false);
        change.setBorderPainted(false);
        change.setContentAreaFilled(false);
        this.add(change);
		
		 String colorfondo = "#579514";
	        Color backgroundColor = Color.decode(colorfondo);
	        this.getContentPane().setBackground(backgroundColor);
		
		
	        change.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String correo = Login.usernameField.getText();
	                String contrasena = String.valueOf(Login.getPasswordField().getPassword());

	                // Obtener el nombre de usuario desde la base de datos
	                String nombre = obtenerNombreDesdeBaseDeDatos(correo, contrasena);
	                if(nombre3.getText().isEmpty()) {
	                	JOptionPane.showMessageDialog(pantalla_usuario.this, "Tienes que rellenar el campo nombre");
	                	return;
	                }
	                if (nombre != null) {
	                    // Mostrar un cuadro de diálogo para que el usuario ingrese el nuevo nombre
	                    

	                    if (nombre2.getText() != null && !nombre2.getText().isEmpty()) {
	                        // Realizar la actualización con el nuevo nombre
	                        String update = "UPDATE USUARIO SET NOMBRE = ? WHERE CORREO = ? AND CONTRASEÑA = ?";
	                        try {
	                            PreparedStatement preparedStatement = Login.connection.prepareStatement(update);
	                            preparedStatement.setString(1, nombre3.getText());
	                            preparedStatement.setString(2, correo);
	                            preparedStatement.setString(3, contrasena);

	                            int rowsUpdated = preparedStatement.executeUpdate();

	                            if (rowsUpdated > 0) {
	                                JOptionPane.showMessageDialog(pantalla_usuario.this, "Nombre de usuario modificado correctamente");
	                            } else {
	                                JOptionPane.showMessageDialog(pantalla_usuario.this, "No se pudo modificar el nombre de usuario. Verifica que la contraseña actual sea correcta.");
	                            }
	                        } catch (SQLException ex) {
	                            ex.printStackTrace();
	                            JOptionPane.showMessageDialog(pantalla_usuario.this, "Error al modificar el nombre de usuario");
	                        }
	                    } else {
	                        JOptionPane.showMessageDialog(pantalla_usuario.this, "Nombre de usuario no válido.");
	                    }
	                } else {
	                    JOptionPane.showMessageDialog(pantalla_usuario.this, "No se pudo obtener el nombre de usuario desde la base de datos.");
	                }
	                
	            }
	        });
	    }

	    // Método para obtener el nombre desde la base de datos
	    

	
private String obtenerNombreDesdeBaseDeDatos(String correo, String contraseña) {
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
}
