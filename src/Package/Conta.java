package Package;

public class Conta {
	
	private double saldo;
	
	public Conta(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Deposito de "+ valor +" Realizado.");
	}
	
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de "+ valor +" realizado.");
			
		} else {
			System.out.println("Saldo insuficiente.");
		}
		
	}
	
	public void exibirSaldo() {
		System.out.println("Saldo atual: $"+ saldo);
	}
	
}
