package exercicios;

import java.util.Scanner;

public class Pratica16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("(1) Somar (2) Subtrair (3) Multiplicar (4) Dividir");
		int operacao = sc.nextInt();
		if (operacao >=1 && operacao <=4) {

			System.out.println("Digite o primeiro valor: ");
			double valor1 = sc.nextDouble();

			System.out.println("Digite o segundo valor: ");
			double valor2 = sc.nextDouble();

			if (valor1 >= 1 && valor2 >=1) {
				switch (operacao) {
				case 1:
					if (operacao == 1) {
						double resultado = valor1 + valor2;
						System.out.println(resultado);
						break;
					}
				case 2:
					if (operacao == 2) {
						double resultado = valor1 - valor2;
						System.out.println(resultado);
						break;
					}
				case 3:
					if (operacao == 3) {
						double resultado = valor1 * valor2;
						System.out.println(resultado);
						break;
					}
				case 4:
					if (operacao == 4) {
						double resultado = valor1 / valor2;
						System.out.println(resultado);
						break;
					}
				default:
					System.out.println("Operacao invalida");
				}
			} else {
				System.out.println("Valor incorreto");
			}
		} else {
			System.out.println("Operacao invalida");
		}
		sc.close();
	}

}
