package praticando;
import java.util.Scanner;

public class StringUm {
	
	public static int funcao(int num) {
		if (num % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		int num = sc.nextInt();
		System.out.println(funcao(num));
		sc.close();
	}
}
