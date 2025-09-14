package string;
import java.util.Scanner;

public class Quest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma string: ");
		String texto = sc.nextLine();
		System.out.println("Numero de caractes: "+texto.length());
		System.out.println("Maisculas: "+texto.toUpperCase());
		System.out.println("Minusculas: "+texto.toLowerCase());
		System.out.println("Primeiro caracter: " + texto.charAt(0));
		System.out.println("Último caracter: " + texto.charAt(texto.length() - 1));
		System.out.println("Informe outra String para comparação: ");
		String texto2 = sc.nextLine();
		if (texto.equalsIgnoreCase(texto2)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		System.out.println("String juntas: "+texto.concat(texto2));
		System.out.println("Inicio da String: "+texto.subSequence(0, 5));
		
	}
}
