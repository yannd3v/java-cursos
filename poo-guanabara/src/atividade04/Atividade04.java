package atividade04;

public class Atividade04 {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		conta1.setNumConta(2135879232);
		conta1.setDono("Yann");
		conta1.abrirConta("CC");
		conta1.depositar(300);
		conta1.sacar(350);
		conta1.fecharConta();
		
		
		ContaBancaria conta2 = new ContaBancaria();
		conta2.setNumConta(405349242);
		conta2.setDono("Gabriel");
		conta2.abrirConta("CP");
		conta2.depositar(500);
		conta2.sacar(100);
		
		
		conta1.statusPresent();
		conta2.statusPresent();
	}

}
