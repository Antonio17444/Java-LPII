package praticando;
import java.util.Scanner;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void cadastrarPessoa() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		setNome(sc.nextLine());
		
		System.out.println("Informe sua idade:");
		setIdade(sc.nextInt());
		
		System.out.println("Informe a sua altura:");
		setAltura(sc.nextDouble());
		
	}
	
	public void exibirPessoa() {
		
		System.out.println("\n====== Dados Pessoa ======");
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Altura: "+getAltura());
		System.out.println("\n");

	}
	
}
