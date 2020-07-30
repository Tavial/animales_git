package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class PanelListarJugadores extends JPanel {
	private JTextArea text_listado;

	/**
	 * Create the panel.
	 */
	public PanelListarJugadores() {
		setBackground(new Color(0, 51, 153));
		setLayout(null);
		
		JLabel etq_listar_jugadores = new JLabel("LISTAR JUGADORES");
		etq_listar_jugadores.setBounds(346, 13, 236, 32);
		etq_listar_jugadores.setForeground(Color.WHITE);
		etq_listar_jugadores.setFont(new Font("Candara", Font.BOLD, 26));
		add(etq_listar_jugadores);
		
		JSeparator separador_titulo = new JSeparator();
		separador_titulo.setBounds(35, 58, 892, 9);
		add(separador_titulo);
		
		text_listado = new JTextArea();
		text_listado.setFont(new Font("Candara", Font.PLAIN, 22));
		text_listado.setBounds(78, 80, 820, 362);
		add(text_listado);
		
		JScrollPane scrollPane = new JScrollPane(text_listado);
		scrollPane.setBounds(48, 65, 866, 389);
		add(scrollPane);

	}

	public JTextArea getText_listado() {
		return text_listado;
	}
}
