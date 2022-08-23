package atividade07;

public class Main {

	public static void main(String[] args) {
		// Pessoa p1 = new Pessoa(); - Classes abstratas não podem ser instanciadas
		Visitante v1 = new Visitante(); // Herança de implementação (herança sem especialização)
		/*v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());*/
		Aluno a1 = new Aluno(); // Herança para diferença(herança com especialização)
		a1.setNome("Claudio");
		a1.setMatricula(1223);
		a1.setCurso("Informatica");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		Bolsista b1 = new Bolsista();
		b1.setMatricula(3322);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
	}

}
