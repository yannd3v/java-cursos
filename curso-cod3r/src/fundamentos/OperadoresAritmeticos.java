package fundamentos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3); // Soma na impressao do sysout
		
		var x = 34.56; // O java vai definir essa variavel
		double y = 2.2;
		
		System.out.println(x + y); // Adicao
		System.out.println(x - y); // Subtracao
		System.out.println(x * y); // Multiplicacao
		System.out.println(x / y); // Divisao
		
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // O resultado vai ser 2 porque é o numero inteiro mais proximo
		System.out.println(a / (double) b); // Realizando um CAST podemos forcar um resultado de numero inteiro
		System.out.println(a / (float) b); // Realizando um CAST porem o resultado vai ser menor que um DOUBLE
		
		System.out.println(a % b); // Resto da divisao
		
		System.out.println(x+y - a*b); // A multiplicacao vem antes da adicao (ordem de precedencia)
	}

}
