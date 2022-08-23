package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = num -> num % 2  == 0 ? "Par" : "Impar";
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + "???";
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)     // Composição de função
				.apply(32);
		
		System.out.println(resultadoFinal);
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)     // Composição de função
				.apply(33);
		
		System.out.println(resultadoFinal2);
		
		 
 		

	}

}
