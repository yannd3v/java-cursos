package EstruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		// O while é mais indicado para casos em que tem indeterminacao, ou seja, quando voce nao sabe quantas vezes ira se repetir alguma coisa
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		// Um exemplo é quando voce recebe um valor de entrada, como esse
		while (!valor.equalsIgnoreCase("sair")) { // Enquanto o valor nao for "sair", imprima "Voce diz: "
			System.out.println("Voce diz: ");
			valor = entrada.nextLine();
		}
		entrada.close();
	}

}
