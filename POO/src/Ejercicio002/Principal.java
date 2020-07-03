package Ejercicio002;

/*
 * Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y 
 * cantidad (puede tener decimales).
 * 
 * El titular será obligatorio y la cantidad es opcional. Crea dos constructores 
 * que cumpla lo anterior.
 * 
 * Crea sus métodos get y set.
 * Tendrá dos métodos especiales:
 * 
 * ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad 
 * introducida es negativa, no se hará nada.
 * 
 * retirar(double cantidad): se retira una cantidad a la cuenta, si restando la 
 * cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a
 * ser 0.
 */

public class Principal {

		public static void main (String[] args) {
			
			Cuenta cuenta1 = new Cuenta ("Tatiana Viejo",27000);
			Cuenta cuenta2 = new Cuenta ("Alfredo Velasco");
			
			System.out.println ("El titular "+cuenta1.mostrarTitular()+" tiene en la cuenta "+cuenta1.mostrarCantidad()+" €");
			System.out.println ("El titular "+cuenta2.mostrarTitular()+" tiene en la cuenta "+cuenta2.mostrarCantidad()+" €");
			System.out.println();
			
			cuenta2.ingresar(1000);
			cuenta2.ingresar(-1000);
			cuenta1.retirar (28000);
			
			System.out.println ("El titular "+cuenta1.mostrarTitular()+" tiene en la cuenta "+cuenta1.mostrarCantidad()+" €");
			System.out.println ("El titular "+cuenta2.mostrarTitular()+" tiene en la cuenta "+cuenta2.mostrarCantidad()+" €");
			
		}
}
