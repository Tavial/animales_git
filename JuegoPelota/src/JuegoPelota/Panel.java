package JuegoPelota;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


// Runnable es para hacer Threads y trabajar con hilos
// KeyListener nos permite controlar la bolita con el teclado

public class Panel extends JPanel implements Runnable, KeyListener  {
	
	//constantes de dirección para usarlas en comparaciones
	private static int IZQUIERDA = 1;
	private static int ARRIBA = 2;
	private static int DERECHA = 3;
	private static int ABAJO = 4;
	
	// variable que indica la dirección de la bolita
	int direccion = DERECHA;
			
	
	//dimensiones del marco de juego
	private static int ANCHO = 800;
	private static int ALTO = 600;
	
	//propiedades de la bolita
	private static int DIAMETRO_BOLA = 30;
	private int bola_x = (int) Math.floor(Math.random()*(0-ANCHO)+ANCHO);
	private int bola_y = (int) Math.floor(Math.random()*(0-ALTO)+ALTO);
	private int velocidad_bola = 6;
	
	//propiedades de la meta
	private int meta_x = (int) Math.floor(Math.random()*(0-ANCHO)+ANCHO);
	private int meta_y = (int) Math.floor(Math.random()*(0-ALTO)+ALTO);
	private int alto_meta = (int) Math.floor(Math.random()*(30-60)+60);
	private int ancho_meta = (int) Math.floor(Math.random()*(30-60)+60);
	
	//obstáculos
	
	private int alto_obs = 60;
	private int ancho_obs = 30;
	
	//obstáculo1
	private int obs1_x = (int) Math.floor(Math.random()*(0-ANCHO)+ANCHO);
	private int obs1_y = (int) Math.floor(Math.random()*(0-ALTO)+ALTO);
	private boolean obs1 = false;
	
	
	//obstáculo2
	private int obs2_x = (int) Math.floor(Math.random()*(0-ANCHO)+ANCHO);
	private int obs2_y = (int) Math.floor(Math.random()*(0-ALTO)+ALTO);
	private boolean obs2 = false;
	
	//obstáculo3
	private int obs3_x = (int) Math.floor(Math.random()*(0-ANCHO)+ANCHO);
	private int obs3_y = (int) Math.floor(Math.random()*(0-ALTO)+ALTO);
	private boolean obs3 = false;
	
	
	
	//variable que gestiona que el hilo_bolita esté activp
	private boolean hilo_bolita = true;
	
	// veces que ha llevado el usuario la bolita a la meta
	private int juegos_ganados = 0;
	
	//archivo donde se guardan los jugadores
	private FileWriter jugadores;	
	private File archivo = new File("records.txt");
	

	public Panel () {
		
		this.addKeyListener (this); // activa el "escuchador" del teclado
		// para que el panel pueda atender eventos de teclado tenemos que poner el foco sobre el panel
		this.setFocusable(true);
		
		this.setBounds(0, 0, ANCHO, ALTO);
		this.comprobarAleatorios ();
		this.setBackground(new Color (19,76,135));
		//creamos y lanzamos el hilo de la bolita
		
		Thread h_bolita = new Thread (this);
		h_bolita.start();
		
	}
	
	public void comprobarAleatorios () {
		//cuidamos que la bolita no se salga de los márgenes de la pantalla.
		if (bola_x > 763) {
			bola_x = 500;
			}
		if (bola_x < 30) {
			bola_x = 100;
			}
		
		if (bola_y > 530) {
			bola_y = 300;
			}
		if (bola_y <30) {
			bola_y = 100;
		}	
		//cuidamos que la meta no se salga por el margen de la pantalla cuando se coloque de forma aleatoria 
		if (meta_x > 763) {
			meta_x = 500;
		}
		
		if (meta_y > 505) {
			meta_y = 300;
		}
		
		//cuidamos que los obstáculos no se salgan de la pantalla cuando se coloquen de forma aleatoria
		if (obs1_x > 763) {
			obs1_x = 500;
		}
	   
		if (obs1_y > 505) {
			obs1_y = 300;
		}
		
		if (obs2_x > 763) {
			obs2_x = 500;
		}
	   
		if (obs2_y > 505) {
			obs2_y = 300;
		}
		
		if (obs3_x > 763) {
			obs3_x = 500;
		}
	   
		if (obs3_y > 505) {
			obs3_y = 300;
		}
	}
	
	@Override
	public void paint (Graphics g) {
		
		super.paint(g);
			
		
		// seleccionamos el color blanco para colorear.
		g.setColor(Color.WHITE);
		
		// dibujamos la bolita  
		g.fillOval(bola_x, bola_y, DIAMETRO_BOLA, DIAMETRO_BOLA);	
		
		// seleccionamos el color verde para colorear la meta.
		g.setColor(new Color (86,224,99));
		
		//dibujamos el rectángulo que va a ser la meta
		g.fillRect(meta_x, meta_y, ancho_meta, alto_meta);
		
		// dibujamos los obstáculos. Serán de color rojo
		g.setColor(new Color (241,37,27));
		g.fillRect(obs1_x, obs1_y, ancho_obs, alto_obs);
		g.fillRect(obs2_x, obs2_y, ancho_obs, alto_obs);
		g.fillRect(obs3_x, obs3_y, ancho_obs, alto_obs);
		
		
		
		
	}
	
	public void mover () {
		//el obstáculo 1 lo vamos a mover de derecha a izquierda y de izda a derecha;
		
		if (!obs1 && obs1_x < ANCHO) {
			obs1_x ++;
		}
		else
			if (!obs1 && obs1_x == ANCHO) {
				obs1_x --;
				obs1 = true; // cambiamos la dirección del movimiento
			}
			else {
				if (obs1 && obs1_x >0) {
					obs1_x --;
				}
				else {
					if (obs1 && obs1_x ==0) {
						obs1_x++;
						obs1 = false; // cambiamos la dirección del movimiento
					}
				}
			}
		
		//el obstáculo 2 lo vamos a mover de arriba a abajo y de abajo a arriba;
		
		if (!obs2 && obs2_y <ALTO) {
			obs2_y ++;
		}
		else
			if (!obs2 && obs2_y == ALTO) {
				obs2_y --;
				obs2 = true; // cambiamos la dirección del movimiento
			}
			else {
				if (obs2 && obs2_y >0) {
					obs2_y --;
				}
				else {
					if (obs2 && obs2_y ==0) {
						obs2_y++;
						obs2 = false; // cambiamos la dirección del movimiento
					}
				}
			}
		
		//el obstáculo 3 lo vamos a mover de derecha a izquierda y de izda a derecha;
		
				if (!obs3 && obs3_x <ANCHO) {
					obs3_x ++;
				}
				else
					if (!obs3 && obs3_x == ANCHO) {
						obs3_x --;
						obs3 = true; // cambiamos la dirección del movimiento
					}
					else {
						if (obs3 && obs3_x >0) {
							obs3_x --;
						}
						else {
							if (obs3 && obs3_x ==0) {
								obs3_x++;
								obs3 = false; // cambiamos la dirección del movimiento
							}
						}
					}
		
	}
	
	public void mostrarArchivo() {
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			String almacen ="";
			while ((linea = br.readLine()) != null) {
				almacen = almacen + linea +"\n";
			}
			JOptionPane.showMessageDialog(this, almacen);
			br.close();
			fr.close ();
		} catch (FileNotFoundException e) {
			System.out.println("no puedo leer del archivo");
		} catch (IOException e) {
			System.out.println("error al leer");
		}	
	}

	@Override
	// en este método continuamente podemos redibujar los componentes móviles (bolita, obstáculos)
	
	public void run() { 
		
		while (hilo_bolita) {
			try {
				Thread.sleep(velocidad_bola);
				
				this.mover();
				
				if (direccion == IZQUIERDA) {
					bola_x--;
				}
				if (direccion == ARRIBA) {
					bola_y--;
				}
				if (direccion == DERECHA) {
					bola_x++;
				}
				if (direccion == ABAJO) {
					bola_y++;
				}
				
				if (bola_x >= meta_x && bola_x <= (meta_x + ancho_meta) && bola_y >= meta_y && bola_y <=(meta_y+alto_meta)) {
					JOptionPane.showMessageDialog (this, "FELICIDADES, llevaste la bolita a la meta... ahora más difícil");
					juegos_ganados++;
					bola_x = (int) Math.floor(Math.random()*(0-ANCHO)+ANCHO);
					bola_y = (int) Math.floor(Math.random()*(0-ALTO)+ALTO);
					if (velocidad_bola > 1) {
						velocidad_bola--;
					}
					meta_x = (int) Math.floor(Math.random()*(0-ANCHO)+ANCHO);
					meta_y = (int) Math.floor(Math.random()*(0-ALTO)+ALTO);
					alto_meta = (int) Math.floor(Math.random()*(30-60)+60);
					ancho_meta = (int) Math.floor(Math.random()*(30-60)+60);
					obs1_x = (int) Math.floor(Math.random()*(0-ANCHO)+ANCHO);
					obs1_y = (int) Math.floor(Math.random()*(0-ALTO)+ALTO);
					
					obs2_x = (int) Math.floor(Math.random()*(0-ANCHO)+ANCHO);
					obs2_y = (int) Math.floor(Math.random()*(0-ALTO)+ALTO);
					
					obs3_x = (int) Math.floor(Math.random()*(0-ANCHO)+ANCHO);
					obs3_y = (int) Math.floor(Math.random()*(0-ALTO)+ALTO);
					
					this.comprobarAleatorios();
					
				} 
				else 
					
					if (bola_x >= ANCHO || bola_y >= ALTO || bola_x == 0 || bola_y == 0)  {
						JOptionPane.showMessageDialog (this, "Lo siento. Has perdido");	
						this.hilo_bolita = false;
						String nombre = JOptionPane.showInputDialog("Introduce tu nombre para añadirlo al de mejores jugadores");
						this.jugadores = null;
						try {
							this.jugadores = new FileWriter ("records.txt",true);
							if (nombre != null) {
								jugadores.write (nombre+" -> Partidas ganadas: "+juegos_ganados+"\n");
							}
							else { //por si se pulsa cancelar en vez de meter el nombre
								jugadores.write ("Anónimo"+" -> Partidas ganadas:"+juegos_ganados+"\n");
							}
							this.jugadores.close();
							this.mostrarArchivo();
						}
						catch (Exception ex) {
							System.out.println("Mensaje de la excepción: "+ex.getMessage());
						}
					}
					if (bola_x >= obs1_x && bola_x <= (obs1_x + ancho_obs) && bola_y >= obs1_y && bola_y <=(obs1_y+alto_obs)) {
						JOptionPane.showMessageDialog (this, "Lo siento. Has perdido");
						this.hilo_bolita = false;
						String nombre = JOptionPane.showInputDialog("Introduce tu nombre para añadirlo al de mejores jugadores");
						this.jugadores = null;
						try {
							this.jugadores = new FileWriter ("records.txt",true);
							if (nombre != null) {
								jugadores.write (nombre+" -> Partidas ganadas: "+juegos_ganados+"\n");
							}
							else { //por si se pulsa cancelar en vez de meter el nombre
								jugadores.write ("Anónimo"+" -> Partidas ganadas:"+juegos_ganados+"\n");
							}
							this.jugadores.close();
							this.mostrarArchivo();
						}
						catch (Exception ex) {
							System.out.println("Mensaje de la excepción: "+ex.getMessage());
						}
						
					}
					if (bola_x >= obs2_x && bola_x <= (obs2_x + ancho_obs) && bola_y >= obs2_y && bola_y <=(obs2_y+alto_obs)) {
						JOptionPane.showMessageDialog (this, "Lo siento. Has perdido");
						this.hilo_bolita = false;
						String nombre = JOptionPane.showInputDialog("Introduce tu nombre para añadirlo al de mejores jugadores");
						this.jugadores = null;
						try {
							this.jugadores = new FileWriter ("records.txt",true);
							if (nombre != null) {
								jugadores.write (nombre+" -> Partidas ganadas: "+juegos_ganados+"\n");
							}
							else { //por si se pulsa cancelar en vez de meter el nombre
								jugadores.write ("Anónimo"+" -> Partidas ganadas:"+juegos_ganados+"\n");
							}
							this.jugadores.close();
							this.mostrarArchivo();
						}
						catch (Exception ex) {
							System.out.println("Mensaje de la excepción: "+ex.getMessage());
						}
						
					}
					if (bola_x >= obs3_x && bola_x <= (obs3_x + ancho_obs) && bola_y >= obs3_y && bola_y <=(obs3_y+alto_obs)) {
						JOptionPane.showMessageDialog (this, "Lo siento. Has perdido");
						this.hilo_bolita = false;
						String nombre = JOptionPane.showInputDialog("Introduce tu nombre para añadirlo al de mejores jugadores");
						this.jugadores = null;
						try {
							this.jugadores = new FileWriter ("records.txt",true);
							if (nombre != null) {
								jugadores.write (nombre+" -> Partidas ganadas: "+juegos_ganados+"\n");
							}
							else { //por si se pulsa cancelar en vez de meter el nombre
								jugadores.write ("Anónimo"+" -> Partidas ganadas:"+juegos_ganados+"\n");
							}
							this.jugadores.close();
							this.mostrarArchivo();
						}
						catch (Exception ex) {
							System.out.println("Mensaje de la excepción: "+ex.getMessage());
						}
						
					}
					
					
						
				repaint();
			} catch (InterruptedException e) {
				System.out.println("se interrumpió el hilo de la bolita");
			}
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int codigo_tecla = e.getKeyCode(); // obtenemos el código de la tecla pulsada
		System.out.println("pulsada la tecla "+codigo_tecla);
		switch (codigo_tecla) {
			case 37: direccion = IZQUIERDA; break;
			case 38: direccion = ARRIBA; break;
			case 39: direccion = DERECHA; break;
			case 40: direccion = ABAJO; break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	
} // class
