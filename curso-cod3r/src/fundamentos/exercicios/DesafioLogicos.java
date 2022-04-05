package fundamentos.exercicios;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terca ( V ou F)
		// Trabalho na quinta ( V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean shopping = trabalho1 || trabalho2;
		System.out.println(shopping);
		
		boolean casa = !trabalho1 && !trabalho2;
		System.out.println(casa);
		
		boolean polegada50 = trabalho1 && trabalho2;
		System.out.println(polegada50);
		
		boolean polegada32 = trabalho1 ^ trabalho2;
		System.out.println(polegada32);
		
		boolean sorvete = trabalho1 || trabalho2;
		System.out.println(sorvete);
		
		boolean semsorvete = !trabalho1 && !trabalho2;
		System.out.println(semsorvete);
		
		System.out.println("Comprou TV 50" + "? " + polegada50);
		System.out.println("Comprou TV 32" + "? " + polegada32);
		System.out.println("Comprou sorvete? " + sorvete);
		
	}

}
