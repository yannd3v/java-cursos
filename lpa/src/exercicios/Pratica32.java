package exercicios;

public class Pratica32 {

	public static void main(String[] args) {
		int tamanhoDoVetor = 30;
		imprimir(sequencia(tamanhoDoVetor));
	}
	
	public static int[] sequencia(int tamanho) {
		int[] seq = new int[tamanho];
		for (int i = 0, num = 1; i < seq.length; i++, num++) {
			seq[i] = num;
		}
		return seq;
	}
	
	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + " ");
		}
	}
	
}

