package atividade04;


public class ContaBancaria {
	private long numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private	boolean status;
	
	public void statusPresent() {
		System.out.println("-------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo " + this.getTipo());
		System.out.println("Dono " + this.getDono());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status " + this.getStatus());
	}
	
	
	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		if (this.tipo.equalsIgnoreCase("cc")) {
			setSaldo(50);
		} else if (this.tipo.equalsIgnoreCase("cp")) {
			setSaldo(150);
		} else {
			System.out.println("Tipo de conta não válido");
		}
	
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Não é possível fechar a conta porque o cliente ainda tem saldo disponível");
		} else if (this.getSaldo() < 0) {
			System.out.println("Não é possível fechar a conta porque o cliente ainda possui débitos");
		} else {
			this.setStatus(false);
		}
	}
	
	public void depositar(double saldo) {
		if (this.getStatus()) { // caso o valor falso !this.getStatus();
			this.setSaldo(this.getSaldo() + saldo);
		} else {
			System.out.println("Você não possui conta");
		}
	}
	
	public void sacar(double saldo) {
		if(this.getStatus()) {
			if (this.getSaldo() >= saldo) {
				this.setSaldo(this.getSaldo() - saldo); 
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Você não possui conta");
		}
	}
	
	public void pagarMensal() {
		double mensalidade = 0;
		if (this.getTipo().equalsIgnoreCase("CC")) {
			mensalidade = 12;
		} else if (this.getTipo().equalsIgnoreCase("CP")) {
			mensalidade = 20;
		} 
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - mensalidade);
		} else {
			System.out.println("Você não possui conta");
		}
	}
	
	public ContaBancaria() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	

	public long getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
