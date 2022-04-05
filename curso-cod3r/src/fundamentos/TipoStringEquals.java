package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2"); // Nesse caso é verdadeiro
		
		String s1 = new String("2");
		System.out.println("2" == s1); // Nesse caso é falso porque o java nao entende que "2" é igual a variavel STRING "s1"
		System.out.println("2".equals(s1)); // Verdadeiro, essa é a melhor maneira de comparar strings, utilizando a notacao ponto EQUALS
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		System.out.println("2" == s2.trim()); // Falso, pois nao esta utilizando o EQUALS para comparar
		System.out.println("2".equals(s2.trim())); // Verdadeiro, combinacao da estrutura de comparacao de STRING utilizando o EQUALS
													// e a notacao ponto TRIM para remover os espacos em branco, caso aconteca.
		entrada.close();
	}

}
