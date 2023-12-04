package book4u;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.toedter.calendar.JDateChooser;

public class reservas extends JFrame {

    JPanel panel2 = new JPanel();
    private List<Integer> idReservasList = new ArrayList<>();
    public reservas() {
    
        setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        String colorfondo = "#579514";
        Color backgroundColor = Color.decode(colorfondo);
        this.getContentPane().setBackground(backgroundColor);
        JPanel pan = new JPanel();
        pan.setBounds(0, 0, 1200, 75);
        pan.setVisible(true);
        pan.setBackground(Color.WHITE);
        pan.setLayout(null);
        this.add(pan);

        panel2 = new JPanel();
        panel2.setBackground(Color.BLACK);
        panel2.setBounds(30, 130, 1125, 600);
        panel2.setLayout(null);

        JLabel tit = new JLabel("RESERVAS");
        tit.setHorizontalAlignment(JLabel.CENTER);
        tit.setFont(Registro.fuente);
        tit.setBounds(375, 0, 400, 75);
        pan.add(tit);

        JLabel dataLabel1 = new JLabel(
                "DIA D'ENTRADA                              LUGAR                              PRECIO                              PAIS                              DIA_SALIDA ");
        dataLabel1.setBounds(100, 90, 1000, 30);
        this.add(dataLabel1);
        dataLabel1.setFont(Registro.fuente1);
        retrieveAndDisplayData();

        this.add(panel2);   

        // Botón back
        ImageIcon back = new ImageIcon("back.png");
        JButton but = new JButton(back);
        but.setBounds(10, 90, 30, 30);
        but.setFont(Registro.fuente1);
        but.setFocusPainted(false);
        but.setBorderPainted(false);
        but.setContentAreaFilled(false);
        this.add(but);
        but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Pantalla_principal pat = new Pantalla_principal();
            }
        });

        this.setVisible(true);
    }

    private void retrieveAndDisplayData() {
        try {
            Statement statement = Login.connection.createStatement();
            String query = "SELECT IDRESERVA, DIA, LUGAR, PRECIO, PAIS, DIA_SALIDA FROM RESERVAS WHERE CORREO = '"+Login.usernameField.getText()+"'";            
            ResultSet resultSet = statement
                    .executeQuery(query);

            
            boolean hasData = false;

            while (resultSet.next()) {
                int idReserva = resultSet.getInt("IDRESERVA");
                Date fecha = resultSet.getDate("DIA");
                String lugar = resultSet.getString("LUGAR");
                String precio = resultSet.getString("PRECIO");
                String pais = resultSet.getString("PAIS");
                Date diaSalida = resultSet.getDate("DIA_SALIDA");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String diaFormateado = dateFormat.format(fecha);
                String diasalida = dateFormat.format(diaSalida);

                Font font = new Font("Agency FB", Font.BOLD, 23);
                JLabel dataLabel = new JLabel(diaFormateado);

                int labelHeight = 30;
                int labelSpacing = 10;
                int yPosition = (resultSet.getRow() - 1) * (labelHeight + labelSpacing);

                dataLabel.setBounds(70, yPosition, 150, labelHeight);
                dataLabel.setFont(font);

                ImageIcon moni = new ImageIcon("moneda.gif");
                JLabel lugar1 = new JLabel(lugar);

                int labelHeight1 = 30;
                int labelSpacing1 = 10;
                int yPosition1 = (resultSet.getRow() - 1) * (labelHeight1 + labelSpacing1);

                lugar1.setBounds(330, yPosition1, 150, labelHeight1);
                lugar1.setFont(font);

                JLabel precio1 = new JLabel(precio);
                int labelHeight2 = 30;
                int labelSpacing2 = 10;
                int yPosition2 = (resultSet.getRow() - 1) * (labelHeight2 + labelSpacing2);

                precio1.setBounds(510, yPosition2, 150, labelHeight2);
                precio1.setFont(font);
                precio1.setIcon(moni);

                JLabel pais1 = new JLabel(pais);
                int labelHeight3 = 30;
                int labelSpacing3 = 10;
                int yPosition3 = (resultSet.getRow() - 1) * (labelHeight3 + labelSpacing3);

                pais1.setBounds(730, yPosition3, 150, labelHeight3);
                pais1.setFont(font);

                JLabel salida = new JLabel(diasalida);
                int labelHeight4 = 30;
                int labelSpacing4 = 10;
                int yPosition4 = (resultSet.getRow() - 1) * (labelHeight4 + labelSpacing4);

                salida.setBounds(910, yPosition4, 150, labelHeight4);
                salida.setFont(font);

             // Botón Modificar
                
                JButton botonModificar = new JButton();
                botonModificar.setBounds(1035, yPosition, 35, 30);
                botonModificar.setFont(Registro.fuente1);
                botonModificar.setFocusPainted(false);
                botonModificar.setBorderPainted(false);
                botonModificar.setContentAreaFilled(false);

                ImageIcon iconoModificar = new ImageIcon("Editar.png");
                botonModificar.setIcon(iconoModificar);

                botonModificar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Mostrar un cuadro de diálogo para que el usuario ingrese las nuevas fechas
                        dispose();
                        try {
                            // Obtener el índice de la reserva en la lista
                            int index = idReservasList.indexOf(idReserva);
                            
                            // Verificar si se encuentra el idReserva en la lista
                            if (index != -1) {
                                // Obtener el idReserva correspondiente al índice
                                int idReservaSeleccionado = idReservasList.get(index);
                                
                                // Crear una instancia de editar_reserva con el idReserva
                                editar_reserva re = new editar_reserva(idReservaSeleccionado);
                            } else {
                                // Manejar el caso en el que no se encuentre el idReserva
                                System.out.println("ID de reserva no encontrado en la lista.");
                            }
                        } catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

                this.add(botonModificar);
                panel2.add(botonModificar);
              
                


                // Botón Borrar
                JButton botonBorrar = new JButton();
                botonBorrar.setBounds(1080, yPosition, 35, 30);
                botonBorrar.setFont(Registro.fuente1);
                botonBorrar.setFocusPainted(false);
                botonBorrar.setBorderPainted(false);
                botonBorrar.setContentAreaFilled(false);

                ImageIcon iconoBorrar = new ImageIcon("Borrar.png");
                botonBorrar.setIcon(iconoBorrar);

                botonBorrar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        borrarReserva(idReserva);
                        
                    }
                });

                this.add(botonBorrar);
                panel2.add(botonBorrar);

                panel2.add(salida);
                panel2.add(pais1);
                panel2.add(lugar1);
                panel2.add(dataLabel);
                panel2.add(precio1);
                salida.setForeground(Color.white);
                pais1.setForeground(Color.white);
                dataLabel.setForeground(Color.white);
                lugar1.setForeground(Color.white);
                precio1.setForeground(Color.white);

                hasData = true;
                idReservasList.add(idReserva);
            }

            resultSet.close();
            statement.close();

            if (!hasData) {
                JLabel noDataLabel = new JLabel("No hay datos disponibles todavía.");
                noDataLabel.setForeground(Color.white);
                panel2.add(noDataLabel);
            }

            panel2.revalidate();
            panel2.repaint();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void resetearClase() {
        // Cierra la ventana actual
        dispose();

        // Crea una nueva instancia de la clase reservas
        reservas nuevaReserva = new reservas();
    }



    public void borrarReserva(int idReserva) {
        // Mostrar un cuadro de diálogo de confirmación
    	OtrasCosas on = new OtrasCosas();
    	on.botonpregunta1();
        

        // Verificar la respuesta del usuario
    	 on.UNO.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
            // Lógica para borrar la reserva de la base de datos
            String sql = "DELETE FROM RESERVAS WHERE IDRESERVA = " + idReserva;

            try {
                Statement statement = Login.connection.createStatement();
                statement.executeUpdate(sql);
                statement.close();
            } catch (Exception e1) {
                e1.printStackTrace();
                on.sica.dispose(); 
                // Manejar la excepción según tus necesidades
            }

            // Actualizar la interfaz gráfica con los datos actualizados
            retrieveAndDisplayData();
            dispose();
            on.sica.dispose();
            reservas re = new reservas();
             }
    	 });
    	 
    	 
    	 on.DOS.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
            // Lógica para borrar la reserva de la base de datos
            	 if (on.sica != null) {
                     on.sica.dispose(); // Cerrar la ventana al presionar "NO"
                 }
	                
                 return;
             }
    	 });
    	 
    }

    public List<Integer> getIdReservasList() {
        return idReservasList;
    }
    public double obtenerSaldoDesdeBaseDeDatos(String correo, String contraseña) {
	    double saldo4 = -1; // Valor por defecto si no se encuentra el saldo
	    try {
	        String selectQuery = "SELECT DINERO FROM USUARIO WHERE CORREO = ? AND CONTRASEÑA = ?";
	        PreparedStatement preparedStatement = Login.connection.prepareStatement(selectQuery);
	        preparedStatement.setString(1, correo);
	        preparedStatement.setString(2, contraseña);
	        ResultSet resultSet = preparedStatement.executeQuery();

	        if (resultSet.next()) {
	        	saldo4 = resultSet.getDouble("DINERO");
	        }

	        resultSet.close();
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	    return saldo4;
	}
}




