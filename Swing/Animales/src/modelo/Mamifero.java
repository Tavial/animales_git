package modelo;

public class Mamifero implements EmiteSonido, PuedeNadar {

	@Override
	public String sonidoEmitido() {
		return "Mi onomatopeya es... ";
	}

	@Override
	public String nadar() {	
		return "Puedo nadar";
	}

}
