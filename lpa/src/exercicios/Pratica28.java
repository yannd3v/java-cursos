package exercicios;

import java.util.Scanner;

public class Pratica28 {

	public static void main(String[] args) {
		executar();

	}
	
	public static void executar() {
		double valor = obterDados();
		int operacao = obterEscolha();
		double resultado;
		
		switch (operacao) {
		case 1:
			resultado = CparaK(valor);
			break;
		case 2:
			resultado = KparaC(valor);
			break;
		case 3:
			resultado = CparaF(valor);
			break;
		case 4:
			resultado = FparaC(valor);
			break;
		case 5:
			resultado = KparaF(valor);
			break;
		case 6:
			resultado = FparaK(valor);
			break;
		default:
			imprimir("Operação inválida");
			resultado = 0;
			break;
		}
		
		imprimir(resultado);
	}
	
	public static double CparaK(double temperatura) {
		return temperatura+273;
	}
	
	public static double KparaC(double temperatura) {
		return temperatura-273;
	}
	
	public static double CparaF(double temperatura) {
		return temperatura*1.8 + 32;
	}
	
	public static double FparaC(double temperatura) {
		return (temperatura-32) / 1.8;
	}
	
	public static double KparaF(double temperatura) {
		return 1.8*(temperatura - 273) + 32;
	}
	
	public static double FparaK(double temperatura) {
		return (temperatura-32)*5/9+273;
	}
	
	public static double obterDados() {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	imprimir("Informe um valor");
	return sc.nextDouble();
	
	}
	
	public static int obterEscolha() {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	imprimir("Informe a conversão que deseja:\n(1)Celsius para Kelvin \n(2)Kelvin para Celsius \n(3)Celsius para Fahrenheit"
			+ "\n(4)Fahrenheit para Celsius \n(5)Kelvin para Fahrenheit \n(6)Fahrenheit para Kelvin");
	return sc.nextInt();
	}
	
	public static void imprimir(String str) {
	System.out.println(str);	
	}
	
	public static void imprimir(Double vlr) {
	System.out.println(vlr);	
	}

}

