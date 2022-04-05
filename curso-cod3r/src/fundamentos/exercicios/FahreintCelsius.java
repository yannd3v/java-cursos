package fundamentos.exercicios;

import java.util.Scanner;

public class FahreintCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f, c;
		System.out.println("Digite a temperatura em Fahrenheit: ");
		f = sc.nextDouble();
		c = (f - 32) / 1.8;
		System.out.println(c);
		sc.close();

	}

}
