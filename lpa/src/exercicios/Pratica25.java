package exercicios;

public class Pratica25 {

	public static void main(String[] args) {

		for (int numero = 1900; numero <= 2032; numero++) {
			if ((numero % 400 == 0 || (numero % 4 == 0)) && (numero % 100 != 0)) {
				System.out.print(numero + " ");
			}
		}

	}
}