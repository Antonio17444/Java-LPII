package javagit;
import java.util.Scanner;

public class QuestCinco {
	public static void inverter(String palavra) {
		String palavran = "";
		for(int i = palavra.length()-1; i>=0; i--) {
			palavran += palavra.charAt(i);
		}
		System.out.println(palavran);
	}
	
	public static void main(String[] args) {
		Scanner palavra = new Scanner(System.in);
		System.out.println("informe uma string: ");
		String str = palavra.nextLine();
		inverter(str);
		palavra.close();
	}
}
