package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class PanelBienvenida extends JPanel {

	private Image imagenBienvenida = null;
	/**
	 * Create the panel.
	 */
	public PanelBienvenida() {
		setBackground(SystemColor.menu);
		setLayout(null);
		File archivoImagen = new File ("portada.jpg");
		
		try {
			imagenBienvenida = ImageIO.read(archivoImagen);
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// Mostramos la imagen de bienvenida
		g.drawImage(imagenBienvenida, 0, 0, 960, 510, this);
		
	}
}
