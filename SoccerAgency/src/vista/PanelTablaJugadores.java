package vista;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


public class PanelTablaJugadores extends JPanel {
	private JTable tablaJugadores;
	private JScrollPane scrollPane;

	/**
	 * Create the panel.
	 */
	public PanelTablaJugadores() {
		setBackground(new Color(0, 51, 153));
		setLayout(null);
		
		JLabel etq_listar_jugadores = new JLabel("TABLA DE  JUGADORES");
		etq_listar_jugadores.setBounds(346, 13, 292, 32);
		etq_listar_jugadores.setForeground(Color.WHITE);
		etq_listar_jugadores.setFont(new Font("Candara", Font.BOLD, 26));
		add(etq_listar_jugadores);
		
		JSeparator separador_titulo = new JSeparator();
		separador_titulo.setBounds(35, 58, 892, 9);
		add(separador_titulo);
		
		tablaJugadores = new JTable();
		tablaJugadores.setRowMargin(8);
		tablaJugadores.setRowHeight(30);
		tablaJugadores.setFont(new Font("Candara", Font.PLAIN, 20));
		tablaJugadores.setBounds(45, 91, 843, 329);
		add(tablaJugadores);
		
		scrollPane = new JScrollPane(tablaJugadores);
		scrollPane.setBounds(45, 75, 877, 240);
		add(scrollPane);
		
		

	}
	public JTable getTablaJugadores() {
		return tablaJugadores;
	}
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
}
