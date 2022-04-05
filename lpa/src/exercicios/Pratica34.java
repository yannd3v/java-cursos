package exercicios;

import java.util.Scanner;

public class Pratica34 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner i = new Scanner(System.in);
		imprimir("Informe o indice para obter o nome: ");
		int indice = i.nextInt();
		imprimir(obterNomePeloIndice(indice, obterNomes(6)));
		imprimir("Informe o nome para obter o indice: ");
		String nome = i.next();
		imprimir(obterIndicePeloNome(nome, obterNomes(6)));
		
	}
	
	public static String[] obterNomes(int tam) {
		String[] alunos = new String[tam];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		imprimir("Preencha o nome de 6 alunos");
		for (int i = 0; i < tam; i++) {
			alunos[i] = sc.nextLine();
		}
		return alunos;
	}
	
	public static String obterNomePeloIndice(int indice, String[] nomes) {
		return nomes[indice];
	}
	
	public static int obterIndicePeloNome(String nome, String[] vet) {
		int i = 0;
		for (;!nome.equalsIgnoreCase(vet[i]); i++) {
		  
		}
		return i;
	}
	
	public static void imprimir(String s) {
		System.out.println(s);
	}
	
	public static void imprimir(int n) {
		System.out.println(n);
	}
	
	public static void imprimir(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");
		}
	}
}
