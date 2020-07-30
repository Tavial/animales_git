package Juego;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaDiferencias extends JFrame {

	PanelDiferencias1 Panel1 = new PanelDiferencias1 ();
	//PanelDiferencias2 Panel2 = new PanelDiferencias2 ();
	
	public VentanaDiferencias () {
		this.setTitle("Juego de las 5 diferencias");
		
		this.setBounds(100, 100, 1068, 566);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
			
		//EventosVentana oyente_ventana = new EventosVentana();
		//addWindowListener(oyente_ventana);
		
	}
	
	public void Juego1 () {
		this.add (Panel1);
	}
	
	
}
