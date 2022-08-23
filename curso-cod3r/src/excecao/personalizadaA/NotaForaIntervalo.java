
package excecao.personalizadaA;

public class NotaForaIntervalo extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String nomeDoAtributo;
	
	public NotaForaIntervalo(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está negativo" + nomeDoAtributo);
	}

}
