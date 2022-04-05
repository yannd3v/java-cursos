package jogos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean sair = false;
		while (!sair){
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n\n\n\n\n\n\n\n\n\n");
			System.out.println("====================================");
			System.out.println("Digite a opção do jogo para começar");
			System.out.println("1: Jogo da velha");
			System.out.println("2: Jogo da forca");
			System.out.println("3: Sair");
			System.out.println("====================================");

			int valor = scanner.nextInt();
			System.out.println("\n\n\n\n\n\n\n\n\n\n");

			switch (valor) {
			case 1: 
				JogoDaVelha.Iniciar();
				break;
			case 2: 
				JogoDaForca.Iniciar();
				break;
			case 3: 
				sair = true;
				break;
			default: System.out.println("Valor incorreto!!");
			}
		}
	}
}


