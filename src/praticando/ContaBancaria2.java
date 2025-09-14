package praticando;
import java.util.Scanner;

public class ContaBancaria2 {
	
	private int numConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria2(int numConta, String titular, double saldo) {
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$ "+valor+" realizado com sucesso");
			System.out.println("Saldo atual: R$ "+getSaldo());
		} else {
			System.out.println("Erro: saldo insuficiente!");
		}
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Valor de R$ "+valor+" depositado com sucesso!");
			System.out.println("Saldo atual: R$ "+getSaldo());
		} else {
			System.out.println("Erro: valor inválido");
		}
	}
	
	public void exibirConta() {
		System.out.println("\n====== Conta Bancaria ======");
		System.out.println("Numero da conta: "+ getNumConta());
		System.out.println("Titular da conta: "+ getTitular());
		System.out.println("Saldo final: R$ "+getSaldo());
		
	}
	
}

