package EjercicioConversor;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel implements ActionListener {

	JTextField editableDolares = new JTextField(10);
	JTextField editableLibras = new JTextField(10);
	JTextField editableYenes = new JTextField(10);

	JLabel dolares_a_euros = new JLabel();
	JLabel libras_a_euros = new JLabel();
	JLabel yenes_a_euros = new JLabel();

	public Panel() {
		this.setLayout(null);
		this.setBackground(Color.DARK_GRAY);
		this.elementosPanel();

	}

	public void elementosPanel() {

		Font fuente = new Font("Verdana", 10, 21);

		JLabel etiquetaDolares = new JLabel();
		etiquetaDolares.setBounds(50, 50, 100, 50);
		etiquetaDolares.setText("Dólares");
		etiquetaDolares.setFont(fuente);
		etiquetaDolares.setForeground(Color.WHITE);

		JLabel etiquetaLibras = new JLabel();
		etiquetaLibras.setBounds(50, 150, 100, 50);
		etiquetaLibras.setText("Libras");
		etiquetaLibras.setFont(fuente);
		etiquetaLibras.setForeground(Color.WHITE);

		JLabel etiquetaYenes = new JLabel();
		etiquetaYenes.setBounds(50, 250, 100, 50);
		etiquetaYenes.setText("Yenes");
		etiquetaYenes.setFont(fuente);
		etiquetaYenes.setForeground(Color.WHITE);

		this.add(etiquetaDolares);
		this.add(etiquetaLibras);
		this.add(etiquetaYenes);

		this.editableDolares.setBounds(150, 65, 100, 25);
		this.editableDolares.setFont(fuente);

		this.editableLibras.setBounds(150, 165, 100, 25);
		this.editableLibras.setFont(fuente);

		this.editableYenes.setBounds(150, 265, 100, 25);
		this.editableYenes.setFont(fuente);

		this.add(editableDolares);
		this.add(editableLibras);
		this.add(editableYenes);

		dolares_a_euros.setBounds (600, 65, 100, 25);
		dolares_a_euros.setFont(fuente);
		dolares_a_euros.setForeground(Color.WHITE);
		dolares_a_euros.setText("0 €");
		

		libras_a_euros.setBounds (600, 165, 100, 25);
		libras_a_euros.setFont(fuente);
		libras_a_euros.setForeground(Color.WHITE);
		libras_a_euros.setText("0 €");

		yenes_a_euros.setBounds (600, 265, 100, 25);
		yenes_a_euros.setFont(fuente);
		yenes_a_euros.setForeground(Color.WHITE);
		yenes_a_euros.setText("0 €");

		this.add(dolares_a_euros);
		this.add(libras_a_euros);
		this.add(yenes_a_euros);

		JButton botonDolares = new JButton("Dólares a Euros");
		botonDolares.setFont(fuente);
		botonDolares.setBounds(275, 65, 275, 25);

		JButton botonLibras = new JButton("Libras a Euros");
		botonLibras.setFont(fuente);
		botonLibras.setBounds(275, 165, 275, 25);

		JButton botonYenes = new JButton("Yenes a Euros");
		botonYenes.setFont(fuente);
		botonYenes.setBounds(275, 265, 275, 25);

		botonDolares.addActionListener(this);
		botonLibras.addActionListener(this);
		botonYenes.addActionListener(this);

		this.add(botonDolares);
		this.add(botonLibras);
		this.add(botonYenes);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pulsado = (JButton) e.getSource();
		//System.out.println("El botón " + pulsado.getText() + " ha sido pulsado");

		double operacion = 0;
		String divisa = "";
		boolean con_coma = false;
		if (pulsado.getText().equalsIgnoreCase("Libras a Euros")) {
			if (this.editableLibras.getText().isEmpty()) {
				libras_a_euros.setText("Vacío");			
			}
			else {
				divisa = this.editableLibras.getText(); 
				if (divisa.indexOf(',') != -1) {
					divisa = divisa.replace(',','.');			
					con_coma = true;
				}
				operacion = Double.parseDouble(divisa) * 1.10;
				operacion = Math.round (operacion*100d)/100d;
				if (con_coma) {
					libras_a_euros.setText(String.valueOf(operacion).replace('.',','));
				}
				else {
					libras_a_euros.setText(String.valueOf(operacion));
				}
			}
		} else {
			if (pulsado.getText().equalsIgnoreCase("Dólares a Euros")) {
				if (this.editableDolares.getText().isEmpty()) {
					dolares_a_euros.setText("Vacío");
				}
				else {
					divisa = this.editableDolares.getText(); 
					if (divisa.indexOf(',') != -1) {
						divisa = divisa.replace(',','.');
						con_coma = true;
					}
					operacion = Double.parseDouble(divisa) * 0.88;
					operacion = Math.round (operacion*100d)/100d;
					if (con_coma) {
						dolares_a_euros.setText(String.valueOf(operacion).replace('.',','));
					}
					else {
						dolares_a_euros.setText(String.valueOf(operacion));
					}
						
				}
				
			} else {
				if (pulsado.getText().equalsIgnoreCase("Yenes a Euros")) {
					if (this.editableYenes.getText().isEmpty()) {
						yenes_a_euros.setText("Vacío");
					}
					else {
						divisa = this.editableYenes.getText(); 
						if (divisa.indexOf(',') != -1) {
							divisa = divisa.replace(',','.');
							con_coma = true;
						}
						operacion = Double.parseDouble(divisa) * 0.0082;
						operacion = Math.round (operacion*100d)/100d;
						if (con_coma) {
							yenes_a_euros.setText(String.valueOf(operacion).replace('.',','));
						}
						else {
							yenes_a_euros.setText(String.valueOf(operacion));
						}
					}
				}
			}
		}
	}
}
