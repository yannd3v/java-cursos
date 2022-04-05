package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Senhora"); // Trocar strings por outras strings
		s = s.toUpperCase(); // usar letras maiusculas
		s = s.concat("!!!!!!"); // concatenar strings
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!!!");
		System.out.println(y);
		
		// TIPOS PRIMITIVOS NAO TEM OPERADOR "."
		int a = 3; // < exemplo
		System.out.println(a);
	}

}
