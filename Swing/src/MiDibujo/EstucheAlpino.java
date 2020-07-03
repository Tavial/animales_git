package MiDibujo;

import java.awt.Color;

public class EstucheAlpino {

	private Color colorAmarillo;
	private Color colorCarne;
	private Color colorNaranja;
	private Color colorRojo;
	private Color colorRosa;
	private Color colorMorado;
	private Color colorAzulMarino;
	private Color colorAzul;
	private Color colorVerde;
	private Color colorVerdeOscuro;
	private Color colorMarron;
	private Color colorNegro;
	
	public EstucheAlpino () {
		this.colorAmarillo = new Color (250,229,68);
		this.colorCarne = new Color (223,169,135);
		this.colorNaranja = new Color (214,153,79);
		this.colorRojo = new Color (199,63,83);
		this.colorRosa = new Color (219,139,170);
		this.colorMorado = new Color (172,124,175);
		this.colorAzulMarino = new Color (94,135,195);
		this.colorAzul = new Color (105,171,225);
		this.colorVerde = new Color (125,178,149);
		this.colorVerdeOscuro = new Color (97,128,130);
		this.colorMarron = new Color (144,125,116);
		this.colorNegro = new Color (80,88,91);
		
	}
	
	public Color colorear (String color) {
		Color color_escogido = new Color(0,0,0);
		
		switch (color) {
		
			case "amarillo":
				color_escogido = this.colorAmarillo;
				break;
				
			case "carne":
				color_escogido = this.colorCarne;
				break;
			
			case "naranja":
				color_escogido = this.colorNaranja;
				break;
			
			case "rojo":
				color_escogido = this.colorRojo;
				break;
				
			case "rosa":
				color_escogido = this.colorRosa;
				break;
			
			case "morado":
				color_escogido = this.colorMorado;
				break;	
			
			case "azul marino":
				color_escogido = this.colorAzulMarino;
				break;
				
			case "azul":
				color_escogido = this.colorAzul;
				break;
			
			case "verde":
				color_escogido = this.colorVerde;
				break;
			
			case "verde oscuro":
				color_escogido = this.colorVerdeOscuro;
				break;
				
			case "marron":
				color_escogido = this.colorMarron;
				break;
			
			case "negro":
				color_escogido = this.colorNegro;
				break;	
				
		}
		
		return color_escogido;
		
	}
		
}
