package exercicios;

import java.util.Scanner;

public class Pratica27 {
	
	//M�todo que inicia a execucao da solucao
	public static void main(String[] args) {
		execucao();
	}
	
	// M�todo que executa os demais metodos e retorna o resultado
	public static void execucao() {
		double primeiroValor = obterDados(), segundoValor = obterDados();
		int operacao = obterOperacao();
		double resultado;
		//Executando a calculadora
		switch (operacao) {
		case 1:
			resultado = soma(primeiroValor, segundoValor);
			break;
		case 2:
			resultado = subtracao(primeiroValor, segundoValor);
			break;
		case 3:
			resultado = multiplicacao(primeiroValor, segundoValor);
			break;
		case 4:
			resultado = divisao(primeiroValor, segundoValor);
			break;
		default:
			imprimir("Operacao invalida");
			resultado = 0;
			break;
		}
		
		imprimir(resultado);
	}
	
	// Faz a soma de dois valores recebidos no par�metro do m�todo
	public static double soma(double a, double b) {
		return a+b;
	}
	
	// Faz a subtra��o de dois valores recebidos no par�metro do m�todo
	public static double subtracao(double c, double d) {
		return c-d;
	}
	
	// Faz a multiplica��o de dois valores recebidos no par�metro do m�todo
	public static double multiplicacao(double s, double t) {
		return s*t;
	}
	
	// Faz a divis�o de dois valores recebidos no par�metro do m�todo
	public static double divisao(double x, double y) {
		return x/y;
	}
	
	//Obter o valor informado  pelo usu�rio
	public static double obterDados() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		imprimir("Informe um valor: ");
		return sc.nextDouble();
	}
	
	//Obter a opera�ao informada pelo usu�rio
	public static int obterOperacao() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		imprimir("Informe a operacao:\n (1)Soma (2)Subtracao (3)Multiplicacao (4)Divisao");
		return sc.nextInt();
	}
	
	// Imprime um dado do tipo double
	public static void imprimir(double vlr) {
		System.out.println(vlr);
	}
	
	//Imprime um dado do tipo string
	public static void imprimir(String str) {
		System.out.println(str);
	}

}
