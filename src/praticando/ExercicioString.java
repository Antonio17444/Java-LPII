package praticando;
import java.util.Scanner;

//Crie um programa que leia duas strings. Se as strings forem iguais escreva “strings iguais”. Caso
//contrário, concatene as duas strings e imprima a String resultante.

public class ExercicioString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palavra1, palavra2;
		
		System.out.println("Entre com uma String: ");
		palavra1 = sc.nextLine();
		
		System.out.println("Entre com outra String:");
		palavra2 = sc.nextLine();
		
		if (palavra1.equalsIgnoreCase(palavra2)) {
			System.out.println("As Strings são iguais");
		} else {
			System.out.println(palavra1+palavra2);
		}
		sc.close();
	}
}
