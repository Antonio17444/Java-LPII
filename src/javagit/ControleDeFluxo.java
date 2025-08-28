package javagit;
import java.util.Scanner;

public class ControleDeFluxo {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = entrada.nextInt();
		if (idade<=12) {
			System.out.println("Você é menor de idade (Criança)...");
		}
		else if (idade>12 && idade<=17) {
			System.out.println("Você é adolescente seu caba...");
		}
		else if (idade>= 18 && idade <= 59) {
			System.out.println("Você é adulto e já pode votar...");
		}
		else {
			System.out.println("Você é um idoso...");
		}
		
		entrada.close();
		
	}

}
