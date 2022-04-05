package jogos;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {
	public static void Iniciar() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		char[] arrayPalavraOculta; 
		int chances = 6; 
		System.out.println("Digite a palavra oculta para começar:");
		String palavra = scanner.next().toLowerCase(); 
		arrayPalavraOculta = palavra.toCharArray(); 
		char[] ListaLetras =new char[arrayPalavraOculta.length]; 

		while (true){ 

			if(Arrays.equals(arrayPalavraOculta,ListaLetras)){ 
				System.out.println("\n\n");
				System.out.println("Voce ganhou!!!!!!!!!");
				break;
			}

			System.out.println("\nDigite uma letra");
			char letra = scanner.next().toLowerCase().charAt(0);

			boolean tem =false;
			for (char p: arrayPalavraOculta ) { 
				if(p == letra){ 
					tem =true;
					break;
				}
			}
			if(tem){
				int valor2 = 0;
				for (char iten:arrayPalavraOculta ) { 
					if(letra == iten) ListaLetras[valor2]=letra; 
					valor2++;
				}
				ImprimirPalavra(ListaLetras);
			}
			else{
				System.out.println("A palavra não possui a letra:"+letra);
				chances--; 

				if(chances == 0){ 
					ConstruirCorpo(chances, ListaLetras);
					System.out.println("Voce perdeu!!!!!");
					System.out.println("A palavra era: "+palavra);
					break;
				}
				else ConstruirCorpo(chances, ListaLetras); 

			}
		}
	}

	public static void ConstruirCorpo(int numero, char[] ListaLetras) {
		System.out.print("____");
		System.out.println("\n|      |");
		switch (numero){
		case 5: System.out.println("|      O"); break;
		case 4:        System.out.println("|      O\n|     /"); break;
		case 3:        System.out.println("|      O\n|     /|");break;
		case 2:        System.out.println("|      O\n|     /|"+"\\");break;
		case 1:        System.out.println("|      O\n|     /|\\"+"\n|     /");break;
		case 0:        System.out.println("|      O\n|     /|\\"+"\n|     / \\");break;
		}
		for (int i = 0; i <= 20; i+=5) {
			System.out.println("|");
		}
		ImprimirPalavra(ListaLetras);

	}

	public static void ImprimirPalavra(char[] ListaLetras){
		System.out.print("|| ");
		for (char iten:ListaLetras ) {
			System.out.print(iten + " ");
		}
		System.out.print(" ||\n");
	}
}
