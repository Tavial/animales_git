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

public class PanelInsertarJugador extends JPanel {
	private JTextField edit_nombre;
	private JTextField edit_edad;
	private JTextField edit_peso;
	private JTextField edit_altura;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton boton_registrar;
	private JComboBox combo_demarcacion;
	private JRadioButton radio_nacional;
	private JRadioButton radio_extranjero;
	private JComboBox combo_equipo;
	private JLabel foto;
	private JButton boton_CargarImagen;

	/**
	 * Create the panel.
	 */
	public PanelInsertarJugador() {
		setBackground(new Color(0, 51, 153));
		setForeground(Color.WHITE);
		setLayout(null);
		
		JLabel etq_RegistrarJugador = new JLabel("REGISTRAR NUEVO JUGADOR");
		etq_RegistrarJugador.setForeground(Color.WHITE);
		etq_RegistrarJugador.setFont(new Font("Candara", Font.BOLD, 26));
		etq_RegistrarJugador.setBounds(301, 23, 354, 32);
		add(etq_RegistrarJugador);
		
		JSeparator separador_titulo = new JSeparator();
		separador_titulo.setBounds(40, 68, 892, 9);
		add(separador_titulo);
		
		JLabel etq_nombre = new JLabel("Nombre: ");
		etq_nombre.setForeground(Color.WHITE);
		etq_nombre.setFont(new Font("Candara", Font.BOLD, 22));
		etq_nombre.setBounds(40, 102, 89, 32);
		add(etq_nombre);
		
		JLabel etq_demarcacion = new JLabel("Demarcaci\u00F3n: ");
		etq_demarcacion.setForeground(Color.WHITE);
		etq_demarcacion.setFont(new Font("Candara", Font.BOLD, 22));
		etq_demarcacion.setBounds(40, 211, 154, 32);
		add(etq_demarcacion);
		
		JLabel etq_edad = new JLabel("Edad:");
		etq_edad.setForeground(Color.WHITE);
		etq_edad.setFont(new Font("Candara", Font.BOLD, 22));
		etq_edad.setBounds(40, 357, 69, 32);
		add(etq_edad);
		
		JLabel etq_peso = new JLabel("Peso (kg):");
		etq_peso.setForeground(Color.WHITE);
		etq_peso.setFont(new Font("Candara", Font.BOLD, 22));
		etq_peso.setBounds(40, 312, 114, 32);
		add(etq_peso);
		
		JLabel etq_altura = new JLabel("Altura (cm):");
		etq_altura.setForeground(Color.WHITE);
		etq_altura.setFont(new Font("Candara", Font.BOLD, 22));
		etq_altura.setBounds(40, 275, 141, 32);
		add(etq_altura);
		
		JLabel etq_equipo = new JLabel("Equipo: ");
		etq_equipo.setForeground(Color.WHITE);
		etq_equipo.setFont(new Font("Candara", Font.BOLD, 22));
		etq_equipo.setBounds(40, 158, 94, 32);
		add(etq_equipo);
		
		edit_nombre = new JTextField();
		edit_nombre.setFont(new Font("Candara", Font.PLAIN, 22));
		edit_nombre.setBounds(188, 101, 354, 33);
		add(edit_nombre);
		edit_nombre.setColumns(10);
		
		edit_edad = new JTextField();
		edit_edad.setFont(new Font("Candara", Font.PLAIN, 22));
		edit_edad.setColumns(10);
		edit_edad.setBounds(188, 362, 39, 22);
		add(edit_edad);
		
		edit_peso = new JTextField();
		edit_peso.setFont(new Font("Candara", Font.PLAIN, 22));
		edit_peso.setColumns(10);
		edit_peso.setBounds(188, 317, 57, 22);
		add(edit_peso);
		
		edit_altura = new JTextField();
		edit_altura.setFont(new Font("Candara", Font.PLAIN, 22));
		edit_altura.setColumns(10);
		edit_altura.setBounds(190, 280, 57, 22);
		add(edit_altura);
		
		combo_demarcacion = new JComboBox();
		combo_demarcacion.setModel(new DefaultComboBoxModel(new String[] {"Portero", "Defensa", "Centrocampista", "Delantero"}));
		combo_demarcacion.setFont(new Font("Candara", Font.PLAIN, 22));
		combo_demarcacion.setBounds(188, 211, 183, 33);
		add(combo_demarcacion);
		
		combo_equipo = new JComboBox();
		combo_equipo.setModel(new DefaultComboBoxModel(new String[] {"Athletic Club", "Atl\u00E9tico Madrid", "Barcelona", "Celta de Vigo", "Deportivo Alav\u00E9s", "Espanyol", "Getafe", "Granada", "Levante", "Legan\u00E9s", "Mallorca", "Osasuna", "Real Betis", "Real Madrid", "Real Sociedad", "Real Valladolid", "SD Eibar", "Sevilla", "Valencia", "Villarreal"}));
		combo_equipo.setFont(new Font("Candara", Font.PLAIN, 22));
		combo_equipo.setBounds(188, 158, 232, 33);
		add(combo_equipo);
		
		radio_nacional = new JRadioButton("Nacional");
		buttonGroup.add(radio_nacional);
		radio_nacional.setSelected(true);
		radio_nacional.setForeground(new Color(255, 255, 255));
		radio_nacional.setBackground(new Color(0, 51, 153));
		radio_nacional.setFont(new Font("Candara", Font.BOLD, 22));
		radio_nacional.setBounds(353, 295, 127, 32);
		add(radio_nacional);
		
		radio_extranjero = new JRadioButton("Extranjero");
		buttonGroup.add(radio_extranjero);
		radio_extranjero.setForeground(Color.WHITE);
		radio_extranjero.setFont(new Font("Candara", Font.BOLD, 22));
		radio_extranjero.setBackground(new Color(0, 51, 153));
		radio_extranjero.setBounds(353, 332, 127, 32);
		add(radio_extranjero);
		
		JSeparator separador_titulo_1 = new JSeparator();
		separador_titulo_1.setBounds(40, 402, 892, 9);
		add(separador_titulo_1);
		
		boton_registrar = new JButton("Registrar jugador");
		boton_registrar.setFont(new Font("Candara", Font.BOLD, 22));
		boton_registrar.setBounds(368, 442, 214, 43);
		add(boton_registrar);
		
		foto = new JLabel("");
		foto.setBounds(598, 102, 247, 220);
		add(foto);
		
		boton_CargarImagen = new JButton("Cargar fotograf\u00EDa");
		boton_CargarImagen.setFont(new Font("Candara", Font.BOLD, 15));
		boton_CargarImagen.setBounds(672, 338, 141, 22);
		add(boton_CargarImagen);

	}
	public JButton getBoton_registrar() {
		return boton_registrar;
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
	public JButton getBoton_CargarImagen() {
		return boton_CargarImagen;
	}
	public JLabel getFoto() {
		return foto;
	}
}
