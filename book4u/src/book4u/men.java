package book4u;



import javax.swing.*;
import java.awt.*;

import java.sql.Connection;


public class men extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Connection connection;
    Font fuente = new Font("Comic Sans MS",Font.PLAIN,23);
    Font texto = new Font("Comic Sans MS",Font.PLAIN,14);
    Font titulo1 = new Font("Comic Sans MS",Font.PLAIN,35);
   
    public men() {
    	JPanel pan = new JPanel();
		pan.setBounds(0, 0, 800, 75);
		pan.setVisible(true);
		pan.setBackground(Color.WHITE);
		pan.setLayout(null);
		
		ImageIcon imagen = new ImageIcon("LogoBOOK4U.png");
		JLabel ima = new JLabel(imagen);
		ima.setBounds(0, 0, 150, 100); // Establecer las coordenadas x e y
		pan.add(ima);
		
        // Configurar el frame
        setTitle("BOOK4U- Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        String colorfondo = "#579514";
        
        Color backgroundColor = Color.decode(colorfondo);
        this.getContentPane().setBackground(backgroundColor);
        
        ImageIcon imagen1 = new ImageIcon("LogoBOOK4U.jpg");
        JLabel label = new JLabel(imagen1);
        label.setBounds( 225, 150, 400, 300);
        
        // Crear los componentes
        JLabel titulo = new JLabel("BOOK4U");
        titulo.setBounds(230,50,450,35);
        titulo.setForeground(Color.black);
        titulo.setFont(titulo1);
    
        
        //creacion de los botones
        JButton InicioButton = new JButton("Inicio");
        InicioButton.setBounds(700, 200, 150, 50);
        InicioButton.setBackground(Color.white);
        InicioButton.setForeground(Color.black);
        
        
        JButton UsuarioButton = new JButton("Usuario");
        UsuarioButton.setBounds(700, 300, 150, 50);
        UsuarioButton.setBackground(Color.white);
        UsuarioButton.setForeground(Color.black);
        
        
        JButton HistorialButton = new JButton("Historial");
        HistorialButton.setBounds(700, 400, 150, 50);
        HistorialButton.setBackground(Color.white);
        HistorialButton.setForeground(Color.black);
        
        
        JButton AtrasButton = new JButton("Atras");
        AtrasButton.setBounds(700, 560, 150, 50);
        AtrasButton.setBackground(Color.white);
        AtrasButton.setForeground(Color.black);
        
        // Agregar los componentes al frame
        add(titulo);
        add(label);
        add(InicioButton);
        add(UsuarioButton);
        add(HistorialButton);
        add(AtrasButton);
        
      
        
        setVisible(true);
        
    }
}