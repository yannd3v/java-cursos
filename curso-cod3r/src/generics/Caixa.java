package generics;

public class Caixa<TIPO> {
	
	private TIPO coisa;

	public TIPO abrir() {
		return coisa;
	}

	public void guardar(TIPO coisa) {
		this.coisa = coisa;
	}
}
