package Package;

public class Main {
	
	public static void main(String[] args) {
		
	
	
		Conta contaPoupanca = new Conta(500.0);
		Conta contaCorrente = new Conta(1000.0);
			
		contaCorrente.depositar(200);
		contaCorrente.sacar(300);
		contaCorrente.exibirSaldo();
		
		contaPoupanca.sacar(200);
		contaPoupanca.exibirSaldo();
		
	}
	
}
