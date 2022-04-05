package exercicios;

import java.util.Scanner;

public class Pratica15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor de 1 a 7");
		int semana = sc.nextInt();
		sc.close();
		
		switch (semana) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terca-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta feira");
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
		default:
			System.out.println("Dia invalido");
			break;
		}
		

	}

}
