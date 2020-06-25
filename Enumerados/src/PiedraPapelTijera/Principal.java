package PiedraPapelTijera;



public class Principal {
	
	public static void main (String[] args) {
		String eleccion_jugador, eleccion_maquina;
		boolean empate = false;
		Maquina maquina = new Maquina ();
		Persona jugador = new Persona ();
	
		do {
		
			eleccion_jugador = jugador.escogePiedraPapelTijera(); 
			eleccion_maquina = maquina.escogePiedraPapelTijera();
		
			if (eleccion_jugador.equals(eleccion_maquina)) {
				empate = true;
				System.out.println ("La máquina ha escogido también "+eleccion_maquina+". Habéis empatado. Juega otra vez");	
			}
			else {
				if (eleccion_jugador.equals("PIEDRA") && eleccion_maquina.contentEquals("PAPEL")) {
					System.out.println ("La máquina ha escogido "+eleccion_maquina+".El papel envuelve a la piedra. Has PERDIDO");
					empate = false;
				}
				else {
					if (eleccion_jugador.equals("PIEDRA") && eleccion_maquina.contentEquals("TIJERA")) {
						System.out.println ("La máquina ha escogido "+eleccion_maquina+". La piedra aplasta a la tijera. Has GANADO");
						empate = false;
					}
					else {
						if (eleccion_jugador.equals("PAPEL") && eleccion_maquina.contentEquals("PIEDRA")) {
							System.out.println ("La máquina ha escogido "+eleccion_maquina+". El papel envuelve a la piedra. Has GANADO");
							empate = false;
						}
						else {
							if (eleccion_jugador.equals("PAPEL") && eleccion_maquina.contentEquals("TIJERA")) {
								System.out.println ("La máquina ha escogido "+eleccion_maquina+". La tijera corta el papel. Has PERDIDO");
								empate = false;
							}
							else {
								if (eleccion_jugador.equals("TIJERA") && eleccion_maquina.contentEquals("PIEDRA")) {
									System.out.println ("La máquina ha escogido "+eleccion_maquina+". La piedra aplasta a la tijera. Has PERDIDO");
									empate = false;
								}
								else {
									if (eleccion_jugador.equals("TIJERA") && eleccion_maquina.contentEquals("PAPEL")) {
										System.out.println ("La máquina ha escogido "+eleccion_maquina+". La tijera corta el papel. Has GANADO");
										empate = false;
									}
								}
							}
						}
					}
				}
			}
			
		} while (empate);	
	} 	
}

