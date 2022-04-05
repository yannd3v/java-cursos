package EstruturasDeControle;

public class BreakRotulado {

	public static void main(String[] args) {
		// por padrao ira agir na estrutura mais interna, por iso...

		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break externo; // break; por padrao vai agir na estrutura mais interna, por causa disso podemos
									// criar um ROTULO para a outra estrutura mais externa e inserir o ROTULO ao lado do break
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim");

	}

}
