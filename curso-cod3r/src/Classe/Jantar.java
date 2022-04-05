package Classe;

public class Jantar {

	public static void main(String[] args) {
		Comida c1 = new Comida("Macarrao", 0.5);
		Comida c2 = new Comida("Arroz", 0.2);
		
		
		Pessoa p = new Pessoa("Yann", 60.0);
		
		
		double pesoFinal = p.comer(c1);
		System.out.println(pesoFinal);
		double pesoFinal2 = p.comer(c2);
		System.out.println(pesoFinal2);
		
	}

}
