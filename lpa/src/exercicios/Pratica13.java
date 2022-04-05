package exercicios;

import java.util.Scanner;

public class Pratica13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor1, valor2, resultado;
		int operacao;
		System.out.println("Digite o primeiro numero:");
		valor1 = sc.nextDouble();
		System.out.println("Digite o segundo numero:");
		valor2 = sc.nextDouble();
		System.out.println("Informe a operacao: (1) Somar, (2) Subtrair, (3) Multiplicar, (4) Dividir");
		operacao = sc.nextInt();
		if (operacao == 1) {
			resultado = valor1 + valor2;
			System.out.println("O resultado da adicao e " + resultado);
		} else if (operacao == 2) {
			resultado = valor1 - valor2;
			System.out.println("O resultado da subtracao e " + resultado);
		} else if (operacao == 3) {
			resultado = valor1 * valor2;
			System.out.println("O resultado da multiplicacao e " + resultado);
		} else if (operacao == 4) {
			resultado = valor1 / valor2;
			System.out.println("O resultado da divisao e " + resultado);
		} else {
			System.out.println("Operacao invalida");
		}
		sc.close();
	}

}
