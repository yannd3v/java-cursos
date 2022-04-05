package atividade03;

public class Desktop {
	private String motherboard;
	private String processador;
	private int armazenamento;
	private int ram;
	private int potencia;
	private  boolean ligado;
	
	public void status() {
		System.out.println("A placa mãe é :" + this.getMotherboard());
		System.out.println("O processador é: " + this.getProcessador());
		System.out.println("Possui " + this.getArmazenamento() + " gb de armazenamento");
		System.out.println("Possui " + this.getRam() + " gb de memória ram");
		System.out.println("Possui " + this.getPotencia() + " W de potência");
		System.out.println("O computador está ligado ?" + this.getLigado());
	}
	
	public Desktop(String motherboard, String processador, int potencia) {
		setProcessador(processador);
		setMotherboard(motherboard);
		setPotencia(potencia);
		desligar();
	}
	
		
	
	public String getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	protected void ligar() {
		this.ligado = true;
	}
	
	protected void desligar() {
		this.ligado = false;
	}
	

	public void jogar() {
		if (this.ligado == true) {
			System.out.println("Bora jogar!");
		} else {
			System.out.println("Não consigo jogar");
		}
	}
	
}
