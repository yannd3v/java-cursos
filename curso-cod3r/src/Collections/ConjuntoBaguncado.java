package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('z');
		
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('z');
		System.out.println("Tamanho é :" + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('z'));
		
		System.out.println("Tamanho é : " + conjunto.size());
		
		System.out.println(conjunto.contains('z'));
		System.out.println(1);
		System.out.println(false);
		
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums); // Interseção entre dois conjuntos
		System.out.println(conjunto);
		
		//conjunto.clear(); // Limpar os dados
		
		//System.out.println(conjunto);
	}
}
