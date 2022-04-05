package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // Logica AND
		System.out.println(condicao1 || condicao2); // Logica OU
		System.out.println(condicao1 ^ condicao2); // Logica XOU (ou exclusivo)
		System.out.println(!condicao1); // Logica NOT
		System.out.println(!condicao2); // Logica NOT
		System.out.println(condicao1 && !condicao2); // Logica AND junto com NOT
		System.out.println(!!condicao1); // Dupla NOT
		
		System.out.println("\nTabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
	//	System.out.println(false && true);
	//	System.out.println(false && false);
		
		System.out.println("\nTabela verdade OU (OR)");
	//	System.out.println(true || true);
	//	System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade NAO (NOT)");
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
