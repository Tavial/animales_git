package gestorVentana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Avestruz;
import modelo.Canario;
import modelo.Gallo;
import modelo.Gato;
import modelo.Loro;
import modelo.Murcielago;
import modelo.Tenor;
import modelo.Tigre;
import vista.VentanaPrincipal;

public class GestorVentana implements ActionListener {
	
	//instanciamos un objeto ventanaPrincipal para poder trabajar con ella
	private VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
	
	//en el constructor indicamos las acciones de los botones del panel de la ventana principal
	//que van a ser tratadas
	public GestorVentana () {
	
		ventanaPrincipal.getBotonTenor().addActionListener(this);
		ventanaPrincipal.getBotonCanario().addActionListener(this);
		ventanaPrincipal.getBotonMurcielago().addActionListener(this);
		ventanaPrincipal.getBotonTigre().addActionListener(this);
		ventanaPrincipal.getBotonGallo().addActionListener(this);
		ventanaPrincipal.getBotonAvestruz().addActionListener(this);
		ventanaPrincipal.getBotonGato().addActionListener(this);
		ventanaPrincipal.getBotonLoro().addActionListener(this);
		
		//llamamos a la ventana principal
		ventanaPrincipal.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//detectamos el elemento pulsado
		Object elementoPulsado = e.getSource();
		//si pulsamos el botón Tenor
		if (elementoPulsado == ventanaPrincipal.getBotonTenor()) {
			Tenor tenor = new Tenor ();
			ventanaPrincipal.getPizarra().setText(null);
			ventanaPrincipal.getPizarra().setText(tenor.toString());
		}
		if (elementoPulsado == ventanaPrincipal.getBotonCanario()) {
			Canario canario = new Canario ();
			ventanaPrincipal.getPizarra().setText(null);
			ventanaPrincipal.getPizarra().setText(canario.toString());
		}
		if (elementoPulsado == ventanaPrincipal.getBotonMurcielago()) {
			Murcielago murcielago = new Murcielago ();
			ventanaPrincipal.getPizarra().setText(null);
			ventanaPrincipal.getPizarra().setText(murcielago.toString());
		}
		if (elementoPulsado == ventanaPrincipal.getBotonTigre()) {
			Tigre tigre = new Tigre ();
			ventanaPrincipal.getPizarra().setText(null);
			ventanaPrincipal.getPizarra().setText(tigre.toString());
		}
		if (elementoPulsado == ventanaPrincipal.getBotonGallo()) {
			Gallo gallo = new Gallo ();
			ventanaPrincipal.getPizarra().setText(null);
			ventanaPrincipal.getPizarra().setText(gallo.toString());
		}
		if (elementoPulsado == ventanaPrincipal.getBotonAvestruz()) {
			Avestruz avestruz = new Avestruz ();
			ventanaPrincipal.getPizarra().setText(null);
			ventanaPrincipal.getPizarra().setText(avestruz.toString());
		}
		if (elementoPulsado == ventanaPrincipal.getBotonGato()) {
			Gato gato = new Gato ();
			ventanaPrincipal.getPizarra().setText(null);
			ventanaPrincipal.getPizarra().setText(gato.toString());
		}
		if (elementoPulsado == ventanaPrincipal.getBotonLoro()) {
			Loro loro = new Loro ();
			ventanaPrincipal.getPizarra().setText(null);
			ventanaPrincipal.getPizarra().setText(loro.toString());
		}
	
		
	}

}
