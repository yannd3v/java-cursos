package EstruturasDeControle;

public class For1 {

	public static void main(String[] args) {
	// o FOR é mais indicado em casos que tem determinacao, ou seja, quando voce tem uma variavel e sabe quantas vezes tem que repetir
		
		
		for(int contador = 0; contador <= 20; contador += 2) { // (a;b;c) -> a = variavel, b = expressao se verdadeiro ou falso, c = incremento ou decremento
			System.out.printf("i = %d\n", contador);
		}
		// Um exemplo FOR sem a variavel e o incremento estar dentro da estrutura
	//	int x = 2;
	//	for(; x <= 10;) {
	//		System.out.println("x = " + x);
	//		x++;
	//	}
		
		// Laco infinito!!
	//	for(;true;) {  ou apenas for(;;)
		//	System.out.println("Fim!");
	//	}
	}

}
