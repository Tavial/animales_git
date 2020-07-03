package MiDibujo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Lamina1 extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		//Hacemos refundición
		EstucheAlpino misLapices = new EstucheAlpino ();  // instanciamos nuestro estuche de 12 colores
		
		
		Graphics2D g2D = (Graphics2D) g;
		
		Ellipse2D circulo = new Ellipse2D.Double (0,0,450,450);

		g2D.setPaint(misLapices.colorear("negro"));
		g2D.draw(circulo);
		g2D.setPaint(misLapices.colorear("carne"));
		g2D.fill(circulo);
		double centroX = circulo.getCenterX();
		double centroY = circulo.getCenterY();	
		System.out.println (centroX+", "+centroY);
		
		int [] cuadrado_x = {0,225,450,225};
		int [] cuadrado_y = {225,0,225,450};
		g2D.setPaint(misLapices.colorear("negro"));
		g2D.drawPolygon(cuadrado_x, cuadrado_y, 4);
		g2D.setPaint(misLapices.colorear("azul marino"));
		g2D.fillPolygon (cuadrado_x, cuadrado_y, 4);
		
		g2D.setPaint(misLapices.colorear("negro"));
		g2D.drawLine(225, 0, 225, 450);
		g2D.drawLine(0, 225, 450, 225);
		g2D.drawLine(225, 0, 225, 450);
		g2D.drawLine(66, 384, 384, 66);
		g2D.drawLine(66, 66, 384, 384);
		
		Rectangle2D cuadrado = new Rectangle2D.Double(112.5, 112.5, 225, 225);
		g2D.setPaint(misLapices.colorear("negro"));
		g2D.draw(cuadrado);
		g2D.setPaint(misLapices.colorear("amarillo"));
		g2D.fill(cuadrado);
		
		Ellipse2D circulo2 = new Ellipse2D.Double (112.5,112.5,225,225);
		g2D.setPaint(misLapices.colorear("negro"));
		g2D.draw(circulo2);
		g2D.setPaint(misLapices.colorear("morado"));
		g2D.fill(circulo2);
		
		Rectangle2D cuadrado2 = new Rectangle2D.Double(146, 146, 160, 160);
		g2D.setPaint(misLapices.colorear("negro"));
		g2D.draw(cuadrado2);
		g2D.setPaint(misLapices.colorear("verde"));
		g2D.fill(cuadrado2);
		
		int [] cuadrado2_x = {225,303,225,147};
		int [] cuadrado2_y = {147,225,303,225};
		g2D.setPaint(misLapices.colorear("negro"));
		g2D.drawPolygon(cuadrado2_x, cuadrado2_y, 4);
		g2D.setPaint(misLapices.colorear("naranja"));
		g2D.fillPolygon (cuadrado2_x, cuadrado2_y, 4);
		
		Ellipse2D circulo3 = new Ellipse2D.Double (185,185,80,80);
		g2D.setPaint(misLapices.colorear("negro"));
		g2D.draw(circulo3);
		g2D.setPaint(misLapices.colorear("rojo"));
		g2D.fill(circulo3);
	}
	
}
