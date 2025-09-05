package Package;

public class Pessoa {
	String nome;
	int idade;
	float altura;

	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	void exibirDados() {
		System.out.println("Nome: "+ nome + ", Idade: " + idade + ", Altura: " + altura);
	}
	
}
