package modelo;

public class Loro extends AveVoladora {

	@Override
	public String volar() {
		return super.volar();
	}

	@Override
	public String caminar() {
		return super.caminar();
	}

	@Override
	public String nadar() {
		return super.nadar()+" aunque no suelas verme hacerlo.";
	}

	@Override
	public String sonidoEmitido() {
		return super.sonidoEmitido()+" Trua trua";
	}

	@Override
	public String toString() {
		return "\n\n\nSoy un loro \n" + volar() + "\n" + caminar() + "\n" + nadar() + "\n"+ sonidoEmitido();
	}

}
