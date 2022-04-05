package Classe;

public class Produto {
	
	String nome;
	double preco; // objeto (atributo)
	static double desconto = 0.25;
	
	Produto() {
		
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() { // metodo (comportamento)
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
