package praticando;
import java.util.Scanner;

public class PraticandoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		
		System.out.println("Informe uma String:");
		texto = sc.nextLine();
		
		System.out.print("Número de caracteres da String: "+ texto.length());
		System.out.println("\nImprimindo letra por letra:");
		for (int i = 0; i<texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
		System.out.println("String subdividida: "+texto.substring(0,texto.length()/2));
		System.out.println("Maiuscula: "+texto.toUpperCase());
		System.out.println("Minuscula: "+texto.toLowerCase());
		if (texto.contains("ex")) {
			System.out.println("Começa com tex");
		} else {
			System.out.println("Não começa com tex");
		}
		sc.close();
	}
}
