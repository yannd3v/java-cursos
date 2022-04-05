package fundamentos.exercicios;

public class Bhaskara {

	public static void main(String[] args) {
		final int a = 1, b = 12, c = -13;
		double delta, x1, x2;
		
		delta = Math.pow(b, 2) - 4*a*c; // Utilizei a funcao Math.pow para resolver a potencia de b²
		System.out.println(delta);		
		
		x1 = (-b + Math.sqrt(delta))/ 2*a; // Utilizei a funcao Math.sqrt para resolver a raiz quadrada de delta
		System.out.println(x1);
		
		x2 = (-b - Math.sqrt(delta))/ 2*a; // Novamente utilizei a funcao Math.sqrt para resolver a raiz quadrada de delta
		System.out.println(x2);
	}

}
