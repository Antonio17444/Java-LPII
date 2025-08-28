package javagit;
import java.util.Scanner;

public class Contagem {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int num = entrada.nextInt();
		
		System.out.println("Tabuada de Soma: ");
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d + %d = %d\n", num, i, (num+i));
		}
		
		System.out.println("\nTabuada de Subtração:");
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d - %d = %d\n", num, i, (num-i));
		}
		
		
		
		entrada.close();
	}
}
