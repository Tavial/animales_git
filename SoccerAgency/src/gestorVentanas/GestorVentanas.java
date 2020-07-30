package gestorVentanas;



import java.awt.Image;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import daos.JugadoresDAO;
import daos.JugadoresDAOImplArchivo;
//import daos.JugadoresDAOconArrayList;
import modelo.Jugador;
import vista.PanelBienvenida;
import vista.PanelInsertarJugador;
import vista.PanelEditarBorrarJugador;
import vista.PanelListarJugadores;
import vista.PanelTablaJugadores;
import vista.PanelEdicionJugador;
import vista.VentanaPrincipal;


public class GestorVentanas implements ActionListener{

		// voy a decir que DAO voy a usar para guardar los jugadores
	
		//JugadoresDAO jugadoresDAO = new JugadoresDAOconArrayList();
		
		JugadoresDAO jugadoresDAO = new JugadoresDAOImplArchivo();
	
		private VentanaPrincipal ventanaPrincipal = new VentanaPrincipal ();
		private PanelBienvenida panelBienvenida = new PanelBienvenida ();
		private PanelInsertarJugador panelInsertarJugador = new PanelInsertarJugador();
		private PanelListarJugadores panelListarJugadores = new PanelListarJugadores ();
		private PanelEditarBorrarJugador panelEditarBorrarJugador = new PanelEditarBorrarJugador ();
		private PanelEdicionJugador panelEdicionJugador = new PanelEdicionJugador ();
		private PanelTablaJugadores panelTablaJugadores = new PanelTablaJugadores ();
		
		
		// defino una variable para guardar el índice seleccionado
		int indiceJugadorSeleccionado = -1;
		
		private String extension="JPG"; 
		private String ruta_origen="";
		private int id_jugador = -1;
		private static String ruta_destino ="imagenes/";
		private String imagen_cargada = "";

		
		public GestorVentanas () {
			
			// Decimos que las acciones de Menú van a ser atendidas aquí
			
			ventanaPrincipal.getMenuAltaJugador().addActionListener(this);
			ventanaPrincipal.getMenuListadoJugadores().addActionListener(this);
			ventanaPrincipal.getMenuListadoJList().addActionListener(this);
			ventanaPrincipal.getMenu_tablaJugadores().addActionListener(this);
			
			// Decimos que el botón de insertar jugador va a ser atendido aquí
			
			panelInsertarJugador.getBoton_registrar().addActionListener(this);
			panelInsertarJugador.getBoton_CargarImagen().addActionListener(this);

			//en el panel Editar/Borrar jugador decimos que botón va a ser atendido
			panelEditarBorrarJugador.getBotonEditar().addActionListener(this);
			panelEditarBorrarJugador.getBotonBorrar().addActionListener(this);
			panelEditarBorrarJugador.getJlist().addListSelectionListener(new ListSelectionListener() {
				Jugador j1 = new Jugador ();
				@Override
				public void valueChanged(ListSelectionEvent arg0) {
					int indice = panelEditarBorrarJugador.getJlist().getSelectedIndex();
					if (indice != -1) {
						j1 = (Jugador) panelEditarBorrarJugador.getJlist().getSelectedValue();
						panelEditarBorrarJugador.getMostarNombre().setText(j1.getNombre());
						
						String ruta_imagen = j1.getFotografia(); // obtenemos la ruta donde tengo que ir por la imagen
						
						
						// definimos como imagen cargada la que en estos momentos tenemos. Luego ya se verá si se cambia o se deja igual.
						
						ImageIcon imagen = new ImageIcon(ruta_imagen);
						
						//ajustamos a las dimensiones del JLabel
						Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(panelInsertarJugador.getFoto().getWidth(), panelInsertarJugador.getFoto().getHeight(), Image.SCALE_DEFAULT));
						panelEditarBorrarJugador.getFoto().setIcon(icono);
						panelEditarBorrarJugador.repaint();
						
					}
				}
		
				
			});
			
			
			// en el panel Edición Jugador decimos qué botón va a ser atendido
			
			panelEdicionJugador.getBoton_guardarCambios().addActionListener(this);
			panelEdicionJugador.getBotonCargarImagen().addActionListener(this);
			
			// llamamos al panel de Bienvenida
			ventanaPrincipal.setContentPane(panelBienvenida);
			ventanaPrincipal.setVisible(true);
		
		}
		
		private void resetearCampos () {
			panelInsertarJugador.getEdit_nombre().setText(null);
			panelInsertarJugador.getEdit_edad().setText(null);
			panelInsertarJugador.getEdit_altura().setText(null);
			panelInsertarJugador.getEdit_peso().setText(null);
			panelInsertarJugador.getFoto().setIcon(null);
			this.extension=""; 
			this.ruta_origen="";
			this.imagen_cargada = "";
		}
		
		private void altaNuevoJugador (Jugador nuevoJugador) {

			String cadena ="";
			ArrayList<Jugador> jugadores = jugadoresDAO.obtenerJugadores();
			int siguiente_jugador = jugadores.size()+1;
			
			cadena = panelInsertarJugador.getEdit_nombre().getText();
			if (cadena.matches("[a-zA-ZÀ-ÿ\u00f1\u00d1]+(\s*[a-zA-ZÀ-ÿ\u00f1\u00d1]*)*[a-zA-ZÀ-ÿ\u00f1\u00d1]+")) {
				nuevoJugador.setNombre(panelInsertarJugador.getEdit_nombre().getText());
				cadena = panelInsertarJugador.getEdit_edad().getText();
				if (cadena.matches("[0-9]+")){
					nuevoJugador.setEdad(Integer.parseInt(panelInsertarJugador.getEdit_edad().getText()));
					cadena = panelInsertarJugador.getEdit_peso().getText();
					if (cadena.matches("\\d+((\\.)\\d+)?")) {
						nuevoJugador.setPeso(Double.parseDouble(panelInsertarJugador.getEdit_peso().getText()));
						cadena = panelInsertarJugador.getEdit_altura().getText();
						if (cadena.matches("[0-9]+")) {
							nuevoJugador.setAltura(Integer.parseInt(panelInsertarJugador.getEdit_altura().getText()));
							nuevoJugador.setDemarcacion(panelInsertarJugador.getCombo_demarcacion().getSelectedItem().toString());
							nuevoJugador.setEquipo(panelInsertarJugador.getCombo_equipo().getSelectedItem().toString());
							nuevoJugador.setId(siguiente_jugador);
							if (panelInsertarJugador.getRadio_nacional().isSelected()) {
								nuevoJugador.setNacionalidad("NACIONAL");
							}else {
								nuevoJugador.setNacionalidad("EXTRANJERO");
							}
							
							
							String ruta_imagen = GestorVentanas.ruta_destino +Integer.toString(siguiente_jugador)+"."+this.extension;
							
							if (this.ruta_origen == "") {
								nuevoJugador.setFotografia(GestorVentanas.ruta_destino+"sin_imagen.png");
								
							} else {
								nuevoJugador.setFotografia(ruta_imagen);
							}
							File fichero = new File (ruta_imagen);
							BufferedImage imagen;
							if (this.ruta_origen != "") {
								
								try {
									imagen = ImageIO.read(new File (this.ruta_origen));
								
									ImageIO.write(imagen,extension,fichero);
					
								} catch (IOException e) {
									System.out.println("No se puede guardar la imagen");
								}
							}
							
							// ahora le doy al DAO el nuevo jugador para que lo guarde en el ArrayList
							
							
							jugadoresDAO.registrarJugador(nuevoJugador);
							JOptionPane.showMessageDialog (null,"Jugador registrado correctamente");
							this.resetearCampos ();
						}
						else {
							JOptionPane.showMessageDialog(null, "El campo ALTURA no es correcto");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "El campo PESO no es correcto");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "El campo EDAD no es correcto");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "El campo NOMBRE no es correcto");
			}			
		}

		private void listarJugadores () {
			ArrayList<Jugador> jugadores = jugadoresDAO.obtenerJugadores();
			String texto = "";
			for (Jugador jugador:jugadores) {
				if (jugador.isAlta()) {
					texto += jugador.toString();
				}
			}
			panelListarJugadores.getText_listado().setText(texto);
		}
		
		private void listadoJList () {
			ventanaPrincipal.setContentPane(panelEditarBorrarJugador);
			ArrayList<Jugador> jugadores = jugadoresDAO.obtenerJugadores();
			DefaultListModel modelo = new DefaultListModel();
			
			for (Jugador jugador: jugadores) {
				if (jugador.isAlta()) {
					modelo.addElement(jugador);
				}
			}
			panelEditarBorrarJugador.getJlist().setModel(modelo);
			
		}
		
		private void tablaJugadores () {
			
			
			ArrayList<Jugador> jugadores = jugadoresDAO.obtenerJugadores();
			ArrayList<Jugador> deAlta = new ArrayList<Jugador>();
			
			for (int i=0; i<jugadores.size(); i++) {
				if (jugadores.get(i).isAlta()) {
					deAlta.add(jugadores.get(i));
				}
			}
	
			String matriz [][] = new String [deAlta.size()][5];
			for (int i=0; i<deAlta.size(); i++) {
				matriz[i][0] = Integer.toString(deAlta.get(i).getId());
				matriz[i][1] = deAlta.get(i).getNombre();
				matriz[i][2] = deAlta.get(i).getEquipo();
				matriz[i][3] = deAlta.get(i).getDemarcacion();
				matriz[i][4] = deAlta.get(i).getNacionalidad();
			}
			
			panelTablaJugadores.getTablaJugadores().setModel(new javax.swing.table.DefaultTableModel(
				matriz, 
				new String[] {	
						"ID", "Nombre", "Equipo", "Demarcacion", "Procedencia"
				}
					));
	
		}

		private void editarJugador() {
			// obtenemos el índice del jugador a editar
			
			this.indiceJugadorSeleccionado = panelEditarBorrarJugador.getJlist().getSelectedIndex();
			
			
			Jugador j = (Jugador) panelEditarBorrarJugador.getJlist().getModel().getElementAt(indiceJugadorSeleccionado);
			this.id_jugador = j.getId();
			this.imagen_cargada = j.getFotografia();
			// obtenemos del Array List que se volcó de fichero el jugador con el id seleccionado
			Jugador jugador = jugadoresDAO.obtenerJugadorPorId(this.id_jugador);
			
			
			// mostramos en el panel de edición los datos del jugador seleccionado
			panelEdicionJugador.getEdit_nombre().setText(jugador.getNombre());
			panelEdicionJugador.getCombo_demarcacion().setSelectedItem(jugador.getDemarcacion());
			panelEdicionJugador.getEdit_edad().setText(Integer.toString(jugador.getEdad()));
			panelEdicionJugador.getEdit_peso().setText(Double.toString(jugador.getPeso()));
			panelEdicionJugador.getEdit_altura().setText(Integer.toString(jugador.getAltura()));
			panelEdicionJugador.getCombo_equipo().setSelectedItem(jugador.getEquipo());
			if (jugador.getNacionalidad().equalsIgnoreCase("NACIONAL")) {
				panelEdicionJugador.getRadio_nacional().setSelected(true);
			} else if (jugador.getNacionalidad().equalsIgnoreCase("EXTRANJERO"))  {
				panelEdicionJugador.getRadio_extranjero().setSelected(true);
			}
			
			String ruta_imagen = jugador.getFotografia(); // obtenemos la ruta donde tengo que ir por la imagen
			
			
			this.imagen_cargada = ruta_imagen; // definimos como imagen cargada la que en estos momentos tenemos. Luego ya se verá si se cambia o se deja igual.
			
			
			ImageIcon imagen = new ImageIcon(ruta_imagen);
			
			//ajustamos a las dimensiones del JLabel
			Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(panelInsertarJugador.getFoto().getWidth(), panelInsertarJugador.getFoto().getHeight(), Image.SCALE_DEFAULT));
			panelEdicionJugador.getEtq_fotografia().setIcon(icono);
			panelEdicionJugador.repaint();
			// una vez cargados los datos del panel, lo mostamos en la ventana principal
			ventanaPrincipal.setContentPane(panelEdicionJugador);
		}
		
		private void modificarJugador () {
			// creamos un objeto de la clase Jugador, donde vamos a meter todos los campos del panel una vez modificados
			Jugador jugador_modificado = new Jugador ();
			String cadena;
			
			cadena = panelEdicionJugador.getEdit_nombre().getText();
			
			if (cadena.matches("[a-zA-ZÀ-ÿ\u00f1\u00d1]+(\s*[a-zA-ZÀ-ÿ\u00f1\u00d1]*)*[a-zA-ZÀ-ÿ\u00f1\u00d1]+")) {
				jugador_modificado.setNombre(panelEdicionJugador.getEdit_nombre().getText());
				cadena = panelEdicionJugador.getEdit_edad().getText();
				if (cadena.matches("[0-9]+")){
					jugador_modificado.setEdad(Integer.parseInt(panelEdicionJugador.getEdit_edad().getText()));
					cadena = panelEdicionJugador.getEdit_peso().getText();
					if (cadena.matches("\\d+((\\.|,)\\d+)?")) {
						cadena = cadena.replace(",", ".");
						jugador_modificado.setPeso(Double.parseDouble(cadena));
						cadena = panelEdicionJugador.getEdit_altura().getText();
						if (cadena.matches("[0-9]+")) {
							jugador_modificado.setAltura(Integer.parseInt(panelEdicionJugador.getEdit_altura().getText()));
							jugador_modificado.setDemarcacion(panelEdicionJugador.getCombo_demarcacion().getSelectedItem().toString());	
							jugador_modificado.setEquipo(panelEdicionJugador.getCombo_equipo().getSelectedItem().toString());
							if (panelEdicionJugador.getRadio_nacional().isSelected()) {
								jugador_modificado.setNacionalidad("NACIONAL");
							} else if (panelEdicionJugador.getRadio_extranjero().isSelected()) {
								jugador_modificado.setNacionalidad("EXTRANJERO");
							}
							
							//borramos los campos donde se visualiza la foto y el nombre
							panelEditarBorrarJugador.getMostarNombre().setText(null);
							panelEditarBorrarJugador.getFoto().setIcon(null);
							
							
							
							String ruta_imagen = GestorVentanas.ruta_destino+id_jugador+".JPG";
							
							
							
							if (this.ruta_origen.isEmpty()) { // no se cargó imagen
								if (this.imagen_cargada.equalsIgnoreCase(GestorVentanas.ruta_destino+"sin_imagen.png")) {
									jugador_modificado.setFotografia(this.imagen_cargada);
								}
								else {
									jugador_modificado.setFotografia(ruta_imagen);
								}
								
								
							} else {
								
								File fichero = new File (ruta_imagen);
								BufferedImage imagen;
								try {
									imagen = ImageIO.read(new File (this.ruta_origen));
									ImageIO.write(imagen,extension,fichero);
									jugador_modificado.setFotografia(GestorVentanas.ruta_destino+id_jugador+"."+this.extension);
									
											
									} catch (IOException e) {
										System.out.println("No se puede guardar la imagen");
										}
							} 
							jugadoresDAO.actualizarJugadorPorId(jugador_modificado, this.id_jugador);
							this.listadoJList();
							
						}
						else {
							JOptionPane.showMessageDialog(null, "El campo ALTURA no es correcto");
						}
								
					}
					else {
						JOptionPane.showMessageDialog(null, "El campo PESO no es correcto");
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "El campo EDAD no es correcto");
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "El campo NOMBRE no es correcto");
		}
		
			
			
			
		}
		
		private void cargarImagen() {
			// creamos un objeto que nos mostrará la ventana de diálogo para escoger un archivo
			JFileChooser seleccionar = new JFileChooser();
			FileNameExtensionFilter filtro = new FileNameExtensionFilter("IMAGEN JPG","jpg");
			seleccionar.setFileFilter(filtro);
			seleccionar.setMultiSelectionEnabled(false);
			// ponemos título a esta ventana de diálogo
			seleccionar.setDialogTitle("Cargar imagen");
			// si se presiona el botón de aceptar entra en una condición
			if (seleccionar.showOpenDialog(panelInsertarJugador) == JFileChooser.APPROVE_OPTION) {
				//Nos muestra la ventana para seleccionar el archivo
				
				// sacamos la extensión del archivo
				this.extension= seleccionar.getSelectedFile().toString();
				int fin = extension.length();
				int inicio = fin - 3; 
				// y lo pasamos a mayúsculas
				
				this.extension = this.extension.substring(inicio, fin).toUpperCase();
				
				
				// guardamos la imagen en nuestro directorio
				
				//creamos un objeto de Imagen Icon con el nombre seleccionado
				ImageIcon imagen = new ImageIcon(seleccionar.getSelectedFile().toString());
				//ajustamos a las dimensiones del JLabel
				Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(panelInsertarJugador.getFoto().getWidth(), panelInsertarJugador.getFoto().getHeight(), Image.SCALE_DEFAULT));
				this.ruta_origen = seleccionar.getSelectedFile().toString();
				
				panelInsertarJugador.getFoto().setIcon(icono);
				panelInsertarJugador.repaint();
			}
		}
		
		private void cargarImagenEdicion() {
			// creamos un objeto que nos mostrará la ventana de diálogo para escoger un archivo
			JFileChooser seleccionar = new JFileChooser();
			FileNameExtensionFilter filtro = new FileNameExtensionFilter("IMAGEN JPG","jpg");
			
			seleccionar.setFileFilter(filtro);
			seleccionar.setMultiSelectionEnabled(false);
			
			// ponemos título a esta ventana de diálogo
			seleccionar.setDialogTitle("Cargar imagen");
			// si se presiona el botón de aceptar entra en una condición
			if (seleccionar.showOpenDialog(panelEdicionJugador) == JFileChooser.APPROVE_OPTION) {
				//Nos muestra la ventana para seleccionar el archivo
				
			/*	//BufferedImage imagen = ImageIO.read(seleccionar.getSelectedFile().toURI());
				//File archivo = new File (seleccionar.getSelectedFile().toString());*/
			
				// sacamos la extensión del archivo
				this.extension= seleccionar.getSelectedFile().toString();
				int fin = extension.length();
				int inicio = fin - 3; 
				// y lo pasamos a mayúsculas
				
				this.extension = this.extension.substring(inicio, fin).toUpperCase(); 
				
				
				// guardamos la imagen en nuestro directorio
			
				//creamos un objeto de Imagen Icon con el nombre seleccionado
				ImageIcon imagen = new ImageIcon(seleccionar.getSelectedFile().toString());
				//ajustamos a las dimensiones del JLabel
				Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(panelEdicionJugador.getEtq_fotografia().getWidth(), panelEdicionJugador.getEtq_fotografia().getHeight(), Image.SCALE_DEFAULT));
				this.ruta_origen = seleccionar.getSelectedFile().toString();
			
				panelEdicionJugador.getEtq_fotografia().setIcon(icono);
				panelEdicionJugador.repaint();
				
			}
			
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// detectamos el elemento pulsado
			Object elementoPulsado = e.getSource();
			// si pulsamos la opción del menú alta de nuevo jugador
			if (elementoPulsado == ventanaPrincipal.getMenuAltaJugador()) {	
				ventanaPrincipal.setContentPane(panelInsertarJugador);
				// si pulsamos la opción del menú listar jugadores	
			} else if (elementoPulsado == ventanaPrincipal.getMenuListadoJugadores()){
				// se carga el panel de listar jugadores
				ventanaPrincipal.setContentPane(panelListarJugadores);
				// mostramos el listado	
				this.listarJugadores ();
				// si pulsamos la opción del menú listado con JList
			} else if (elementoPulsado == ventanaPrincipal.getMenu_tablaJugadores()) {
				// se carga el panel de listar jugadores
				ventanaPrincipal.setContentPane(panelTablaJugadores);
				this.tablaJugadores();
			} else if (elementoPulsado == ventanaPrincipal.getMenuListadoJList()) {
				ventanaPrincipal.setContentPane(panelEditarBorrarJugador);
				
				this.listadoJList ();
				// si pulsamos el botón cargar imagen
			} else if (elementoPulsado == panelInsertarJugador.getBoton_CargarImagen()) {
				this.cargarImagen();
				// si pulsamos el botón registar nuevo jugador
			} else if (elementoPulsado == panelInsertarJugador.getBoton_registrar()) { 
				Jugador nuevoJugador = new Jugador ();
				this.altaNuevoJugador (nuevoJugador);
				// si pulsamos el botón de eliminar ficha de un jugador
			}else if (elementoPulsado == panelEditarBorrarJugador.getBotonBorrar()) {
				
				
				int indice = panelEditarBorrarJugador.getJlist().getSelectedIndex();
				
				if (indice != -1) {
					
					int decision = (JOptionPane.showConfirmDialog(null,"¿estás seguro de borrar el elemento?", "Mensaje de confirmación",JOptionPane.YES_NO_OPTION));
					if (decision == 0) {
						this.indiceJugadorSeleccionado = panelEditarBorrarJugador.getJlist().getSelectedIndex();
						Jugador j = (Jugador) panelEditarBorrarJugador.getJlist().getModel().getElementAt(this.indiceJugadorSeleccionado);
						this.id_jugador = j.getId();	
						jugadoresDAO.borrarJugadorPorId(this.id_jugador);
						// borramos la imagen asociada en la carpeta.
						if (!j.getFotografia().equalsIgnoreCase(GestorVentanas.ruta_destino+"sin_imagen.png")) {
							File fichero_a_borrar = new File (j.getFotografia());
							fichero_a_borrar.delete();		
						}
	
						panelEditarBorrarJugador.getMostarNombre().setText(null);
						panelEditarBorrarJugador.getFoto().setIcon(null);
						
						this.listadoJList ();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "No has seleccionado el elemento que quieres borrar");
				}
			}else if (elementoPulsado == panelEditarBorrarJugador.getBotonEditar()) {
				
				int indice = panelEditarBorrarJugador.getJlist().getSelectedIndex();
				
				if (indice != -1) {
					this.editarJugador();
				}
				else {
					JOptionPane.showMessageDialog(null, "No has seleccionado el elemento a Editar");
				}
			}else if (elementoPulsado == panelEdicionJugador.getBotonCargarImagen()) {
				this.cargarImagenEdicion();
			
			}else if (elementoPulsado == panelEdicionJugador.getBoton_guardarCambios()) {
				this.modificarJugador();
			} 
			
			//refrescamos la ventana principal para que cargue correctamente el panel.
			SwingUtilities.updateComponentTreeUI(ventanaPrincipal);
		}
		
		
}
