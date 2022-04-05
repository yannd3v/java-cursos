package exercicios;

public class Pratica23 {

	public static void main(String[] args) {
		int num= 99;
		int contador = 0;
		do {
			if (num%3 == 0 && num%2 != 0) {
			System.out.print(num + " ");
			contador++;
			}
			num-= 1;
		} while (contador < 15);


}
}