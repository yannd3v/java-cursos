package fundamentos.exercicios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner salario = new Scanner(System.in);
		
		System.out.println("Digite os 3 ultimos salarios: ");
		Double salario1 = Double.parseDouble(salario.nextLine().replace(",", "."));
		Double salario2 = Double.parseDouble(salario.nextLine().replace(",", "."));
		Double salario3 = Double.parseDouble(salario.nextLine().replace(",", "."));
		
		double media = (salario1 + salario2 + salario3) /3;
		System.out.printf("A media dos salarios é: R$" + media);
		
		salario.close();
		

	}

}
