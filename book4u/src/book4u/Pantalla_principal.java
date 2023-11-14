package book4u;

import javax.swing.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pantalla_principal extends JFrame {
    private boolean menuvisible = false;
    public Font fuenti = new Font("Agency FB", Font.BOLD, 40);
    public Font fuenti2 = new Font("Agency FB", Font.BOLD, 30);
    
    public Pantalla_principal() {
        JPanel pan = new JPanel();
        pan.setBounds(0, 0, 800, 75);
        pan.setVisible(true);
        pan.setBackground(Color.WHITE);
        pan.setLayout(null);
        this.add(pan);
        ImageIcon imagen = new ImageIcon("logo.png");
        JLabel ima = new JLabel(imagen);
        ima.setBounds(0, -25, 150, 150);
        pan.add(ima);
        String color2 = "#027017";
        Color bac = Color.decode(color2);

        String correo = Login.usernameField.getText();
        String contraseña = String.valueOf(Login.getPasswordField().getPassword());
        double din = obtenerdinero(correo, contraseña);
        String nombre = obtenerNombreDesdeBaseDeDatos(correo, contraseña);
        JLabel mama = new JLabel("Saldo: " + din);
        mama.setHorizontalAlignment(JLabel.RIGHT);
        mama.setBounds(505, 75, 250, 50);
        mama.setFont(fuenti2);
        JLabel titi = new JLabel("BIENVENIDO A BOOK4U " + nombre);
        titi.setHorizontalAlignment(JLabel.CENTER);
        titi.setBounds(100, 100, 600, 50);
        titi.setFont(fuenti);
        

        
        // Crear un JLayeredPane para administrar las capas
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 800, 500);
        this.add(layeredPane);

        JPanel nep = new JPanel();
        nep.setLayout(null);
        nep.setBounds(50, 160, 200, 270);
        ImageIcon can = new ImageIcon("canarias.jpg");
        JLabel can1 = new JLabel(can);
        can1.setBounds(15, 15, 170, 120);
        nep.add(can1);
        JLabel gran = new JLabel("ISLAS CANARIAS");
        gran.setFont(Registro.fuente1);
        gran.setHorizontalAlignment(JLabel.CENTER);
        gran.setBounds(25, 170, 150, 25);
        nep.add(gran);
        layeredPane.add(nep, JLayeredPane.DEFAULT_LAYER);
       
        
        JPanel nep2 = new JPanel();
        nep2.setLayout(null);
        nep2.setBounds(293, 160, 200, 270);
        ImageIcon cant = new ImageIcon("paris.jpg");
        JLabel can2 = new JLabel(cant);
        can2.setBounds(15, 15, 170, 120);
        nep2.add(can2);
        JLabel gran2 = new JLabel("PARIS, FRANCIA");
        gran2.setFont(Registro.fuente1);
        gran2.setHorizontalAlignment(JLabel.CENTER);
        gran2.setBounds(25, 170, 150, 25);
        nep2.add(gran2);
        layeredPane.add(nep2, JLayeredPane.DEFAULT_LAYER);

        JPanel nep3 = new JPanel();
        nep3.setLayout(null);
        nep3.setBounds(535, 160, 200, 270);
        ImageIcon canto = new ImageIcon("colombia.jpg");
        JLabel can3 = new JLabel(canto);
        can3.setBounds(15, 15, 170, 120);
        nep3.add(can3);
        JLabel gran3 = new JLabel("<html>FARO DE CASTILLOGRANDE ,<br>COLOMBIA</html>");
        gran3.setFont(Registro.fuente1);
        gran3.setBounds(25, 170, 150, 75);
        nep3.add(gran3);
        layeredPane.add(nep3, JLayeredPane.DEFAULT_LAYER);

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
        
        // Ajusta la capa de desp para que esté por encima de nep3
        layeredPane.add(desp, JLayeredPane.PALETTE_LAYER);

        add(titi);
        add(mama);

        setTitle("BOOK4U- Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        String colorfondo = "#579514";
        Color backgroundColor = Color.decode(colorfondo);
        this.getContentPane().setBackground(backgroundColor);

        JLabel titulo = new JLabel("BOOK4U");
        titulo.setBounds(325, 20, 450, 40);
        titulo.setForeground(Color.black);
        titulo.setFont(Registro.fuente);

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

        JButton HistorialButton =  new JButton("HISTORIAL");
        HistorialButton.setBounds(45, 290, 150, 50);
        HistorialButton.setFont(Registro.fuente1);
        HistorialButton.setBackground(Color.white);
        HistorialButton.setForeground(Color.black);

        JButton AtrasButton = new JButton("CERRAR SESIÓN");
        AtrasButton.setBounds(45, 390, 150, 50);
        AtrasButton.setFont(Registro.fuente1);
        AtrasButton.setBackground(Color.white);
        AtrasButton.setForeground(Color.black);

        pan.add(titulo);
        desp.add(InicioButton);
        desp.add(UsuarioButton);
        desp.add(HistorialButton);
        desp.add(AtrasButton);
        ImageIcon imageIcon = new ImageIcon("moneda.gif");
        JLabel mo = new JLabel(imageIcon);
        mo.setBounds(750, 82, 30, 32);
        this.add(mo);
        setVisible(true);

        ne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuvisible = !menuvisible;
                if (menuvisible) {
                    desp.setVisible(true);
                } else {
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
        InicioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                pantalla_reserva pat = new pantalla_reserva();
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
    public double obtenerdinero(String correo, String contraseña) {
        double mon = -1;
        try {
            String selectQuery = "SELECT DINERO FROM USUARIO WHERE CORREO = ? AND CONTRASEÑA = ?";
            PreparedStatement preparedStatement = Login.connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, correo);
            preparedStatement.setString(2, contraseña);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                
                mon = resultSet.getDouble("DINERO");
            }
            
            resultSet.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return mon;
    }

}
