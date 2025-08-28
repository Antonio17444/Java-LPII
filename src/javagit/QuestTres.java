package javagit;
import java.util.Scanner;

public class QuestTres {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma string:");
		String str1 = sc.nextLine();
		System.out.println("Inform uma segunda string:");
		String str2 = sc.nextLine();
		if (str1.equals(str2)) {
			System.out.println("São iguais!");
		}
		else {
			System.out.println(str1+str2);
		}
		sc.close();
	}
}
