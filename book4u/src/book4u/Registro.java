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

	static JTextField nombre;
	 Font fuente = new Font("Agency FB",Font.BOLD,50);
	 Font fuente1 = new Font("Agency FB",Font.BOLD, 23);
	 Font fuente2 = new Font("Agency FB",Font.BOLD, 18);
	public Registro(){
		
		setTitle("Registro");
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
		
		ImageIcon imagen = new ImageIcon("Logo.png");
		JLabel ima = new JLabel(imagen);
		ima.setBounds(0, 0, 150, 100); // Establecer las coordenadas x e y
		pan.add(ima);
		
		//textos y bainas
		nombre = new JTextField();
		this.nombre.setBounds(110, 150, 200, 25);
		nombre.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		nombre.setFont(fuente2);
		nombre.setHorizontalAlignment(JTextField.CENTER);
		this.add(nombre);
		JLabel nombre1 = new JLabel("NOMBRE");
		nombre1.setBounds(180, 120, 60, 30);
		nombre1.setFont(fuente1);
		add(nombre1);
		
		JTextField apellidos = new JTextField();
		apellidos.setBounds(110, 230, 200, 25);
		apellidos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		apellidos.setFont(fuente2);
		apellidos.setHorizontalAlignment(JTextField.CENTER);
		this.add(apellidos);
		JLabel apellidos1 = new JLabel("APELLIDOS");
		apellidos1.setBounds(175, 200, 80, 30);
		apellidos1.setFont(fuente1);
		add(apellidos1);
		
		
		
        String colorfondo = "#579514";
        Color backgroundColor = Color.decode(colorfondo);
        this.getContentPane().setBackground(backgroundColor);
        
        JLabel tit = new JLabel("REGISTRO");
        tit.setBounds(315, 20, 200, 40);
        
        tit.setFont(fuente);
        this.add(tit);
        this.add(pan);
	}
}
