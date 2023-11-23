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
	JButton ja = new JButton("SI");
	JButton ja2 = new JButton("NO");
	JFrame j8;
	JFrame j;
	JFrame j9;
	JButton but = new JButton("NO");
	JButton bi = new JButton("OK");
	public void Otrascosas() {
        JFrame j = new JFrame();
        j.setSize(515, 150);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon im = new ImageIcon("panel.png");
        JLabel label = new JLabel(im);
        j.setLayout(null);
        label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
        j.add(label);
        JLabel mi = new JLabel("NO SE PERMITEN MAS DE 8 CARACTERES");
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
    	j9 = new JFrame();
        j9.setSize(515, 150);
        j9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon im = new ImageIcon("panel.png");
        JLabel label = new JLabel(im);
        j9.setLayout(null);
        label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
        j9.add(label);
        JLabel mi = new JLabel("INICIO DE SESIÓN EXITOSO");
        mi.setBounds(50, 10, 400, 30); 
        mi.setHorizontalAlignment(JLabel.CENTER);
        mi.setFont(Registro.fuente1);
        label.add(mi);
        bi = new JButton("OK");
        bi.setBounds(220, 70, 60, 30);
        label.add(bi);
        String color2 = "#027017";
        Color bac = Color.decode(color2);
        bi.setBackground(bac);
        bi.setFocusPainted(false);
        bi.setBorderPainted(false);
        j9.setResizable(false);
        j9.setUndecorated(true);
        j9.setBackground(new Color(0, 0, 0, 0)); 
        j9.setLocationRelativeTo(null);
        j9.setVisible(true);
        bi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j9.dispose();
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
        mi.setBounds(25, 10, 450, 30);  
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
	    mi.setBounds(25, 10, 450, 30); 
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
	    mi.setBounds(25, 10, 450, 30); 
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
	public void g() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("NO SE HA PODIDO ACTUALIZAR EL SALDO");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void h() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("LA CANTIDAD INGRESADA HA DE SER POSITIVA");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void i() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("INSERTA UN NUMERO VALIDO EN EL CAMPO");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void j() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("NO SE HA PODIDO COJER EL SALDO DE LA BASE DE DATOS");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void k() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("TIENES QUE RELLENAR EL CAMPO NOMBRE");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void l() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("EL NOMBRE NO PUEDE TENER MAS DE 15 LETRAS");
	    mi.setBounds(25, 10, 450, 30);  
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
	public void m() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("NOMBRE DE USUARIO CAMBIADO CORRECTAMENTE");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void n() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("NO SE PUDO OBTENER EL NOMBRE DE USUARIO");
	    mi.setBounds(25, 10, 450, 30);  
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
	public void o() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("NO SE PUDO OBTENER EL NOMBRE DE LA BASE DE DATOS");
	    mi.setBounds(25, 10, 450, 30);  
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
	public void botonpregunta() {
		j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("ESTAS SEGURO DE CAMBIAR TU CONTRASEÑA?");
	    mi.setBounds(25, 10, 450, 30); 
	    mi.setHorizontalAlignment(JLabel.CENTER);
	    mi.setFont(Registro.fuente1);
	    label.add(mi);    
	    ja.setBounds(130, 70, 60, 30);
	    label.add(ja);
	    String color2 = "#027017";
	    Color bac = Color.decode(color2);
	    ja.setBackground(bac);    
	    ja2.setBounds(300, 70, 60, 30);
	    label.add(ja2);
	    String color3 = "#027017";
	    Color bac2 = Color.decode(color3);
	    ja2.setBackground(bac2);
	    ja2.setFocusPainted(false);
	    ja2.setBorderPainted(false);
	    ja.setFocusPainted(false);
	    ja.setBorderPainted(false);
	    j.setResizable(false);
	    j.setUndecorated(true);
	    j.setBackground(new Color(0, 0, 0, 0)); 
	    j.setLocationRelativeTo(null);
	    j.setVisible(true);
	    
	}
	public void p() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("LAS CONTRASEÑAS NO COINCIDEN");
	    mi.setBounds(25, 10, 450, 30);  
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
	public void q() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("NO MAS DE 20 CARACTERES PORFAVOR");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void r() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("CONTRASEÑA ACTUALIZADA, INICIE SESION A CONTINUACION");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void s() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("NO SE PUEDE CAMBIAR LA CONTRASEÑA");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void t() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("PORFAVOR, RELLENA TODOS LOS CAMPOS");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void v() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("PORFAVOR, INTRODUZCA UN CORREO VALIDO");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void u() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("SU NOMBRE NO PUEDE CONTENER MAS DE 15 CARACTERES");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void w() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("SU CONTRASEÑA NO PUEDE CONTENER MAS DE 20 CARACTERES");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void x() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("SU CIUDAD NO PUEDE CONTENER MAS DE 20 CARACTERES");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void y() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("SUS APELLIDOS NO PUEDEN CONTENER MAS DE 50 CARACTERES");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void z() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("SU CORREO NO PUEDE CONTENER MAS DE 30 CARACTERES");
	    mi.setBounds(25, 10, 450, 30); 
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
	public void A() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("CORREO YA EXISTENTE");
	    mi.setBounds(25, 10, 450, 30); 
	    mi.setHorizontalAlignment(JLabel.CENTER);
	    mi.setFont(Registro.fuente1);
	    label.add(mi);
	    JLabel mi2 = new JLabel("CAMBIA EL CORREO O INICIA SESIÓN");
	    mi2.setBounds(25, 37, 450, 30); 
	    mi2.setHorizontalAlignment(JLabel.CENTER);
	    mi2.setFont(Registro.fuente1);
	    label.add(mi2);
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
	public void B() {
		j8 = new JFrame();
	    j8.setSize(515, 150);
	    j8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j8.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j8.add(label);
	    JLabel mi = new JLabel("REGISTRO EXITOSO, AHORA INICIE SESIÓN");
	    mi.setBounds(25, 10, 450, 30); 
	    mi.setHorizontalAlignment(JLabel.CENTER);
	    mi.setFont(Registro.fuente1);
	    label.add(mi);
	    but= new JButton("OK");
	    but.setBounds(220, 70, 60, 30);
	    label.add(but);
	    String color2 = "#027017";
	    Color bac = Color.decode(color2);
	    but.setBackground(bac);
	    but.setFocusPainted(false);
	    but.setBorderPainted(false);
	    j8.setResizable(false);
	    j8.setUndecorated(true);
	    j8.setBackground(new Color(0, 0, 0, 0)); 
	    j8.setLocationRelativeTo(null);
	    j8.setVisible(true);
	    but.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            j8.dispose();
	        }			
	    });
	}
	public void C() {
		JFrame j = new JFrame();
	    j.setSize(515, 150);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon im = new ImageIcon("panel.png");
	    JLabel label = new JLabel(im);
	    j.setLayout(null);
	    label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
	    j.add(label);
	    JLabel mi = new JLabel("CORREO YA EXISTENTE");
	    mi.setBounds(25, 10, 450, 30); 
	    mi.setHorizontalAlignment(JLabel.CENTER);
	    mi.setFont(Registro.fuente1);
	    label.add(mi);
	    JLabel mi2 = new JLabel("ERROR AL REGISTRAR EL USUARIO");
	    mi2.setBounds(25, 37, 450, 30); 
	    mi2.setHorizontalAlignment(JLabel.CENTER);
	    mi2.setFont(Registro.fuente1);
	    label.add(mi2);
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
	public void D() {
        JFrame j = new JFrame();
        j.setSize(515, 150);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon im = new ImageIcon("panel.png");
        JLabel label = new JLabel(im);
        j.setLayout(null);
        label.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
        j.add(label);
        JLabel mi = new JLabel("ERROR: EL VALOR MAXIMO ES 9999999.99 BROCOINS");
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
	public void ofertas() {
		JFrame of = new JFrame();
		of.setSize(600, 280);
		of.setLocationRelativeTo(null);
		of.setLayout(null);
		of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel a1 = new JLabel("POR 20€ --> 2 BROCOINS AHORA 5 BRO COINS ");
		JLabel a2 = new JLabel("POR 200€ --> 20 BROCOINS AHORA 40 BRO COINS ");
		JLabel a3 = new JLabel("POR 2000€ -->  200 BROCOINS AHORA 300 BRO COINS ");
		JLabel a4 = new JLabel("POR 20000€ -->  2000 BROCOINS AHORA 2500 BRO COINS ");
		
		a1.setBounds(5, 10, 500, 30);
		a1.setFont(Registro.fuente1);
		of.add(a1);
		a2.setBounds(5, 70, 500, 30);
		a2.setFont(Registro.fuente1);
		of.add(a2);
		a3.setBounds(5, 130, 500, 30);
		a3.setFont(Registro.fuente1);
		of.add(a3);
		a4.setBounds(5, 190, 500, 30);
		a4.setFont(Registro.fuente1);
		of.add(a4);
		 String colorFondo = "#579514";
         Color backgroundColor = Color.decode(colorFondo);
        of.getContentPane().setBackground(backgroundColor);
        ImageIcon imageIcon = new ImageIcon("moneda.gif");
        JLabel mo = new JLabel(imageIcon);
        mo.setBounds(340, 7, 30, 32);
        of.add(mo);
        
        ImageIcon imageIcon2 = new ImageIcon("moneda.gif");
        JLabel mo2 = new JLabel(imageIcon2);
        mo2.setBounds(370, 67, 30, 32);
        of.add(mo2);
        
        ImageIcon imageIcon3 = new ImageIcon("moneda.gif");
        JLabel mo3 = new JLabel(imageIcon3);
        mo3.setBounds(400, 127, 30, 32);
        of.add(mo3);
        
        ImageIcon imageIcon4 = new ImageIcon("moneda.gif");
        JLabel mo4 = new JLabel(imageIcon4);
        mo4.setBounds(430, 187, 30, 32);
        of.add(mo4);
        
		of.setVisible(true);
	}
}




