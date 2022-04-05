package fundamentos;

import java.util.Scanner;

public class RaizCubica {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Digite um numero: ");
	 double numero = sc.nextDouble();
	 double raiz = Math.cbrt(numero);
	 System.out.println(raiz);
	 
	 
	 
	 double outronumero = Math.cbrt(2);
	 System.out.println(outronumero);
	 sc.close();
	}

}
