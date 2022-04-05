package Classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(5.6);
		
		AreaCirc a2 = new AreaCirc(10);
		//a2.pi = 5; // Podemos alterar o valor "static" de pi dessa maneira mas não é recomendado
		
		AreaCirc.pi = 3.1415; // Maneira correta de alterar o valor "static"
		
		System.out.println(a1.area());
		
		AreaCirc.pi = 0.1; // A partir dessa linha o valor de pi será outro
		
		System.out.println(a2.area());
	}

}
