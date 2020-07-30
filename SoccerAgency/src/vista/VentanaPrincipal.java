package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuItem menuListadoJugadores;
	private JMenuItem menuAltaJugador;
	private JMenuItem menuListadoJList;
	private JMenuItem menu_tablaJugadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("SOCCER AGENCY - Representante de jugadores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 586);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuJugadores = new JMenu("Jugadores");
		menuJugadores.setFont(new Font("Candara", Font.PLAIN, 16));
		menuBar.add(menuJugadores);
		
		menuAltaJugador = new JMenuItem("Alta nuevo jugador");
		menuAltaJugador.setFont(new Font("Candara", Font.PLAIN, 20));
		menuJugadores.add(menuAltaJugador);
		
		JSeparator separadorHorizontal = new JSeparator();
		menuJugadores.add(separadorHorizontal);
		
		menuListadoJugadores = new JMenuItem("Listado de jugadores");
		menuListadoJugadores.setFont(new Font("Candara", Font.PLAIN, 20));
		menuJugadores.add(menuListadoJugadores);
		
		menu_tablaJugadores = new JMenuItem("Tabla de jugadores");
		menu_tablaJugadores.setFont(new Font("Candara", Font.PLAIN, 20));
		menuJugadores.add(menu_tablaJugadores);
		
		JSeparator separador2 = new JSeparator();
		menuJugadores.add(separador2);
		
		menuListadoJList = new JMenuItem("Modificar / Borrar jugador");
		menuListadoJList.setFont(new Font("Candara", Font.PLAIN, 20));
		menuJugadores.add(menuListadoJList);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public JMenuItem getMenuListadoJugadores() {
		return menuListadoJugadores;
	}

	public JMenuItem getMenuAltaJugador() {
		return menuAltaJugador;
	}
	public JMenuItem getMenuListadoJList() {
		return menuListadoJList;
	}
	public JMenuItem getMenu_tablaJugadores() {
		return menu_tablaJugadores;
	}
}
