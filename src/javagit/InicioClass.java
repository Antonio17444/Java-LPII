package javagit;
import java.util.Scanner;

public class InicioClass {
	
	static class Pessoa {
		String nome;
		int idade;
		float altura;
	}
	
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Pessoa[] pessoa = new Pessoa[3];
		for(int i = 0; i<pessoa.length; i++) {
			pessoa[i] = new Pessoa();
			System.out.println("Informe o nome da pessoa:");
			pessoa[i].nome = str.nextLine();
			System.out.println("Informe a idade da pessoa:");
			pessoa[i].idade = sc.nextInt();
			System.out.println("Informe a altura da pessoa:");
			pessoa[i].altura = sc.nextFloat();
		}
		for (int i = 0; i<pessoa.length;i++) {
			System.out.println("\nNome: "+pessoa[i].nome);
			System.out.println("idade: "+pessoa[i].idade);
			System.out.println("Altura: "+pessoa[i].altura);
			System.out.println("\n===============================");
		}
		sc.close();
		str.close();
	}
}


