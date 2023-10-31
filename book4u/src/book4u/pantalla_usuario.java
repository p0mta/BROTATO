package book4u;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private boolean visiongucci = false;
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
		nombre3.setFont(Registro.fuente2);
		nombre3.setHorizontalAlignment(JTextField.CENTER);
		nombre3.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(nombre3);
		String correo = Login.usernameField.getText();
		String contraseña = String.valueOf(Login.getPasswordField().getPassword());
		String nombre = obtenerNombreDesdeBaseDeDatos(correo, contraseña);
		JLabel nombre2 = new JLabel("CAMBIAR NOMBRE ("+nombre.toUpperCase()+")");
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
		        JOptionPane.showMessageDialog(pantalla_usuario.this, "El nombre de usuario está vacío.");
		    }
		} else {
		    JOptionPane.showMessageDialog(pantalla_usuario.this, "No se pudo obtener el nombre de usuario desde la base de datos.");
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
		
		 String colorfondo = "#579514";
	        Color backgroundColor = Color.decode(colorfondo);
	        this.getContentPane().setBackground(backgroundColor);
		
	        
	        change.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String correo = Login.usernameField.getText();
	                String contraseña = String.valueOf(Login.getPasswordField().getPassword());

	                // Obtener el nombre de usuario desde la base de datos
	                String nombre = obtenerNombreDesdeBaseDeDatos(correo, contraseña);

	                if (nombre != null) {
	                    // Validar que el nombre no tenga más de 15 caracteres
	                    if (nombre3.getText().isEmpty()) {
	                        JOptionPane.showMessageDialog(pantalla_usuario.this, "Tienes que rellenar el campo nombre");
	                    } else if (nombre3.getText().length() > 15) {
	                        JOptionPane.showMessageDialog(pantalla_usuario.this, "El nombre no puede tener más de 15 caracteres");
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
	                                JOptionPane.showMessageDialog(pantalla_usuario.this, "Nombre de usuario modificado correctamente");
	                                dispose();
	                                pantalla_usuario panta = new pantalla_usuario();
	                            } else {
	                                JOptionPane.showMessageDialog(pantalla_usuario.this, "No se pudo modificar el nombre de usuario. Verifica que la contraseña actual sea correcta.");
	                            }
	                        } catch (SQLException ex) {
	                            ex.printStackTrace();
	                            JOptionPane.showMessageDialog(pantalla_usuario.this, "Error al modificar el nombre de usuario");
	                        }
	                    }
	                } else {
	                    JOptionPane.showMessageDialog(pantalla_usuario.this, "No se pudo obtener el nombre de usuario desde la base de datos.");
	                }
	            }
	        });
	        
	        siu.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String update = "UPDATE usuario SET contraseña = ? WHERE CORREO = ? AND contraseña = ?";
	                try {
	                    // Crear un PreparedStatement en lugar de un Statement para evitar SQL Injection
	                    PreparedStatement preparedStatement = Login.connection.prepareStatement(update);
	                    preparedStatement.setString(1, String.valueOf(contra.getPassword()));
	                    preparedStatement.setString(2, Login.usernameField.getText());
	                    preparedStatement.setString(3, String.valueOf(Login.getPasswordField().getPassword()));
	                    if(contra.getText().length() > 20) {
	                    	JOptionPane.showMessageDialog(pantalla_usuario.this, "La contraseña no puede contener mas de 20 caracteres");
	                    	return;
	                    }
	                    int rowsUpdated = preparedStatement.executeUpdate();     
	                    if (rowsUpdated > 0) {
	                        JOptionPane.showMessageDialog(pantalla_usuario.this, "Contraseña modificada correctamente");
	                    } else {
	                        JOptionPane.showMessageDialog(pantalla_usuario.this, "No se pudo modificar la contraseña. Verifica que la contraseña actual sea correcta.");
	                    }
	                    
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                    JOptionPane.showMessageDialog(pantalla_usuario.this, "Error al modificar la contraseña");
	                }
	                dispose();
	                Login logi = new Login();
	            }
	        });
	        but.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	dispose();
	            	Pantalla_principal pat = new Pantalla_principal();
	            }
	        });

	    }

	    // Método para obtener el nombre desde la base de datos
	    

	
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
}
