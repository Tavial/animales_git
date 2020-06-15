package Ejercicio009;

import java.util.Scanner;

/*
 * Escribir un programa que pida al usuario una palabra y muestre por pantalla el número 
 * de veces que contiene cada vocal.
 */

public class Principal {
	
	public static void main (String [] args) {
	
		String palabra, en_minusculas;
		Scanner entrada = new Scanner (System.in);
		int veces_a = 0, veces_e = 0, veces_i = 0, veces_o = 0, veces_u = 0;
        do {
        	System.out.println ("Introduce una palabra o frase: ");    
        	palabra = entrada.nextLine();
        	} while (palabra.isEmpty());
        
        System.out.println(palabra);
        
        en_minusculas = palabra.toLowerCase();
        
        for (int i=0; i<palabra.length(); i++) {
        	switch (en_minusculas.charAt(i)) {
        		case 'a':
        			veces_a++;
        			break;
        		case 'á':
        			veces_a++;
        			break;
        		case 'e':
        			veces_e++;
        			break;
        		case 'é':
        			veces_e++;
        			break;
        		case 'i':
        			veces_i++;
        			break;
        		case 'í':
        			veces_i++;
        			break;
        		case 'o':
        			veces_o++;
        			break;
        		case 'ó':
        			veces_o++;
        			break;
        		case 'u':
        			veces_u++;
        			break;
        		case 'ú':
        			veces_u++;
        			break;
        	} // switch
        	
        } // for 
        System.out.println();
        System.out.println("veces que aparece la 'a': "+veces_a);
        System.out.println("veces que aparece la 'e': "+veces_e);
        System.out.println("veces que aparece la 'i': "+veces_i);
        System.out.println("veces que aparece la 'o': "+veces_o);
        System.out.println("veces que aparece la 'u': "+veces_u);
        entrada.close();
	} // main
} // class
