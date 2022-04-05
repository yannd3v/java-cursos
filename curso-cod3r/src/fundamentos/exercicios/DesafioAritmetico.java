package fundamentos.exercicios;

public class DesafioAritmetico {
	public static void main(String[] args) {
		/* Nesse exercicio eu resolvi o problema aritmetico de : 
		 * [6 * (3+2)]^2 / 3 * 2   -  (1-5) * (2-7)^2 / 2  <- ^3  / 10^3
		 */
		final double soma = 3+2;
		final double multiplicador1 = 6;
		final double divisor1 = 3*2;
		final double potencia = 2; 
		
		double calculo1 = (multiplicador1*(soma));
		double calculo2 = Math.pow(calculo1, potencia);
		double resultado1 = calculo2 / divisor1;
		System.out.println(resultado1);
		
		final double subtracao1 = 1-5;
		final double subtracao2 = 2-7;
		final double divisor2 = 2;
		
		double calculo3 = subtracao1 * subtracao2;
		double calculo4 = calculo3 / divisor2;
		double resultado2 = Math.pow(calculo4, potencia);
		System.out.println(resultado2);
		
		final double potencia2 = 3;
		final double divisor3 = Math.pow(10, 3);
		
		double calculo5 = resultado1 - resultado2;
		double calculo6 = Math.pow(calculo5, potencia2);
		double resultadofinal = calculo6 / divisor3;
		System.out.println(resultadofinal);

		
	}

}
