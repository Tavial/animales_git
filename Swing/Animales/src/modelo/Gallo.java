package modelo;

public class Gallo extends AveNoVoladora{

	@Override
	public String caminar() {
		// TODO Auto-generated method stub
		return super.caminar();
	}

	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return super.nadar()+" aunque no suelas verme hacerlo.";
	}

	@Override
	public String sonidoEmitido() {
		return super.sonidoEmitido()+" quiquiriquí";
	}

	@Override
	public String toString() {
		return "\n\n\nSoy un gallo \n" + caminar() + "\n" + nadar() + "\n" + sonidoEmitido();
	}

	
	
}
