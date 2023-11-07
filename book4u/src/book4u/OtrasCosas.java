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
        mi.setBounds(50, 10, 400, 30); 
        mi.setHorizontalAlignment(JLabel.CENTER);
        mi.setFont(Registro.fuente1);
        label.add(mi);
        ImageIcon cruz = new ImageIcon("cruz.png");
        JLabel cru = new JLabel(cruz);
        cru.setBounds(290, 45, 50, 50);
        label.add(cru);
        ImageIcon cruz2 = new ImageIcon("cruz.png");
        JLabel cru2 = new JLabel(cruz2);
        cru2.setBounds(160, 45, 50, 50);
        label.add(cru2);
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
        mi.setBounds(50, 10, 400, 30); 
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
        mi.setBounds(50, 10, 400, 30); 
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
        mi.setBounds(50, 10, 400, 30);  
        mi.setHorizontalAlignment(JLabel.CENTER);
        mi.setFont(Registro.fuente1);
        label.add(mi);
        ImageIcon cruz = new ImageIcon("cruz.png");
        JLabel cru = new JLabel(cruz);
        cru.setBounds(290, 45, 50, 50);
        label.add(cru);
        ImageIcon cruz2 = new ImageIcon("cruz.png");
        JLabel cru2 = new JLabel(cruz2);
        cru2.setBounds(160, 45, 50, 50);
        label.add(cru2);
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
    public void c() {
    	JFrame j = new JFrame();
        j.setSize(515, 150);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon im = new ImageIcon("panel.png");
        JLabel label = new JLabel(im);
        j.setLayout(null);
        label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
        j.add(label);
        JLabel mi = new JLabel("ERROR AL CONECTAR CON LA BASE DE DATOS");
        mi.setBounds(50, 10, 400, 30); 
        mi.setHorizontalAlignment(JLabel.CENTER);
        mi.setFont(Registro.fuente1);
        label.add(mi);
        ImageIcon cruz = new ImageIcon("cruz.png");
        JLabel cru = new JLabel(cruz);
        cru.setBounds(290, 45, 50, 50);
        label.add(cru);
        ImageIcon cruz2 = new ImageIcon("cruz.png");
        JLabel cru2 = new JLabel(cruz2);
        cru2.setBounds(160, 45, 50, 50);
        label.add(cru2);
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
public void d() {
    	JFrame j = new JFrame();
        j.setSize(515, 150);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon im = new ImageIcon("panel.png");
        JLabel label = new JLabel(im);
        j.setLayout(null);
        label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
        j.add(label);
        JLabel mi = new JLabel("ERROR AL CONSULTAR LA BASE DE DATOS");
        mi.setBounds(50, 10, 400, 30); 
        mi.setHorizontalAlignment(JLabel.CENTER);
        mi.setFont(Registro.fuente1);
        label.add(mi);
        ImageIcon cruz = new ImageIcon("cruz.png");
        JLabel cru = new JLabel(cruz);
        cru.setBounds(290, 45, 50, 50);
        label.add(cru);
        ImageIcon cruz2 = new ImageIcon("cruz.png");
        JLabel cru2 = new JLabel(cruz2);
        cru2.setBounds(160, 45, 50, 50);
        label.add(cru2);
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
public void e() {
	JFrame j = new JFrame();
    j.setSize(515, 150);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ImageIcon im = new ImageIcon("panel.png");
    JLabel label = new JLabel(im);
    j.setLayout(null);
    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
    j.add(label);
    JLabel mi = new JLabel("NOMBRE DE USUARIO ESTA VACÍO");
    mi.setBounds(50, 10, 400, 30); 
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
public void f() {
	JFrame j = new JFrame();
    j.setSize(515, 150);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ImageIcon im = new ImageIcon("panel.png");
    JLabel label = new JLabel(im);
    j.setLayout(null);
    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
    j.add(label);
    JLabel mi = new JLabel("NO SE PUDO OBTENER EL NOMBRE DE LA BASE DE DATOS");
    mi.setBounds(12, 10, 475, 30); 
    mi.setHorizontalAlignment(JLabel.CENTER);
    mi.setFont(Registro.fuente1);
    label.add(mi);
    ImageIcon cruz = new ImageIcon("cruz.png");
    JLabel cru = new JLabel(cruz);
    cru.setBounds(290, 45, 50, 50);
    label.add(cru);
    ImageIcon cruz2 = new ImageIcon("cruz.png");
    JLabel cru2 = new JLabel(cruz2);
    cru2.setBounds(160, 45, 50, 50);
    label.add(cru2);
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




