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
	 Font fuente = new Font("",Font.PLAIN,23);
	public Registro(){
		
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setLayout(null);
		
		
		JPanel pan = new JPanel();
		pan.setBounds(0, 0, 800, 50);
		pan.setVisible(true);
		pan.setBackground(Color.WHITE);
		
		ImageIcon imagen = new ImageIcon("Logo.png");
		JLabel ima = new JLabel(imagen);
		ima.setPreferredSize((new Dimension(200,0)));
		this.add(ima);
		
		
        String colorfondo = "#579514";
        
        Color backgroundColor = Color.decode(colorfondo);
        this.getContentPane().setBackground(backgroundColor);
        
        JLabel tit = new JLabel("REGISTRO");
        tit.setBounds(325, 0, 200, 20);
        
        tit.setFont(fuente);
        this.add(tit);
        this.add(pan);
	}
}
