package book4u;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaldoDialog extends JDialog {
	public SaldoDialog(JFrame parentFrame) {
	    super(parentFrame, "Saldo Inválido", true); // El segundo parámetro establece que es un diálogo modal
	    setLayout(new BorderLayout());

	    // Crea una etiqueta con la imagen papi y la coloca en el centro del diálogo
	    ImageIcon papiIcon = new ImageIcon("papi.png");
	    JLabel imageLabel = new JLabel(papiIcon);
	    imageLabel.setHorizontalAlignment(JLabel.CENTER);
	    add(imageLabel, BorderLayout.CENTER);

	    // Crea un botón "OK" y lo coloca en la parte inferior del diálogo
	    JButton okButton = new JButton("OK");
	    okButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            dispose(); // Cierra el diálogo al hacer clic en el botón "OK"
	        }
	    });
	    JPanel buttonPanel = new JPanel();
	    buttonPanel.add(okButton);
	    add(buttonPanel, BorderLayout.SOUTH);

	    setSize(500, 400); // Aumenta el tamaño del diálogo
	    setLocationRelativeTo(parentFrame); // Lo centra en relación al frame principal
	}
}

