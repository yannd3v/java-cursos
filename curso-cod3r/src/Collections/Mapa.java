package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto"); // o metodo put serve para adicionar ou alterar o valor de uma chave
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // mostra as chaves que contem no conjunto
		System.out.println(usuarios.values()); // mostra os valores que contem no conjunto
		System.out.println(usuarios.entrySet()); // mostra os valores e chaves referentes a cada objeto do conjunto
		
		System.out.println(usuarios.containsKey(20)); // retorna um boolean se contem ou não a chave
		System.out.println(usuarios.containsValue("Rebeca")); // retorna um boolean se contem ou nao o valor
		
		System.out.println(usuarios.get(4)); // obtem o objeto pelo indice(chave)
		System.out.println(usuarios.remove(1)); // remover o objeto pela chave
		System.out.println(usuarios.remove(4, "Gui")); // remover o objeto por chave e valor
		
		for(int chave: usuarios.keySet()) { // percorrer as chaves do conjunto
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) { // percorrer os valores do conjunto
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) { // percorrer valores e chaves referentes a cada objeto do conjunto
			System.out.println(registro);
		}
	}

}
