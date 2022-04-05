package exercicios;

import java.util.Scanner;

public class Pratica17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual desses animais sao invertebrados ? \n(a)Minhoca \n(b)Aranha \n(c)Cachorro \n(d)Gato");
		char animal = sc.next().charAt(0);

		switch (animal) {
		case 'a':
				int pontuacao = 1;
				System.out.println("Alternativa correta "+ pontuacao+ " ponto");
				break;
		case 'b':
				int pontuacao2 = 1;
				System.out.println("Alternativa correta "+ pontuacao2+ " ponto");
				break;
		case 'c':
				int pontuacao3 = 0;
				System.out.println("Alternativa incorreta "+ pontuacao3+ " ponto");
				break;
		case 'd':
				int pontuacao4 = 0;
				System.out.println("Alternativa incorreta "+ pontuacao4+ " ponto");
				break;
		default:
			int pontuacao5 = 0;
			System.out.println("Opcao incorreta "+ pontuacao5+ " ponto");
			break;
		}

		sc.close();
	}

}
