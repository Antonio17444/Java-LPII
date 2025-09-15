package relacionamento;
import java.util.Scanner;

public class Pessoa {
	
	Scanner sc = new Scanner(System.in);
	
	private String nome;
	private int idade;
	private Endereco endereco;
	
	public Pessoa(String nome, int idade, Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
		} else {
			System.out.println("Entrada inválida");
		}
	}
	
	public void CadastroPessoa() {
		System.out.println("Informe sua idade: ");
		setIdade(sc.nextInt());
		System.out.println("Informe seu nome: ");
		setNome(sc.nextLine());
		System.out.println();
		System.out.println("Informe sua rua: ");
		endereco.setRua(sc.nextLine());
		System.out.println();
		endereco.setCidade(sc.nextLine());
	}
	
	public void exibirCadastro() {
		System.out.println("\n====== Dados de Cadastro ======");
		System.out.println("Nome: "+getNome());
		System.out.println("Idade "+getIdade());
		System.out.println("Rua: "+endereco.getRua());
		System.out.println("Cidade: "+endereco.getCidade());
	}
	
}

