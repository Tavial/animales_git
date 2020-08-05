package modelo;

public class Tenor extends MamiferoTerrestre {

	@Override
	public String caminar() {
		return super.caminar();
	}

	@Override
	public String sonidoEmitido() {
		return super.sonidoEmitido()+" do, re, mi, fa, sol, la, siiii";
	}

	@Override
	public String nadar() {
		return super.nadar();
	}

	@Override
	public String toString() {
		return  "\n\n\nSoy un tenor \n"+caminar() + "\n"+ nadar()+"\n"+ sonidoEmitido();
	}

}
