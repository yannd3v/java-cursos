package oo.desafio;

public class Carro {
	int velocidadeAtual;
	final int VELOCIDADE_MAX;
	
	Carro(int velocidadeMax){
		VELOCIDADE_MAX = velocidadeMax;
	}
	
	void acelerar() {
		if(velocidadeAtual + 5 > VELOCIDADE_MAX) {
			velocidadeAtual = VELOCIDADE_MAX;
		} else {
			velocidadeAtual += 5;
		}
		
	}
	
	void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	
}
