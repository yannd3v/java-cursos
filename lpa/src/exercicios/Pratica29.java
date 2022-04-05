package exercicios;

import java.util.Scanner;

public class Pratica29 {

	public static void main(String[] args) {
		executar();
	}
	
	public static void executar() {
		double quantidade = obterDados1(), resultado = 0;
		char moedaOrigem = obterDados2(), moedaFutura = obterDados3();
		
		if (moedaOrigem == 'r' && moedaFutura == 'd') {
			resultado = RparaD(quantidade);
		} else if (moedaOrigem == 'r' && moedaFutura == 'e') {
			resultado = RparaE(quantidade);
		} else if (moedaOrigem == 'r' && moedaFutura == 'l') {
			resultado = RparaL(quantidade);
		} else if (moedaOrigem == 'd' && moedaFutura == 'r') {
			resultado = DparaR(quantidade);
		} else if (moedaOrigem == 'd' && moedaFutura == 'e') {
			resultado = DparaE(quantidade);
		} else if (moedaOrigem == 'd' && moedaFutura == 'l') {
			resultado = DparaL(quantidade);
		} else if (moedaOrigem == 'e' && moedaFutura == 'r') {
			resultado = EparaR(quantidade);
		} else if (moedaOrigem == 'e' && moedaFutura == 'd') {
			resultado = EparaD(quantidade);
		} else if (moedaOrigem == 'e' && moedaFutura == 'l') {
			resultado = EparaL(quantidade);
		} else if (moedaOrigem == 'l' && moedaFutura == 'r') {
			resultado = LparaR(quantidade);
		} else if (moedaOrigem == 'l' && moedaFutura == 'd') {
			resultado = LparaD(quantidade);
		} else if (moedaOrigem == 'l' && moedaFutura == 'e') {
			resultado = LparaE(quantidade);
		} else {
			imprimir("Não foi possível fazer a conversão");
		}
		
		if (resultado > 0) {
		imprimir("Você terá a quantidade de " + resultado + " dessa moeda");
		}
	}
	
	public static void imprimir(String str) {
		System.out.println(str);
	}
	
	public static void imprimir(Double vlr) {
		System.out.println(vlr);
	}
	public static Double obterDados1() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		imprimir("Qual valor será convetido ? ");
		return sc.nextDouble();
	}
	
	public static char obterDados2() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		imprimir("Qual é a moeda de origem ? \n(R)Real \n(D)Dolar \n(E)Euro \n(L)Libra");
		return sc.next().toLowerCase().charAt(0);
	}
	
	public static char obterDados3() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		imprimir("Para qual moeda deseja converter ? \n(R)Real \n(D)Dolar \n(E)Euro \n(L)Libra");
		return sc.next().toLowerCase().charAt(0);
	}
	
	 //Data da cotação utilizada : 10/11/2021
	// Fonte : Banco Central do Brasil
	public static double RparaD(double moeda) {
		return moeda*0.18;
	}
	
	public static double RparaE(double moeda) {
		return moeda*0.16;
	}
	
	public static double RparaL(double moeda) {
		return moeda*0.13;
	}
	
	public static double DparaR(double moeda) {
		return moeda*5.45;
	}
	
	public static double DparaE(double moeda) {
		return moeda*0.86;
	}
	
	public static double DparaL(double moeda) {
		return moeda*0.74;
	}
 	
	public static double EparaR(double moeda) {
		return moeda*6.28;
	}
	
	public static double EparaD(double moeda) {
		return moeda*1.15;
	}
	
	public static double EparaL(double moeda) {
		return moeda*0.85;
	}
	
	public static double LparaR(double moeda) {
		return moeda*7.35;
	}
	
	public static double LparaD(double moeda) {
		return moeda*1.34;
	}
	
	public static double LparaE(double moeda) {
		return moeda*1.16;
	}
}





