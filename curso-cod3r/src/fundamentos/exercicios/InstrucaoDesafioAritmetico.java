package fundamentos.exercicios;

public class InstrucaoDesafioAritmetico {

	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); // elevando o numero ao cubo e fazendo um cast para o resultado sair do tipo inteiro
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
	}

}
