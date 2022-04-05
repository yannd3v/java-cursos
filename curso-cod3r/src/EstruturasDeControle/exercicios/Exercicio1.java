package EstruturasDeControle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("Esse numero é par");
		} else {
			System.out.println("Esse numero é impar");
		}
		sc.close();
	}
	
}
