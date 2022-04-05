package exercicios;

import java.util.Scanner;

public class Pratica14 {

	public static void main(String[] args) {
		Scanner vlr = new Scanner(System.in);
		int valor1, valor2, valor3;
		System.out.println("Informe 3 valores inteiros de 10 a 90 :");
		valor1 = vlr.nextInt(); valor2 = vlr.nextInt(); valor3 = vlr.nextInt();
		if (valor1 < 10 || valor1 > 90 || valor2 < 10 || valor2 > 90 || valor3 < 10 || valor3 > 90){
			System.out.println("Valores incorretos");
		} else if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
			System.out.println("Valores repetidos");
		} else if (valor1 > valor2 && valor1 > valor3 && valor2 < valor3) {
			System.out.println("O valor 1 é o maior numero e o valor 2 é o menor numero");
		} else if (valor1 > valor2 && valor1 > valor3 && valor3 < valor2) {
			System.out.println("O valor 1 é o maior numero e o valor 3 é o menor numero");
		} else if (valor2 > valor1 && valor2 > valor3 && valor1 < valor3) {
			System.out.println("O valor 2 é o maior numero e o valor 1 é o menor numero");
		} else if (valor2 > valor1 && valor2 > valor3 && valor3 < valor1) {
			System.out.println("O valor 2 é o maior numero e o valor 3 é o menor numero");
		} else if (valor3 > valor1 && valor3 > valor2 && valor1 < valor2) {
			System.out.println("O valor 3 é o maior numero e o valor 1 é o menor numero");
		} else if (valor3 > valor1 && valor3 > valor2 && valor2 < valor1) {
			System.out.println("O valor 3 é o maior numero e o valor 2 é o menor numero");
		}
		vlr.close();
		

	}

}
