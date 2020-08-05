package modelo;

public class MamiferoTerrestre extends Mamifero implements PuedeCaminar{

	@Override
	public String caminar() {
		return "Puedo caminar";
	}
	

}
