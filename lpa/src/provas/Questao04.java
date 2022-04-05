package provas;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int anoMin = 1900;
		final int anoMax = 2020;
		final int janeiro = 1, dezembro = 12;
		int ano, mes;
		
		do {
			System.out.println("Informe o ano em um intervalo fechado de 1900 a 2020: ");
			ano = sc.nextInt();
			if (ano < anoMin || ano > anoMax) {
				System.out.println("O crit�rio para defini��o do ano n�o foi atendido");
			}
			System.out.println("Informe o m�s: ");
			mes = sc.nextInt();
			if (mes < janeiro || mes > dezembro) {
				System.out.println("O m�s informado n�o � v�lido");
			}
		} while (ano < anoMin || ano > anoMax && mes < janeiro || mes > dezembro);
		sc.close();
		
		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			switch (mes) {
			
			case 1: {
				
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 2: {
				System.out.println("Esse m�s tem 29 dias");
				break;
			}
			
			case 3: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 4: {
				System.out.println("Esse m�s tem 30 dias");
				break;
			}
			
			case 5: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 6: {
				System.out.println("Esse m�s tem 30 dias");
				break;
			}
			
			case 7: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 8: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 9: {
				System.out.println("Esse m�s tem 30 dias");
				break;
			}
			
			case 10: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 11: {
				System.out.println("Esse m�s tem 30 dias");
				break;
			}
			
			case 12: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + mes);
			}
		} else {
			switch (mes) {
			
			case 1: {
				
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 2: {
				System.out.println("Esse m�s tem 28 dias");
				break;
			}
			
			case 3: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 4: {
				System.out.println("Esse m�s tem 30 dias");
				break;
			}
			
			case 5: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 6: {
				System.out.println("Esse m�s tem 30 dias");
				break;
			}
			
			case 7: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 8: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 9: {
				System.out.println("Esse m�s tem 30 dias");
				break;
			}
			
			case 10: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			
			case 11: {
				System.out.println("Esse m�s tem 30 dias");
				break;
			}
			
			case 12: {
				System.out.println("Esse m�s tem 31 dias");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + mes);
			}
			
		}
	}

}
