package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class PanelEditarBorrarJugador extends JPanel {
	private JList jlist;
	private JButton botonEditar;
	private JButton botonBorrar;
	private JLabel foto;
	private JLabel mostarNombre;

	/**
	 * Create the panel.
	 */
	public PanelEditarBorrarJugador() {
		setBackground(new Color(0, 51, 153));
		setLayout(null);
		
		JLabel etq_listar_JList = new JLabel("FICHAS DE JUGADORES");
		etq_listar_JList.setBounds(80, 13, 286, 32);
		etq_listar_JList.setForeground(Color.WHITE);
		etq_listar_JList.setFont(new Font("Candara", Font.BOLD, 26));
		add(etq_listar_JList);
		
		JSeparator separador_titulo = new JSeparator();
		separador_titulo.setBounds(39, 58, 921, 8);
		add(separador_titulo);
		
		jlist = new JList();
		jlist.setBounds(1, 1, 679, 456);
		jlist.setBackground(Color.WHITE);
		jlist.setFont(new Font("Candara", Font.PLAIN, 22));
		add(jlist);
		
		botonBorrar = new JButton("Borrar");
		botonBorrar.setBounds(791, 455, 140, 48);
		botonBorrar.setIcon(new ImageIcon("iconos\\delete.png"));
		botonBorrar.setFont(new Font("Candara", Font.BOLD, 20));
		add(botonBorrar);
		
		botonEditar = new JButton("Editar");
		botonEditar.setBounds(791, 378, 140, 48);
		botonEditar.setFont(new Font("Candara", Font.BOLD, 20));
		botonEditar.setIcon(new ImageIcon("iconos\\edit.png"));
		add(botonEditar);
		
		foto = new JLabel("");
		foto.setBounds(741, 90, 207, 209);
		add(foto);
		
		mostarNombre = new JLabel("");
		mostarNombre.setBounds(736, 333, 212, 32);
		mostarNombre.setForeground(Color.WHITE);
		mostarNombre.setFont(new Font("Candara", Font.BOLD, 20));
		add(mostarNombre);
		
		JScrollPane scrollPane = new JScrollPane(jlist);
		scrollPane.setBounds(39, 58, 681, 458);
		add(scrollPane);

	}
	public JList getJlist() {
		return jlist;
	}
	public JButton getBotonEditar() {
		return botonEditar;
	}
	public JButton getBotonBorrar() {
		return botonBorrar;
	}
	public JLabel getFoto() {
		return foto;
	}
	public JLabel getMostarNombre() {
		return mostarNombre;
	}
}
