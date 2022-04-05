package EstruturasDeControle.exercicios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int notasValidas = 0;
		double notas = 0;
		double soma = 0;
		while (notas != -1) {
			System.out.println("Digite uma nota (ou -1 p/ sair)");
			notas = entrada.nextDouble();
			if (notas >= 0 && notas <= 10) {
				notasValidas++;
				soma += notas;
			} else if (notas != -1){
				System.out.println("Nota invalida");
			}
		}
		System.out.println("Existe " + notasValidas + " notas validas");
		System.out.println("A soma das notas é: " + soma);
		double media = soma / notasValidas;
		System.out.println("A media das notas é: " + media);
		entrada.close();

	}

}
