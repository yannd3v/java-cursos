package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
	
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Príncipe"); // retorna boolean
		livros.push("Don Quixote"); // lança uma exceção
		livros.push("O Hobbit");
		
		System.out.println("**** Obtendo o próximo da pilha (sem remover) ****");
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println("**** Listando a pilha ****");
		for (String livro : livros) {
			System.out.println(livro);
		}
		
		System.out.println("**** Obtendo o próximo da pilha (removendo) ****");
		System.out.println(livros.pop()); // lança exceção
		System.out.println(livros.poll()); // retorna nulo
		System.out.println(livros.remove()); // lança exceção
		System.out.println(livros.poll());
		
		// livros.size();
		// livros.clear();
		// livros.contains();
		// livros isEmpty();
		

		
	}

}
