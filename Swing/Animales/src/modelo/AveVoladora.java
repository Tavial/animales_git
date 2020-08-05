package modelo;

public class AveVoladora extends Ave implements PuedeVolar{

	@Override
	public String volar() {
		return "Puedo volar";
	}

}
