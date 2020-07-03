package MiDibujo;

import javax.swing.JFrame;

public class Lienzo extends JFrame {
	
	public Lienzo () {
		setTitle ("Formas geométricas");
		setBounds (0,0,470,500);
		Lamina1 capa0 = new Lamina1 ();
		add (capa0);
		
	}

}
