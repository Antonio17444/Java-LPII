package praticando;

public class MainContaBancaria2 {
	public static void main(String[] args) {
		
		ContaBancaria2 conta = new ContaBancaria2(1234, "Henrique", 700.0);
		
		conta.depositar(200.0);
		conta.sacar(150.0);
		conta.exibirConta();
	}
}
