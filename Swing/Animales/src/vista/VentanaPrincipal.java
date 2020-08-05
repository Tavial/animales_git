package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Font;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton botonTenor;
	private JButton botonCanario;
	private JButton botonMurcielago;
	private JButton botonTigre;
	private JButton botonGallo;
	private JButton botonAvestruz;
	private JButton botonGato;
	private JButton botonLoro;
	private JTextArea pizarra;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		botonTenor = new JButton("");
		botonTenor.setIcon(new ImageIcon("D:\\USUARIOS\\TAVIAL\\IMAGENES\\Iconos\\tenor1.png"));
		botonTenor.setBounds(12, 13, 114, 121);
		contentPane.add(botonTenor);
		
		botonCanario = new JButton("");
		botonCanario.setIcon(new ImageIcon("D:\\USUARIOS\\TAVIAL\\IMAGENES\\Iconos\\canario1.png"));
		botonCanario.setBounds(120, 13, 114, 121);
		contentPane.add(botonCanario);
		
		botonMurcielago = new JButton("");
		botonMurcielago.setIcon(new ImageIcon("D:\\USUARIOS\\TAVIAL\\IMAGENES\\Iconos\\murcielago1.png"));
		botonMurcielago.setBounds(11, 131, 115, 121);
		contentPane.add(botonMurcielago);
		
		botonTigre = new JButton("");
		botonTigre.setIcon(new ImageIcon("D:\\USUARIOS\\TAVIAL\\IMAGENES\\Iconos\\tigre2.png"));
		botonTigre.setBounds(120, 131, 114, 121);
		contentPane.add(botonTigre);
		
		botonGallo = new JButton("");
		botonGallo.setIcon(new ImageIcon("D:\\USUARIOS\\TAVIAL\\IMAGENES\\Iconos\\gallo.png"));
		botonGallo.setBounds(12, 250, 114, 121);
		contentPane.add(botonGallo);
		
		botonAvestruz = new JButton("");
		botonAvestruz.setIcon(new ImageIcon("D:\\USUARIOS\\TAVIAL\\IMAGENES\\Iconos\\avestruz.png"));
		botonAvestruz.setBounds(120, 250, 114, 121);
		contentPane.add(botonAvestruz);
		
		botonGato = new JButton("");
		botonGato.setIcon(new ImageIcon("D:\\USUARIOS\\TAVIAL\\IMAGENES\\Iconos\\gato.png"));
		botonGato.setBounds(12, 369, 114, 121);
		contentPane.add(botonGato);
		
		botonLoro = new JButton("");
		botonLoro.setIcon(new ImageIcon("D:\\USUARIOS\\TAVIAL\\IMAGENES\\Iconos\\loro1.png"));
		botonLoro.setBounds(120, 369, 114, 121);
		contentPane.add(botonLoro);
		
		pizarra = new JTextArea();
		pizarra.setFont(new Font("Candara", Font.PLAIN, 22));
		pizarra.setBounds(246, 13, 444, 476);
		contentPane.add(pizarra);
	}
	public JButton getBotonTenor() {
		return botonTenor;
	}
	public JButton getBotonCanario() {
		return botonCanario;
	}
	public JButton getBotonMurcielago() {
		return botonMurcielago;
	}
	public JButton getBotonTigre() {
		return botonTigre;
	}
	public JButton getBotonGallo() {
		return botonGallo;
	}
	public JButton getBotonAvestruz() {
		return botonAvestruz;
	}
	public JButton getBotonGato() {
		return botonGato;
	}
	public JButton getBotonLoro() {
		return botonLoro;
	}
	public JTextArea getPizarra() {
		return pizarra;
	}
}
