package praticando;
import java.util.Scanner;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void depositar(double valor) {
		if (valor < 0) {
			System.out.println("Erro: Valor negativo");
		} else {
			saldo += valor;
			System.out.println("Valor de "+valor+" depositado com sucesso!\n");
		}
	}
	
	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Erro: valor de saque maior que o saldo...");
		} else {
			saldo -= valor;
			System.out.println("Valor de "+valor+" sacado com sucesso");
		}
	}
	
	public void exibirDados() {
		System.out.println("\n====== Dados da Conta ======");
		System.out.println("Titular: "+ getTitular());
		System.out.println("Saldo: R$ "+ getSaldo());
		
	}
	
	
	
	public void preencherDados() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do titular: ");
		setTitular(sc.nextLine());
		
		System.out.println("Informe o valor de deposito inicial: ");
		double deposito = sc.nextDouble();
		depositar(deposito);
		
		System.out.println("Informe o valor de saque: ");
		double saque = sc.nextDouble();
		sacar(saque);
		
	}
	
}

