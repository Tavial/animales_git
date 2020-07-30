package Juego;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelDiferencias2 extends JPanel implements MouseListener{
	
	private Image imagen = null;
	public boolean terminado = false;
	private boolean [] aciertos = {false,false,false,false,false};
	
	public PanelDiferencias2 () {

		//cargamos la imagen que va a ocupar nuestro panel
			
		File archivoImagen = new File ("imagen2.jpg");

		// para ello tenemos que ir a buscarla al directorio de disco
		try {
			imagen = ImageIO.read(archivoImagen);
			} catch (IOException e) {
				System.out.println ("No se ha encontrado el archivo");
			}
			
		this.addMouseListener(this);
	}

	
	public void paint (Graphics g) {
		//dibujamos la imagen cargada de disco en el panel
		g.drawImage(imagen, 0, 0, this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
