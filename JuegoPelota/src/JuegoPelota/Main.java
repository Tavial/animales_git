package JuegoPelota;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		JFrame ventana = new JFrame ("Conduce la bolita hasta la meta");
		ventana.setBounds(100, 100, 800, 600);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setVisible(true);
		
		Panel panel = new Panel ();
		ventana.setContentPane(panel);
	}
	

	
}
