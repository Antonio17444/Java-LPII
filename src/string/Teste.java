package string;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		String texto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma String: ");
		texto = sc.nextLine();
		boolean comecaUE = false;
		if (texto.length() >= 2) {
			char l1 = texto.charAt(0);
			char l2 = texto.charAt(1);

			if ((l1 == 'U' || l1 == 'u') && (l2 == 'E' || l2 == 'e')) {
					comecaUE = true;
			}
		}
		
		if(comecaUE) {
			System.out.println("Começa com UE");
		} else {
			System.out.println("Não começa com UE");
		}
		
	}
}
