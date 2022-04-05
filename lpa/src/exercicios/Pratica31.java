package exercicios;

public class Pratica31 {

	public static void main(String[] args) {
		int tamanhoDoVetor = 15;
		imprimir(sequencia(tamanhoDoVetor));
	}
	
	public static int[] sequencia(int tamanho) {
		int[] seq = new int[tamanho];
		for (int i = 0, num = 2; i < seq.length; i++, num+=2) {
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
