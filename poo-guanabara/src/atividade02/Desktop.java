package atividade02;

public class Desktop {
	String motherboard;
	String processador;
	int armazenamento;
	int ram;
	double potenciaFonte;
	boolean ligado;
	
	void status() {
		System.out.println("A placa mãe é :" + this.motherboard);
		System.out.println("O processador é: " + this.processador);
		System.out.println("Possui " + this.armazenamento + " gb de armazenamento");
		System.out.println("Possui " + this.ram + " gb de memória ram");
		System.out.println("Possui " + this.potenciaFonte + " W de potência");
		System.out.println("O computador está ligado ?" + this.ligado);
	}
	
	
	void ligar() {
		this.ligado = true;
	}
	
	void desligar() {
		this.ligado = false;
	}
	
	void jogar() {
		if (this.ligado == true) {
			System.out.println("Bora jogar!");
		} else {
			System.out.println("Não consigo jogar");
		}
	}
}
