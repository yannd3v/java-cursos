package teoria;

public class ClasseMetodo {

	public static void main(String[] args) {
		sequencia();
		int resultado = soma(3,5);
		System.out.println(resultado);
		System.out.println(subtracao(3, 5));
	}
	
	public static void sequencia() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
	
	public static int soma (int a, int b) {
		return a+b;
	}

	public static int subtracao (int x, int y) {
		return y-x;
	}
}
