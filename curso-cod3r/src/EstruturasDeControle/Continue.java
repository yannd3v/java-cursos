package EstruturasDeControle;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue; // O CONTINUE interrompe apenas a proxima iteracao, nesse caso ele nao ira
							// repetir os numeros que divido por 2 o resto é 1
			}
			System.out.println(i);
		}
			System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue; // O CONTINUE nesse caso interrompe quando i é igual a 5 e pula para a proxima
							// iteracao
			}
			System.out.println(i);
		}
	}

}
