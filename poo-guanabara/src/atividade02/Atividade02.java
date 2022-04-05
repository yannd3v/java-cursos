package atividade02;

public class Atividade02 {
	public static void main(String[] args) {
		Desktop d1 = new Desktop();
		d1.motherboard = "B450M";
		d1.armazenamento = 1000;
		d1.potenciaFonte = 500;
		d1.ram = 8;
		d1.processador = "Athlon 3000g";
		d1.ligar();
		d1.status();
		d1.jogar();
	}
}
