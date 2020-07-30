package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class PanelEdicionJugador extends JPanel {
	private JTextField edit_nombre;
	private JTextField edit_edad;
	private JTextField edit_peso;
	private JTextField edit_altura;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton boton_guardarCambios;
	private JComboBox combo_demarcacion;
	private JRadioButton radio_nacional;
	private JRadioButton radio_extranjero;
	private JComboBox combo_equipo;
	private JLabel etq_fotografia;
	private JButton botonCargarImagen;

	/**
	 * Create the panel.
	 */
	public PanelEdicionJugador() {
		setBackground(new Color(0, 51, 153));
		setForeground(Color.WHITE);
		setLayout(null);
		
		JLabel etq_EditarJugador = new JLabel("MODIFICAR FICHA DE JUGADOR");
		etq_EditarJugador.setBounds(301, 23, 354, 32);
		etq_EditarJugador.setForeground(Color.WHITE);
		etq_EditarJugador.setFont(new Font("Candara", Font.BOLD, 26));
		add(etq_EditarJugador);
		
		JSeparator separador_titulo = new JSeparator();
		separador_titulo.setBounds(40, 68, 892, 9);
		add(separador_titulo);
		
		JLabel etq_nombre = new JLabel("Nombre: ");
		etq_nombre.setBounds(40, 102, 89, 32);
		etq_nombre.setForeground(Color.WHITE);
		etq_nombre.setFont(new Font("Candara", Font.BOLD, 22));
		add(etq_nombre);
		
		JLabel etq_demarcacion = new JLabel("Demarcaci\u00F3n: ");
		etq_demarcacion.setBounds(40, 163, 154, 32);
		etq_demarcacion.setForeground(Color.WHITE);
		etq_demarcacion.setFont(new Font("Candara", Font.BOLD, 22));
		add(etq_demarcacion);
		
		JLabel etq_edad = new JLabel("Edad:");
		etq_edad.setBounds(40, 364, 69, 32);
		etq_edad.setForeground(Color.WHITE);
		etq_edad.setFont(new Font("Candara", Font.BOLD, 22));
		add(etq_edad);
		
		JLabel etq_peso = new JLabel("Peso (kg):");
		etq_peso.setBounds(40, 282, 114, 32);
		etq_peso.setForeground(Color.WHITE);
		etq_peso.setFont(new Font("Candara", Font.BOLD, 22));
		add(etq_peso);
		
		JLabel etq_altura = new JLabel("Altura (cm):");
		etq_altura.setBounds(40, 319, 141, 32);
		etq_altura.setForeground(Color.WHITE);
		etq_altura.setFont(new Font("Candara", Font.BOLD, 22));
		add(etq_altura);
		
		JLabel etq_equipo = new JLabel("Equipo: ");
		etq_equipo.setBounds(40, 222, 94, 32);
		etq_equipo.setForeground(Color.WHITE);
		etq_equipo.setFont(new Font("Candara", Font.BOLD, 22));
		add(etq_equipo);
		
		edit_nombre = new JTextField();
		edit_nombre.setBounds(191, 101, 354, 33);
		edit_nombre.setFont(new Font("Candara", Font.PLAIN, 22));
		add(edit_nombre);
		edit_nombre.setColumns(10);
		
		edit_edad = new JTextField();
		edit_edad.setBounds(191, 369, 39, 22);
		edit_edad.setFont(new Font("Candara", Font.PLAIN, 22));
		edit_edad.setColumns(10);
		add(edit_edad);
		
		edit_peso = new JTextField();
		edit_peso.setBounds(191, 287, 57, 22);
		edit_peso.setFont(new Font("Candara", Font.PLAIN, 22));
		edit_peso.setColumns(10);
		add(edit_peso);
		
		edit_altura = new JTextField();
		edit_altura.setBounds(188, 324, 57, 22);
		edit_altura.setFont(new Font("Candara", Font.PLAIN, 22));
		edit_altura.setColumns(10);
		add(edit_altura);
		
		combo_demarcacion = new JComboBox();
		combo_demarcacion.setBounds(188, 163, 183, 33);
		combo_demarcacion.setModel(new DefaultComboBoxModel(new String[] {"Portero", "Defensa", "Centrocampista", "Delantero"}));
		combo_demarcacion.setFont(new Font("Candara", Font.PLAIN, 22));
		add(combo_demarcacion);
		
		combo_equipo = new JComboBox();
		combo_equipo.setBounds(191, 222, 232, 33);
		combo_equipo.setModel(new DefaultComboBoxModel(new String[] {"Athletic Club", "Atl\u00E9tico Madrid", "Barcelona", "Celta de Vigo", "Deportivo Alav\u00E9s", "Espanyol", "Getafe", "Granada", "Levante", "Legan\u00E9s", "Mallorca", "Osasuna", "Real Betis", "Real Madrid", "Real Sociedad", "Real Valladolid", "SD Eibar", "Sevilla", "Valencia", "Villarreal"}));
		combo_equipo.setFont(new Font("Candara", Font.PLAIN, 22));
		add(combo_equipo);
		
		radio_nacional = new JRadioButton("Nacional");
		buttonGroup.add(radio_nacional);
		radio_nacional.setBounds(314, 287, 127, 32);
		radio_nacional.setSelected(true);
		radio_nacional.setForeground(new Color(255, 255, 255));
		radio_nacional.setBackground(new Color(0, 51, 153));
		radio_nacional.setFont(new Font("Candara", Font.BOLD, 22));
		add(radio_nacional);
		
		radio_extranjero = new JRadioButton("Extranjero");
		buttonGroup.add(radio_extranjero);
		radio_extranjero.setBounds(314, 319, 127, 32);
		radio_extranjero.setForeground(Color.WHITE);
		radio_extranjero.setFont(new Font("Candara", Font.BOLD, 22));
		radio_extranjero.setBackground(new Color(0, 51, 153));
		add(radio_extranjero);
		
		JSeparator separador_titulo_1 = new JSeparator();
		separador_titulo_1.setBounds(40, 420, 892, 9);
		add(separador_titulo_1);
		
		boton_guardarCambios = new JButton("Guardar cambios");
		boton_guardarCambios.setIcon(new ImageIcon("iconos\\save.png"));
		boton_guardarCambios.setBounds(370, 442, 246, 43);
		boton_guardarCambios.setFont(new Font("Candara", Font.BOLD, 22));
		add(boton_guardarCambios);
		
		etq_fotografia = new JLabel("");
		etq_fotografia.setBounds(651, 102, 237, 249);
		add(etq_fotografia);
		
		botonCargarImagen = new JButton("Cargar Imagen");
		botonCargarImagen.setFont(new Font("Candara", Font.BOLD, 15));
		botonCargarImagen.setBounds(716, 368, 127, 28);
		add(botonCargarImagen);

	}

	public JTextField getEdit_nombre() {
		return edit_nombre;
	}
	public JComboBox getCombo_demarcacion() {
		return combo_demarcacion;
	}
	public JTextField getEdit_peso() {
		return edit_peso;
	}
	public JTextField getEdit_altura() {
		return edit_altura;
	}
	public JTextField getEdit_edad() {
		return edit_edad;
	}
	public JRadioButton getRadio_nacional() {
		return radio_nacional;
	}
	public JRadioButton getRadio_extranjero() {
		return radio_extranjero;
	}
	public JComboBox getCombo_equipo() {
		return combo_equipo;
	}
	public JButton getBoton_guardarCambios() {
		return boton_guardarCambios;
	}
	public JLabel getEtq_fotografia() {
		return etq_fotografia;
	}
	public JButton getBotonCargarImagen() {
		return botonCargarImagen;
	}
}
