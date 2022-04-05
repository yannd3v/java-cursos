package exercicios;

import java.util.Scanner;

public class Pratica26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int MINIMO = 50, MAXIMO = 100, RAZAO = 6, peso1 = 4, peso2 = 6;
		int valorInicial = 10, valorFinal = 0, limite, soma = 0, quant = 0, quantPares = 0, quantImpares = 0, quantImparesPor3 = 0;
		double mediaPonderada, quartoTermo, decimoTermo;
		
		String seq = "";
		
		do {
			System.out.println("Digite o valor do limite: ");
			limite = entrada.nextInt();
		} while(limite < MINIMO || limite > MAXIMO);
		entrada.close();
		
		for (int valor = valorInicial; valor <= limite; valor += RAZAO, quant++) {
			seq += valor + " ";
			soma += valor;
			valorFinal = valor;
			if (valor % 2 == 0) {
				quantPares++;
			} else if (valor % 2 != 0){
				quantImpares++;
			} if (valor % 2 != 0 && valor % 3 == 0) {
				quantImparesPor3++;
			}
		}
		
		System.out.println("A sequencia dos elementos é " + seq);
		System.out.println("A quantidade de elementos é " + quant);
		System.out.println("A media aritmetica do primeiro elemento e o ultimo elemento é " + ((valorInicial + valorFinal) / 2));
		System.out.println("Existe " + quantPares + " numeros pares");
		System.out.println("Existe " + quantImpares + " numeros impares");
		System.out.println("Existe " + quantImparesPor3 + " numeros impares divididos por 3");
		System.out.println("A soma dos elementos é " + soma);
		quartoTermo = valorInicial + (4 - 1) * RAZAO;
		decimoTermo = valorInicial + (10 - 1) * RAZAO;
		mediaPonderada = (quartoTermo * peso1 + decimoTermo * peso2) / (peso1 + peso2);
		System.out.println("A media ponderada entre o primeiro termo e o segundo termo é: " + mediaPonderada);
	}
}


