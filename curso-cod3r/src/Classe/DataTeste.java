package Classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		var d2 = new Data(12, 8, 2001);
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
	}
}
