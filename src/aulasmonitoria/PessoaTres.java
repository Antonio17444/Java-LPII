package aulasmonitoria;

public class PessoaTres {
	
	int idade;
	String nome;
	float altura;
	
	public PessoaTres(int idade, String nome, float altura) {
		this.idade = idade;
		this.nome = nome;
		this.altura = altura;
	}
	
	public void mostrarDados() {
		
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: "+ idade);
		System.out.println("Altura: "+ altura);
		
	}
	
	public void ehMaiorIdade() {
		if (idade < 18) {
			System.out.println("É menor de idade");
		}
		else {
			System.out.println("É maior de idade\n");
		}
		
	}
	
}

