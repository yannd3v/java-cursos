package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		double a = 4.5; // Eu defini essa variavel
		System.out.println(a);
		a = 12.57;
		System.out.println(a);
		
		var b = 5.6; // O java vai definir essa variavel
		System.out.println(b);
		
		var c = "Texto"; // O java vai definir essa variavel
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		var e = 12; // inteiro
		// (e = 12.01) proibido porque o "var" ja detectou que "e" nao é do tipo inteiro
		System.out.println(e);
		
	}

}
