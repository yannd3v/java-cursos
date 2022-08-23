package Collections;

import java.util.HashSet;
//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		
//		Set<String> listaAprovados = new HashSet<>();
		Set<String> listaAprovados = new TreeSet<>(); // "TreeSet" garante ordem de inserção
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(120);
		nums.add(6);
		
		//nums.get(3) // não é possivel acessar pelo indice
		
		for (Integer n : nums) {
			System.out.println(n);
		}
	}
	
	
}
