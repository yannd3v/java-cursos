package fundamentos;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b); // Comparacao de igual igualdade
									// é verdadeiro porque 'a' é 97 em hexadecimal
		
		System.out.println(3 > 4); // Maior que
		System.out.println(3 >= 3); // Maior igual que
		System.out.println(3 < 7); // Menor que
		System.out.println(30 <= 7); // Menor igual que
		System.out.println(30 != 7); // Diferente de
		
		
		double nota = 6.3;
		boolean bomComportamento = true;        // Se o aluno tiver bom comportamento e obtiver uma nota maior ou
		boolean passouPorMedia = nota >= 7;		// igual a 7, ele tem desconto
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}

}
