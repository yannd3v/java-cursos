package EstruturasDeControle;

public class ContinueRotulado {

	public static void main(String[] args) {

		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					continue externo; // continue; por padrao vai agir na estrutura mais interna, por causa disso podemos
									// criar um ROTULO para a outra estrutura mais externa e inserir o ROTULO ao lado do CONTINUE
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim");

	}

}
