package fundamentos.exercicios;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner F = new Scanner(System.in);
		double celsius, fahrenheit;
		final double fator = 1.8;
		final int ajuste = 32;
		System.out.println("Digite o valor em fahrenheit que deseja converter para celsius: ");
		fahrenheit = F.nextDouble();
		F.close();
		celsius = (fahrenheit - ajuste)/fator;
		System.out.println("A temperatura em celsius é : " + celsius);
		
	}

}
