package EstruturasDeControle;

public class Break {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				break; // O break interrompe e impede que ele continue
			}
			System.out.println(i);
		}
		System.out.println("Fim");

	}

}
