package exercicios;

import java.util.Scanner;

public class Pratica12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, cep, status;
		String nome, rua, bairro, cidade, estado;
		System.out.println("Qual e o seu nome ?");
		nome = sc.nextLine();
		
		System.out.println("Em qual estado que voce mora ?");
		estado = sc.nextLine();
		
		System.out.println("Em qual cidade ?");
		cidade = sc.nextLine();
		
		System.out.println("Qual e o nome da rua ?");
		rua = sc.nextLine();
		
		System.out.println("Qual e o numero da sua casa ?");
		numero = sc.nextInt();
		
		System.out.println("Qual e o seu CEP ?");
		cep = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Qual e o seu bairro ?");
		bairro = sc.nextLine();
		
		System.out.println("O seu status cadastral esta (1) Ativo ou (2) Inativo ?");
		status = sc.nextInt();
		if (status == 1) {
			System.out.println("O seu cadastro esta ativo");
		} else {
			System.out.println("O seu cadastro esta inativo");
		}
		System.out.println("O seu nome e " + nome);
		System.out.println("As suas informacoes sao : " +cidade+ ", " +estado+ ", " +bairro+ ", " +rua+ ", " +numero+ ", " +cep);
		sc.close();
		}
}
