package Package;

public class MainTres {
	
	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.cadastrarConta();
		conta.exibirConta();
		
		conta.depositar(0);
		conta.sacar(0);
		conta.exibirConta();
		
	}
}
