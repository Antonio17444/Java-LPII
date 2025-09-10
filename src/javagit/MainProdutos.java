package javagit;

public class MainProdutos {
	public static void main(String[] args) {
		
		Produtos produto1 = new Produtos();
		Produtos produto2 = new Produtos();
		
		produto1.cadastrarProduto();
		produto2.cadastrarProduto();
		
		produto1.exibirProduto();
		produto2.exibirProduto();
		
	}
}
