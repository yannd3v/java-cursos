package atividade06;

import java.util.Random;

public class Luta {
	
	private Lutador desafiado; //tipo abstrato de dados
	private Lutador desafiante; //tipo abstrato de dados
	private int rounds;
	private boolean aprovada;
	
	// Metodos
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	public void lutar() {
		if (this.getAprovada()) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			switch (vencedor) {
				case 0: // empate
					System.out.println("Empatou");
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					break;
				case 1: // desafiado ganhou
					System.out.println("Vitória do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: // desafiante ganhou
					System.out.println("Vitória do " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
		} else {
			System.out.println("Luta não pode acontecer");
		}
	}

	// Metodos especiais
	 
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
