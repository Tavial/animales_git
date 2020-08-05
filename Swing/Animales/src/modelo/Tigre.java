package modelo;

public class Tigre extends MamiferoTerrestre{

	@Override
	public String toString() {
		return "\n\n\nSoy un tigre \n"+ caminar() +  "\n" + nadar()+"\n" + sonidoEmitido() ;
	}

	@Override
	public String caminar() {
		return super.caminar();
	}

	@Override
	public String sonidoEmitido() {
		return super.sonidoEmitido()+" ¡Grrrr... !";
	}

	@Override
	public String nadar() {
		return super.nadar();
	}

	
}
