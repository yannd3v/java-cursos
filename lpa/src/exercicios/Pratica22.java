package exercicios;

public class Pratica22 {

	public static void main(String[] args) {
		int multiplo2 = 1; int contador = 0;
		do {
			if (multiplo2==1) {
				multiplo2++;
			}
			System.out.print(multiplo2 + " ");
			multiplo2+= 2 ;
			contador++;
		} while (contador < 12);

	}

}
