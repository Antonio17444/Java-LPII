package praticando;

import java.util.Scanner;

// Crie uma função que receba três notas de um aluno (em float) como parâmetro e uma letra. Se a
// letra for “A”, a função deve calcular a média aritmética das notas do aluno; se a letra for “P”, deverá
// calcular a média ponderada, com pesos 5, 3 e 2. Retorne a média calculada para o programa principal.



public class NotasAluno {
	
	public static float media(float nota1, float nota2, float nota3, String letra) {
		
		float mediaAritmetica = ((nota1)+(nota2)+(nota3))/3;
		float mediaPonderada = ((nota1*5)+(nota2*3)+(nota3*2))/10;
		
		if (letra.equalsIgnoreCase("A")) {
				return mediaAritmetica;
		} else if (letra.equalsIgnoreCase("B")) {
			return mediaPonderada;
		} else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, nota3;
		String letra;
		
		System.out.println("Informe a sua primeira nota:");
		nota1 = sc.nextFloat();
		System.out.println("Informe a segunda nota:");
		nota2 = sc.nextFloat();
		System.out.println("Informe a terceira nota:");
		nota3 = sc.nextFloat();
		sc.nextLine();
		System.out.println("Informe (A) para calcular a média aritmética\nInforme (P) para calcular a Média Ponderada");
		letra = sc.nextLine();
		float resultado = media(nota1, nota2, nota3, letra);
		
		if (resultado != -1) {
			System.out.println("Média calculada: " + resultado);
		} else {
			System.out.println("Opção inválida!");
		}
		sc.close();
	}
	
}


