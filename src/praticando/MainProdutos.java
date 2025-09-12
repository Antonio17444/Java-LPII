package praticando;
import java.util.Scanner;

public class MainProdutos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		
		produto.cadastrarProduto();
		produto.exibirProduto();
		produto.atualizarEstoque(sc);
		produto.exibirProduto();
		
	}
}	
