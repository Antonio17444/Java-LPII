package javagit;
import java.util.Scanner;

public class QuestUm {
	public static int num(int num) {
		if (num%2 == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int num = sc.nextInt();
		System.out.println(num(num));
		sc.close();
	}
}
