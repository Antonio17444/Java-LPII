package Package;
import java.util.Scanner;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	public void cadastrarConta() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do titular da conta: ");
		this.titular = sc.nextLine();
		
		System.out.print("Informe o saldo inicial: ");
		double saldoInicial = sc.nextDouble();
		
		if (saldoInicial >= 0) {
			this.saldo = saldoInicial;
		} else {
			System.out.println("Saldo inicial não pode ser negativo. Definido como R$0.00");
            this.saldo = 0;
            
            sc.close();
		}
		
	}
	
	public String getTitular() {
		return titular;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo+=valor;
			System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
		} else {
			System.out.println("Erro: valor do depósito deve ser positivo.");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso!");
		} else {
			System.out.println("Erro: saldo insuficiente ou valor inválido.");
		}
	}
	
	 public void exibirConta() {
	        System.out.println("\n=== Dados da Conta ===");
	        System.out.println("Titular: " + titular);
	        System.out.println("Saldo: R$" + saldo);
	    }
	
}
