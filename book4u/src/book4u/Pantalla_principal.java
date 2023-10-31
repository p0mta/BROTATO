package book4u;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Pantalla_principal extends JFrame {
  
	
	
	private boolean menuvisible = false;
    public Font fuenti = new Font("Agency FB", Font.BOLD, 40);
   
    public Pantalla_principal() {
    	
    	JPanel pan = new JPanel();
		pan.setBounds(0, 0, 800, 75);
		pan.setVisible(true);
		pan.setBackground(Color.WHITE);
		pan.setLayout(null);
	    this.add(pan);
		ImageIcon imagen = new ImageIcon("logo.png");
		JLabel ima = new JLabel(imagen);
		ima.setBounds(0, -25, 150, 150); // Establecer las coordenadas x e y
		pan.add(ima);
		String color2 = "#027017";
        Color bac = Color.decode(color2);
        
        String correo = Login.usernameField.getText();
        String contraseña = String.valueOf(Login.getPasswordField().getPassword());
        String nombre = obtenerNombreDesdeBaseDeDatos(correo, contraseña);
        JLabel titi = new JLabel("BIENVENIDO A BOOK4U " + nombre);
        titi.setHorizontalAlignment(JLabel.CENTER);
		titi.setBounds(100, 220, 600, 50);
		titi.setFont(fuenti);
		
        
		ImageIcon menu = new ImageIcon("menu.png");
		JButton ne = new JButton(menu);
		ne.setFocusPainted(false);
		ne.setBorderPainted(false);
		ne.setContentAreaFilled(false);
		ne.setBounds(700, 20, 50, 50);
		pan.add(ne);
		JPanel desp = new JPanel();
		desp.setBounds(550, 0, 250, 500);
		desp.setBackground(bac);
		desp.setVisible(false);
		desp.setLayout(null);
		this.add(desp);
		add(titi);
		
        // Configurar el frame
        setTitle("BOOK4U- Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        String colorfondo = "#579514";
        
        Color backgroundColor = Color.decode(colorfondo);
        this.getContentPane().setBackground(backgroundColor);
        
        
        
    
        // Crear los componentes
        JLabel titulo = new JLabel("BOOK4U");
        titulo.setBounds(325,20,450,40);
        titulo.setForeground(Color.black);
        titulo.setFont(Registro.fuente);
    
        
        //creacion de los botones
        JButton InicioButton = new JButton("RESERVAR");
        InicioButton.setBounds(45, 90, 150, 50);
        InicioButton.setFont(Registro.fuente1);
        InicioButton.setBackground(Color.white);
        InicioButton.setForeground(Color.black);
        
        
        JButton UsuarioButton = new JButton("USUARIO");
        UsuarioButton.setBounds(45, 190, 150, 50);
        UsuarioButton.setFont(Registro.fuente1);
        UsuarioButton.setBackground(Color.white);
        UsuarioButton.setForeground(Color.black);
        
        
        JButton HistorialButton = new JButton("HISTORIAL");
        HistorialButton.setBounds(45, 290, 150, 50);
        HistorialButton.setFont(Registro.fuente1);
        HistorialButton.setBackground(Color.white);
        HistorialButton.setForeground(Color.black);
        
        
        JButton AtrasButton = new JButton("CERRAR SESIÓN");
        AtrasButton.setBounds(45, 390, 150, 50);
        AtrasButton.setFont(Registro.fuente1);
        AtrasButton.setBackground(Color.white);
        AtrasButton.setForeground(Color.black);
        
        // Agregar los componentes al frame
        pan.add(titulo);
        desp.add(InicioButton);
        desp.add(UsuarioButton);
        desp.add(HistorialButton);
        desp.add(AtrasButton);
        
      
        
        setVisible(true);
        ne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	menuvisible = !menuvisible; // Invertir la visibilidad

                if(menuvisible) {
                	desp.setVisible(true);
                }
                else {
                	desp.setVisible(false);
                }
               
            }
        });
        UsuarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            	pantalla_usuario pat = new pantalla_usuario();
            }
        });
        AtrasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            	
            	Login pa = new Login();
            }
        });
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
}
