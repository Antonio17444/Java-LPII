package praticando;
import java.util.Scanner;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		if (preco >= 0) {
			this.preco = preco;
		} else {
			System.out.println("Erro: preço inválido");
		}
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void cadastrarProduto() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do produto:");
		setNome(sc.nextLine());
		
		System.out.println("Informe o preço do produto: R$ ");
		setPreco(sc.nextDouble());
		
		System.out.println("Informe a quantidade de produtos no estoque:");
		setQuantidade(sc.nextInt());
		
	}
	
	public void exibirProduto() {
		System.out.println("======== PRODUTOS ========\n");
		System.out.println("Nome do produto: " + getNome());
		System.out.println("Preço do produto: "+ getPreco());
		System.out.println("Quantidade no estoque: "+ getQuantidade());
		
	}
	
	public void atualizarEstoque(Scanner sc) {
		
		System.out.println("\nQuantidade atual: " + getQuantidade());
		System.out.println("Você quer (1) diminuir ou (2) aumentar o estoque?");
		int valor = sc.nextInt();
		
		if (valor == 1) {
			System.out.println("Informe o número a ser removido:");
			int remover = sc.nextInt();
			if (quantidade - remover < 0) {
				System.out.println("Erro: estoque insuficiente!");
			} else {
				quantidade -= remover;
				System.out.println(remover + " removidos do estoque.");
			}
		} else if (valor == 2) {
			System.out.println("Informe o valor para adicionar:");
			int adicionar = sc.nextInt();
			quantidade += adicionar;
			System.out.println(adicionar + " adicionados ao estoque.");
		}
	}
		
}

