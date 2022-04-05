package jogos;

import java.util.Scanner;

public class JogoDaVelha {
	public static String[][] matriz = {{ "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" }};
	public static String op1 = "";
	public static String op2 = "";

	public static void Iniciar() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int turnos = 0;
		String posicao = "";


		System.out.println("----------------------");
		System.out.println("     JOGO DA VELHA    ");
		System.out.println("----------------------");

		System.out.println("Quem começa, X ou O?");
		op1 = sc.next().toUpperCase();

		if(op1.equalsIgnoreCase("X")){
			op2 = "O";
		}else{
			op2 = "X";
		}

		while(true){ 

			exibirJogo(matriz); 


			System.out.println("Jogador 1, informe uma posição: ");
			posicao =  sc.next();
			while(!validarJogada(posicao, matriz)){ 
				System.err.println("Jogada inválida, tente novamente");
				System.out.println("Jogador 1, informe uma posição: ");
				posicao =  sc.next();
			}
			realizarJogada(posicao, op1);

			turnos++;
			exibirJogo(matriz);

			if(!situacaoAtual(turnos, matriz).equals("")){ 
				break;
			}

			System.out.println("Jogador 2, informe uma posição: ");
			posicao =  sc.next();
			while(!validarJogada(posicao, matriz)){
				System.err.println("Jogada inválida, tente novamente");
				System.out.println("Jogador 2, informe uma posição: ");
				posicao =  sc.next();	                   
			}
			realizarJogada(posicao, op2);


			turnos++;
			exibirJogo(matriz);
			if(!situacaoAtual(turnos, matriz).equals("")){ 
				break;
			}
		}
		exibirJogo(matriz);
		if(turnos == 9){
			System.out.println(situacaoAtual(turnos, matriz));
		}else{
			System.out.println("O " + situacaoAtual(turnos, matriz)+" venceu!");
		}
	}

	public static String situacaoAtual(int turnos , String[][] array){  
		String[] pos = new String[8];

		String ganhador = "";


		pos[0] = array[0][0] + array[0][1] + array[0][2]; 
		pos[1] = array[1][0] + array[1][1] + array[1][2];
		pos[2] = array[2][0] + array[2][1] + array[2][2];

		pos[3] = array[0][0] + array[1][0] + array[2][0];
		pos[4] = array[0][1] + array[1][1] + array[2][1];
		pos[5] = array[0][2] + array[1][2] + array[2][2];

		pos[6] = array[0][0] + array[1][1] + array[2][2];
		pos[7] = array[0][2] + array[1][1] + array[2][0];



		for(int i = 0; i < pos.length; i++){
			if(pos[i].equals("XXX") && op1.equalsIgnoreCase("X")){
				ganhador = "Jogador 1";
			}else if(pos[i].equals("OOO") && op1.equalsIgnoreCase("O")){
				ganhador = "Jogador 1";
			}else if(pos[i].equals("XXX") && op2.equalsIgnoreCase("X")) {
				ganhador = "Jogador 2";
			}else if(pos[i].equals("OOO") && op2.equalsIgnoreCase("O")) {
				ganhador = "Jogador 2";
			}
		}

		if(turnos == 9){
			ganhador="JOGO EMPATADO";
		}
		return ganhador;
	}

	public static void realizarJogada(String pos, String jog){ 
		if(pos.equals("1")){
			matriz[0][0] = jog;
		}else if(pos.equals("2")){
			matriz[0][1] = jog;
		}else if(pos.equals("3")){
			matriz[0][2] = jog;
		}else if(pos.equals("4")){
			matriz[1][0] = jog;
		}else if(pos.equals("5")){
			matriz[1][1] = jog;
		}else if(pos.equals("6")){
			matriz[1][2] = jog;
		}else if(pos.equals("7")){
			matriz[2][0] = jog;
		}else if(pos.equals("8")){
			matriz[2][1] = jog;
		}else if(pos.equals("9")){
			matriz[2][2] = jog;
		}
	}


	public static void exibirJogo(String[][] array) { 
		for (int li = 0; li < 3; li++) {
			System.out.println(" -------------------");
			for (int col = 0; col < 3; col++) {
				System.out.printf(" | " + array[li][col]+ " | ");       
			}
			System.out.println();
		}
		System.out.println();
	}

	public static boolean validarJogada(String pos, String[][] array) { 
		for (int li = 0; li < 3; li++) { 
			for (int col = 0; col < 3; col++) {
				if(array[li][col].equals(pos)){
					return true;
				}
			}
		}
		return false;
	}
}
