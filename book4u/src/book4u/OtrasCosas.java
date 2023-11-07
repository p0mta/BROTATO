package book4u;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class OtrasCosas {
    public void Otrascosas() {
        JFrame j = new JFrame();
        j.setSize(515, 150);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon im = new ImageIcon("panel.png");
        JLabel label = new JLabel(im);
        j.setLayout(null);
        label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
        j.add(label);
        JLabel mi = new JLabel("NO SE PERMITEN MAS DE 10 CARACTERES");
        mi.setBounds(100, 10, 300, 30); 
        mi.setHorizontalAlignment(JLabel.CENTER);
        mi.setFont(Registro.fuente1);
        label.add(mi);
        JButton ja = new JButton("OK");
        ja.setBounds(220, 70, 60, 30);
        label.add(ja);
        String color2 = "#027017";
        Color bac = Color.decode(color2);
        ja.setBackground(bac);
        ja.setFocusPainted(false);
        ja.setBorderPainted(false);
        j.setResizable(false);
        j.setUndecorated(true);
        j.setBackground(new Color(0, 0, 0, 0)); 
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        ja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j.dispose(); 
            }	
        });
    }
    public void casi() {
    	JFrame j = new JFrame();
        j.setSize(515, 150);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon im = new ImageIcon("panel.png");
        JLabel label = new JLabel(im);
        j.setLayout(null);
        label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
        j.add(label);
        JLabel mi = new JLabel("SALDO ACTUALIZADO CORRECTAMENTE");
        mi.setBounds(100, 10, 300, 30); 
        mi.setHorizontalAlignment(JLabel.CENTER);
        mi.setFont(Registro.fuente1);
        label.add(mi);
        JButton ja = new JButton("OK");
        ja.setBounds(220, 70, 60, 30);
        label.add(ja);
        String color2 = "#027017";
        Color bac = Color.decode(color2);
        ja.setBackground(bac);
        ja.setFocusPainted(false);
        ja.setBorderPainted(false);
        j.setResizable(false);
        j.setUndecorated(true);
        j.setBackground(new Color(0, 0, 0, 0)); 
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        ja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j.dispose();
            }			
        });
    }
    public void a() {
    	JFrame j = new JFrame();
        j.setSize(515, 150);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon im = new ImageIcon("panel.png");
        JLabel label = new JLabel(im);
        j.setLayout(null);
        label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
        j.add(label);
        JLabel mi = new JLabel("INICIO DE SESIÓN EXITOSO");
        mi.setBounds(100, 10, 300, 30); 
        mi.setHorizontalAlignment(JLabel.CENTER);
        mi.setFont(Registro.fuente1);
        label.add(mi);
        JButton ja = new JButton("OK");
        ja.setBounds(220, 70, 60, 30);
        label.add(ja);
        String color2 = "#027017";
        Color bac = Color.decode(color2);
        ja.setBackground(bac);
        ja.setFocusPainted(false);
        ja.setBorderPainted(false);
        j.setResizable(false);
        j.setUndecorated(true);
        j.setBackground(new Color(0, 0, 0, 0)); 
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        ja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j.dispose();
            }			
        });
    }
    public void b() {
    	JFrame j = new JFrame();
        j.setSize(515, 150);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon im = new ImageIcon("panel.png");
        JLabel label = new JLabel(im);
        j.setLayout(null);
        label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
        j.add(label);
        JLabel mi = new JLabel("INICIO DE SESIÓN FALLIDO");
        mi.setBounds(100, 10, 300, 30); 
        mi.setHorizontalAlignment(JLabel.CENTER);
        mi.setFont(Registro.fuente1);
        label.add(mi);
        JButton ja = new JButton("OK");
        ja.setBounds(220, 70, 60, 30);
        label.add(ja);
        String color2 = "#027017";
        Color bac = Color.decode(color2);
        ja.setBackground(bac);
        ja.setFocusPainted(false);
        ja.setBorderPainted(false);
        j.setResizable(false);
        j.setUndecorated(true);
        j.setBackground(new Color(0, 0, 0, 0)); 
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        ja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j.dispose();
            }			
        });
    }
}




