package exercicios;

import java.util.Scanner;

public class Pratica30 {

	public static void main(String[] args) {
		//obterNota(nota1, nota2, nota3);
	}
	
	public static void imprimir(String str) {
		System.out.println(str);
	}
	
	public static void imprimir(double vlr) {
		System.out.println(vlr);
	}
	
	public static double obterNota(double nota1, double nota2, double nota3) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for(int contador = 0; contador < 6; contador++) 
		imprimir("Informe as notas: ");
		return sc.nextDouble();
		
		
	}
	
	public static double primeiraUnidade (double nota1, double nota2, double nota3) {
		return nota1*2+nota2*3+nota3*5/10;
	}
	
	public static double segundaUnidade (double nota4, double nota5, double nota6) {
		return nota4*2+nota5*3+nota6*5/10;
	}
	
	public static String resultadoFinal(double primeiraUnidade, double segundaUnidade) {
		return ("aprovado");
	}
	

}
