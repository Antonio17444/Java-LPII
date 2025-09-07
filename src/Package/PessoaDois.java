package Package;

public class PessoaDois {
	
	String nome;
	int idade;
	float altura;
	
	public PessoaDois(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void ehMaiorIdade() {
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: "+ idade);
		ehMaiorIdade();
		System.out.println("Altura: "+ altura +"\n");
	}
	
}

