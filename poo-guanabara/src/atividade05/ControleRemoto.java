package atividade05;

public class ControleRemoto implements Controlador{
	//Atributos
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//M�todos especiais
	
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(true);
		this.setTocando(false);
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	// M�todos abstratos

	@Override
	public void ligar() {
		if (!this.getLigado()) {
			this.setLigado(true);
		}
		
	}

	@Override
	public void desligar() {
		if (this.getLigado()) {
			this.setLigado(false);
		}
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("Est� ligado? " + this.getLigado());
		System.out.println("Est� tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.println("|");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
	}

	@Override
	public void menosVolume() {
		if (!this.getLigado()) {
			this.setVolume(this.getVolume() - 1);
		}
		
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if (this.getLigado() && !this.getTocando()) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		
	}
	
	// M�todos abstratos
	
	
	
	
}
