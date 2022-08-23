package oo.desafio;

public class Teste {

	public static void main(String[] args) {
		Ferrari f1 = new Ferrari(500);
		f1.setVelocidadeAtual(495);
		f1.acelerar();
		f1.acelerar();
		//f1.frear();
		
		System.out.println(f1.velocidadeAtual);
		
		/*Civic c1 = new Civic(200);
		c1.setVelocidadeAtual(50);
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		
		System.out.println(c1.velocidadeAtual);*/
		
	}

}
