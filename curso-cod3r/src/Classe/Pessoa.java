package Classe;

public class Pessoa {
	String nomePessoa;
	Double pesoPessoa;
	
	Pessoa(String nomePessoa, double pesoPessoa) {
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	double comer(Comida comida) {
		return pesoPessoa += comida.pesoComida;
	}
}
