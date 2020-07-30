package Juego;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.io.FileWriter;

public class PanelDiferencias1 extends JPanel implements MouseListener{
	
	private Image imagen = null;
	private FileWriter records;
	private Date inicio;
	private Date fin;
	public boolean terminado = false;
	private boolean [] aciertos = {false,false,false,false,false};
	
	public PanelDiferencias1 () {
		//cargamos la imagen que va a ocupar nuestro panel
		
		File archivoImagen = new File ("imagen1.jpg");

		// para ello tenemos que ir a buscarla al directorio de disco
		try {
			imagen = ImageIO.read(archivoImagen);
		} catch (IOException e) {
			System.out.println ("No se ha encontrado el archivo");
		}
		
		this.addMouseListener(this);
		this.inicio = new Date ();

	}
	
	public void paint (Graphics g) {
		//dibujamos la imagen cargada de disco en el panel
		g.drawImage(imagen, 0, 0, this);
		
		
		
		//dibujamos los aciertos 
		
		if (aciertos[0]) {
			g.drawRect (791, 21, 41, 47);
		}
		if (aciertos[1]) {
			g.drawRect (635, 223, 53, 48);
		}
		if (aciertos[2]) {
			g.drawRect (629, 475, 60, 37);
		}
		if (aciertos[3]) {
			g.drawRect (846, 398, 61, 113);
		}
		if (aciertos[4]) {
			g.drawRect (1008, 434, 25, 24);
		}
		
		
	}
	
	

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		System.out.println ("x = "+x+", y = "+y);
		
		
		if (x >= 791 && y >= 21 && x <= 832 && y <= 68 && !aciertos[0]) {	
			
			aciertos[0] = true;		
			repaint (); // solicitamos que se repinte la lámina para que quede recuadrado el acierto
		}
		
		if (x >= 635 && y >= 223 && x <= 688 && y <= 271 && !aciertos[1]) {	
			
			aciertos[1] = true;	
			repaint (); // solicitamos que se repinte la lámina para que quede recuadrado el acierto
		}
		
		if (x >= 629 && y >= 475 && x <= 689 && y <= 512 && !aciertos[2]) {	
			
			aciertos[2] = true;	
			repaint (); // solicitamos que se repinte la lámina para que quede recuadrado el acierto
		}
		
		if (x >= 846 && y >= 398 && x <= 907 && y <= 511 && !aciertos[3]) {	
			
			aciertos[3] = true;	
			repaint (); // solicitamos que se repinte la lámina para que quede recuadrado el acierto
		}
		
		if (x >= 1008 && y >= 434 && x <= 1033 && y <= 458 && !aciertos[4]) {	
			
			aciertos[4] = true;
			repaint (); // solicitamos que se repinte la lámina para que quede recuadrado el acierto
		}
		
		if (aciertos[0] && aciertos [1] && aciertos [2] && aciertos [3] && aciertos [4]) {
			this.fin = new Date ();
			double tiempo = (fin.getTime()-inicio.getTime())/1000;
			JOptionPane.showMessageDialog(this, "Has acertado todas las diferencias en un tiempo de: "+tiempo+" segundos");
			String nombre = JOptionPane.showInputDialog("Introduce tu nombre para añadirlo al de mejores jugadores");
			this.records = null;
			try {
				this.records = new FileWriter ("records.txt",true);
				if (nombre != null) {
					records.write (nombre+" -> Tiempo: "+tiempo+" segundos"+"\n");
				}
				else { //por si se pulsa cancelar en vez de meter el nombre
					records.write ("Anónimo"+" -> Tiempo: "+tiempo+" segundos"+"\n");
				}
				this.records.close();
			}
			catch (Exception ex) {
				System.out.println("Mensaje de la excepción: "+ex.getMessage());
			}
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

	
	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
}
