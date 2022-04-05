package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println("Mini desafio..."); 
		System.out.println(++a == b--); // Verdadeiro, porque ++a tem mais prioridade na ordem de precedencia enquanto o b-- nao tem prioridade e executa depois.
		System.out.println(a == b); // Falso, porque o b-- executa
		System.out.println(a);
		System.out.println(b);

	}

}
