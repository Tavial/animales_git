package modelo;

public class Gato extends MamiferoTerrestre{

	@Override
	public String caminar() {
		return super.caminar();
	}

	@Override
	public String sonidoEmitido() {
		return super.sonidoEmitido()+" miau, miau";
	}

	@Override
	public String nadar() {
		return super.nadar();
	}

	@Override
	public String toString() {
		return "\n\n\nSoy un gato \n" + caminar() + "\n" + nadar()+ "\n"+sonidoEmitido();
	}

	
}
