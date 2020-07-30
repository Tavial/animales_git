package Juego;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventosVentana implements WindowListener {

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println ("Ventana activada");
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println ("Ventana secundaria cerrándose");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println ("Ventana cerrándose");
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println ("Ventana desactivada");
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println ("Ventana abierta");
		
	} //clase oyente

	
}
