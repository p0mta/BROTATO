package book4u;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class pantalla_usuario extends JFrame {
	
	static Font fuente = new Font("AGENCY FB", Font.BOLD,50);
	static JTextField nombre;
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
        nombre = new JTextField();
		nombre.setBounds(100, 150, 200, 25);
		nombre.setHorizontalAlignment(JTextField.CENTER);
		nombre.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(nombre);
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
		let.setBounds(711, 15, 50, 50);
		let.setForeground(Color.white);
		let.setFont(fuente);
		pan.add(let);
		pan.add(cir1);
		 String colorfondo = "#579514";
	        Color backgroundColor = Color.decode(colorfondo);
	        this.getContentPane().setBackground(backgroundColor);
		
		
		
	}
}
