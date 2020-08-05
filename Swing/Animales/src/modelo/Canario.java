package modelo;

public class Canario extends AveVoladora{

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
		return super.nadar();
	}

	@Override
	public String sonidoEmitido() {
		return super.sonidoEmitido()+" tuuuilo tuuuilo tuiii tuiii ";
	}

	@Override
	public String toString() {
		return "\n\n\nSoy un canario \n"+volar() + "\n" +caminar() +"\n" + nadar() +"\n" + sonidoEmitido();
	}

}
