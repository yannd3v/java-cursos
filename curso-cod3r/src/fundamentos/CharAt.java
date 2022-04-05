package fundamentos;

import java.util.Scanner;

public class CharAt {

	public static void main(String[] args) {
		Scanner opcao = new Scanner(System.in);
		System.out.println("Opcoes: \n(a)algo \n(b)algo \n(c)algo \n(d)algo");
		char opcoes = opcao.next().charAt(0);
		System.out.println(opcoes);
		opcao.close();

	}

}
