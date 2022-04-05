package atividade03;

public class Atividade03 {
	public static void main(String[] args) {
		Desktop d1 = new Desktop("B450M", "Athlon 3000g", 500);
		d1.setArmazenamento(1000);
		d1.setRam(8);
		d1.status();
		d1.jogar();
	}
}
