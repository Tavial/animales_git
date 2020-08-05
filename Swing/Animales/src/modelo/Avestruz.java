package modelo;

public class Avestruz extends AveNoVoladora {

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
		return super.sonidoEmitido()+" aaaá aiii aiii aiii";
	}

	@Override
	public String toString() {
		return "\n\n\nSoy una avestruz \n" + caminar() + "\n" + nadar() + "\n" + sonidoEmitido();
	}

}
