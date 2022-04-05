package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
	
		// If(expressao boolean) seguido por uma sentenca de codigo ou "{}" (bloco de codigo)
		// While(expressao boolean) seguido por uma sentenca de codigo ou "{}" (bloco de codigo)
		// For (variavel; expressao boolean; incremento ou decremento) seguido por uma sentenca de codigo ou "{}" (bloco de codigo)
		
		// Do {} (bloco de codigo) while (expressao boolean); -> é a unica estrutura que termina com ponto e virgula
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voce precisa falar as palavras magicas...");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");
		entrada.close();
	}

}
