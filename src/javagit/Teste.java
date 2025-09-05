package javagit;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma string:");
		String palavra = sc.nextLine();
		System.out.println(palavra);
		sc.close();
	}
}
