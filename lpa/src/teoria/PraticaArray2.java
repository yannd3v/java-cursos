package teoria;

import java.util.Scanner;

public class PraticaArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		imprimir("Informe o tamanho do vetor");
		int tamanhoDoVetor = sc.nextInt();
		imprimir("Informe o índice da posição do elemento do vetor");
		int posicaoElemento = sc.nextInt();
		imprimir(sequencia(tamanhoDoVetor), posicaoElemento);
		imprimir("");
		imprimir(sequencia(tamanhoDoVetor));
		sc.close();
	}
	
	public static int[] sequencia(int tamanho) {
		int[] seq = new int[tamanho];
		for (int i = 0, num = 5; i < seq.length; i++, num++) {
			seq[i] = num;
		}
		return seq;
	}
	
	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + " ");
		}
	}
	
	public static void imprimir(int[] v, int posicao) {
		System.out.println(v[posicao]);
	}
	
	public static void imprimir(String s) {
		System.out.println(s);
	}
}
