package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(0)); // Ele vai escolher uma letra de acordo com a posicao, ou seja, posicao 0 (zero) é a letra O de Organico
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s.startsWith("Boa")); // A string "Boa tarde" comeca com "Boa" ? Verdadeiro
		System.out.println(s.toLowerCase().startsWith("boa")); // A string "Boa tarde" de forma minuscula comeca com "boa" ? Verdadeiro
		System.out.println(s.toUpperCase().endsWith("TARDE")); // A string "Boa tarde" de forma maiuscula termina com "TARDE" ? Verdadeiro
		System.out.println(s.length()); // A string "Boa tarde" possui quantas letras ? 9 (junto com o espaco)
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Ignora se for letra maiuscula ou minuscula
		System.out.println("Frase qualquer".contains("qual")); // "Frase qualquer" contem "qual" ? Verdadeiro (QUALquer)
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		// ou pode usar de outra maneira mais simples
		System.out.printf("Nome: %s %s", nome, sobrenome); // "%s" serve pra concatenar as strings em ordem, "%d" para numeros inteiros, %f para numeros floats, %2f para numeros double, %b para boleanos, %c para char
		
	}

}
