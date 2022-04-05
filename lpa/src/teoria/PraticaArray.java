package teoria;

public class PraticaArray {

	public static void main(String[] args) {
		imprimir(obterIdades());
		imprimir("");
		imprimir(obterNomes());
		imprimir("");
		imprimir(obterMatriculas());
	}
	
	public static int[] obterIdades() {
		int[] idades = new int[5];
		idades[1] = 19;
		idades[3] = 21;
		idades[0] = 23;
		idades[2] = 18;
		idades[4] = 20;
		return idades;
	}
	
	public static String[] obterNomes() {
		String[] nomes = new String[5];
		nomes[0] = "João";
		nomes[1] = "Maria";
		nomes[2] = "Jose";
		nomes[3] = "Simone";
		nomes[4] = "Rosa";
		return nomes;
	}
	
	public static String[] obterMatriculas() {
		String[] matriculas = new String[5];
		matriculas[0] = "4844845";
		matriculas[1] = "401020";
		matriculas[2] = "343434";
		matriculas[3] = "121212";
		matriculas[4] = "656565";
		return matriculas;
	}
	
	public static void imprimir(String s) {
		System.out.println(s);
	}
	
	public static void imprimir(int[] v) {
		System.out.println(v[0] + " " + v[1]);
	}
	
	public static void imprimir(String[] v) {
		for (int i = 0; i < v.length; i++) { // "Length" significa pra repetir o máximo de vezes possíveis do conjunto do vetor
			System.out.print(v[i] + " ");
		}
	}
}
