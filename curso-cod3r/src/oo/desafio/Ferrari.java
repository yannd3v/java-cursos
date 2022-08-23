package oo.desafio;

public class Ferrari extends Carro {
	
	Ferrari(int velocidadeMax) {
		super(velocidadeMax);	
	}
	
	@Override
	void acelerar() {
		if(velocidadeAtual + 15 > VELOCIDADE_MAX) {
			velocidadeAtual = VELOCIDADE_MAX;
		} else {
			velocidadeAtual += 15;
		}
	}

}
