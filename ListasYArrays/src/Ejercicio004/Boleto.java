package Ejercicio004;

public class Boleto {
	
	// Constructor
	public Boleto (int numero) {
		this.numero = numero;
	}
	// Método getter
	public int mostrarNumero() {
		return this.numero;
	}
	// Método setter
	public void asignarNumero(int numero) {
		this.numero = numero;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boleto other = (Boleto) obj;
		if (numero != other.numero)
			return false;
		return true;
	}



	private int numero;

}
