package EstruturasDeControle.exercicios;

public class DesafioFor {

	public static void main(String[] args) {
		
		// DESAFIO FOR
		// Chegar em 5 "#" sem utilizar valores numericos
		
		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}

}
