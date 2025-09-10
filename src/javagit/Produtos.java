package javagit;
import java.util.Scanner;

public class Produtos {
	
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
		
		System.out.print("Informe o nome do produto: ");
		setNome(sc.nextLine());
		
		System.out.print("Informe o preço do produto: ");
		setPreco(sc.nextDouble());
		
		System.out.print("Informe a quantidade: ");
		setQuantidade(sc.nextInt());
		
		sc.close();
		
	}
	
	public void exibirProduto() {
		System.out.print("\n ===== Produto =====\n");
		System.out.print("Nome do produto: "+ nome);
		System.out.print("Preço do produto: "+ preco);
		System.out.println("Quantidade: "+ quantidade);
	}
	
}

