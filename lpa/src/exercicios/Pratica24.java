package exercicios;

public class Pratica24 {

	public static void main(String[] args) {
		int num = 0; int num2 = 1; int cont = 0; int soma = 0;
		do {
			System.out.print(num + " ");
			soma = num + num2;
			num = num2;
			num2 = soma;
			cont++;
		} while (cont < 20);

	}

}
