package atividade02;

public class Desktop {
	String motherboard;
	String processador;
	int armazenamento;
	int ram;
	double potenciaFonte;
	boolean ligado;
	
	void status() {
		System.out.println("A placa m�e � :" + this.motherboard);
		System.out.println("O processador �: " + this.processador);
		System.out.println("Possui " + this.armazenamento + " gb de armazenamento");
		System.out.println("Possui " + this.ram + " gb de mem�ria ram");
		System.out.println("Possui " + this.potenciaFonte + " W de pot�ncia");
		System.out.println("O computador est� ligado ?" + this.ligado);
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
			System.out.println("N�o consigo jogar");
		}
	}
}
