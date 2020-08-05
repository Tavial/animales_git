package modelo;

public class Murcielago extends MamiferoTerrestre implements PuedeVolar{

	@Override
	public String volar() {
		return "Puedo volar";
	}

	@Override
	public String caminar() {
		return super.caminar();
	}

	@Override
	public String sonidoEmitido() {
		return super.sonidoEmitido()+" chui chui chui";
	}

	@Override
	public String nadar() {
		return super.nadar()+" aunque no suelas verme hacerlo.";
	}

	@Override
	public String toString() {
		return "\n\n\nSoy un murciélago \n" + volar() + "\n" + caminar() + "\n"  + nadar() +"\n"+sonidoEmitido();
	}

}
