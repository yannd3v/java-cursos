package exercicios;

public class Pratica20 {

	public static void main(String[] args) {
		int ctle = 1, valor = 1, res = 0;
		final int MULTIPLO = 2, LIMITE = 12;
		while (ctle < LIMITE) {
			res = valor * MULTIPLO;
			System.out.print(res + " ");
			valor++;
			ctle++;
		}
	}
}