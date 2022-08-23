package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		
		// não é obrigatório tratar esse erro
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		// é obrigatório tratar esse erro
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
		
	}
	
	// Exceção NÃO checada ou NÃO verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	// Exceção checada ou verificada (é preciso colocar o "throws" na assinatura do método)
	
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02");
	}
}
