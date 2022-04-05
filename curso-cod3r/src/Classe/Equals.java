package Classe;

public class Equals {
	public static void main(String[] args) {
		EqualsUsuario u1 = new EqualsUsuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
				
		EqualsUsuario u2 = new EqualsUsuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2); // por padrão é falso
		System.out.println(u1.equals(u2)); // sem implementar o equals, por padrão é igual ao u1 == u2
		System.out.println(u2.equals(u1)); // "" "" "" ""	
		
	}
}
