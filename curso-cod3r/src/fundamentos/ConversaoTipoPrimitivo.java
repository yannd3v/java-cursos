package fundamentos;

public class ConversaoTipoPrimitivo {

	public static void main(String[] args) {
		
		double a = 1; // conversao implicita (nao tem perda de informaçao)
		System.out.println(a);
		
		float b = (float) 1.123456788888; // conversao explicita (CAST tem perda de informacao)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // conversao explicita (CAST)
		System.out.println(d);
		
		double e = 1.999999999;
		int f = (int) e; // conversao explicita (CAST)
		System.out.println(f);
	}

}
