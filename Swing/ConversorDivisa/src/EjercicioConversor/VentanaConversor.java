package EjercicioConversor;

import javax.swing.JFrame;

public class VentanaConversor extends JFrame {
	
	Panel panel = new Panel ();
	
	public VentanaConversor () {
		this.setBounds(125, 125, 800, 600);
		this.setTitle("Conversor de divisas");
		this.setVisible(true);
		this.add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
}
