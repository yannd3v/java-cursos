package teoria;

public class ArrayUnidimensional {

	public static void main(String[] args) {
		int[] vetor = obterVetorLiteral();
		imprimir(vetor);

	}
	
	public static int[] obterVetorLiteral() {
		int[] conjuntoDados = {18, 32, 29, 15};
		return conjuntoDados;
	}
	
	public static int[] obterVetorIndividual() {
		int[] conjuntoDados = new int[4];
		conjuntoDados [0] = 18;
		conjuntoDados [3] = 15;
		conjuntoDados [1] = 32;
		conjuntoDados [2] = 29;
		return conjuntoDados;
	}
	
	public static void imprimir(int[] v) {
		System.out.println(v[3]);
	}

}
