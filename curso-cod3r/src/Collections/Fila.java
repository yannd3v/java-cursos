package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add --> adicionam elementos na fila
		// A diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana"); // retorna falso
		fila.offer("Bia"); // lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element --> obter o próximo elemento da fila(sem remover)
		// A diferença é o comportamento quando a fila está vazia!
		
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção
		System.out.println(fila.element());
		
		
		// Pool e Remove -> obter o próximo elemento da fila e remove
		// Diferença é o comportamento quando a fila está vazia!
		
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		// fila.size();
	    // fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
	
	}

}
