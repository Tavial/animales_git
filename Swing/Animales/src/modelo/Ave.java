package modelo;

public class Ave implements EmiteSonido, PuedeNadar, PuedeCaminar {

	@Override
	public String caminar() {
		return "Puedo caminar";
	}

	@Override
	public String nadar() {
		return "Puedo nadar";
	}

	@Override
	public String sonidoEmitido() {
		return "Mi onomatopeya es ...";
	}

}
