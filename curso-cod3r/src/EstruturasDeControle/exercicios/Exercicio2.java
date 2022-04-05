package EstruturasDeControle.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano;
		System.out.println("Digite o ano atual: ");
		ano = sc.nextInt();
		sc.close();
		
		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			System.out.println("Esse ano é bissexto");
		} else {
			System.out.println("Esse ano nao é bissexto");
		}
	}

}
