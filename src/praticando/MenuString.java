package praticando;
import java.util.Scanner;

public class MenuString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String texto;
		int op;
		
		System.out.println("Informe uma String:");
		texto = sc.nextLine();
		
		do {
			
			System.out.println("\n====== Menu de Opções ======");
			System.out.println(" 1 - Informa o número de caracteres da string.");
			System.out.println(" 2 - Informa a String com todas suas letras em maiúsculo.");
			System.out.println(" 3 - Informa a String com todas suas letras em minúsculo.");
			System.out.println(" 4 - Informa o número de vogais da string.");
			System.out.println(" 5 - Informa Se a String digitada começa com \"UE\"");
			System.out.println(" 6 - Imprimir a String de maneira inversa");
			System.out.println(" 7 - Informe 0 para sair do loop\n");
			System.out.println("Informe a opção escolhida:");
			op = sc.nextInt();
			
			switch (op) {
				
			case 1:
				System.out.println(texto.length());
				break;
			case 2:
				System.out.println(texto.toUpperCase());
				break;
			case 3:
				System.out.println(texto.toLowerCase());
				break;
			case 4:
				String NewString = texto.toLowerCase();
				int contador = 0;
				for (int i = 0; i<texto.length(); i++) {
					if (NewString.charAt(i) == 'a' || NewString.charAt(i) == 'e' || NewString.charAt(i) == 'i' || NewString.charAt(i) == 'o' || NewString.charAt(i) == 'u') {
						contador++;
					}
				}
				System.out.println(contador);
				break;
			case 5:
				if (texto.startsWith("UE")) {
					System.out.println("Começa com UE");
				} else {
					System.out.println("Não começa com UE");
				}
				break;
			case 6:
				String inversa = "";
				for (int i = texto.length()-1; i>=0; i--) {
					inversa += texto.charAt(i);
				}
				System.out.println(inversa);
				break;
			case 7:
				System.out.println("Saindo do programa...");
				op = 0;
				break;
			default:
				System.out.println("Entrada inválida");
			}
		
		} while (op != 0);
	
	}
}

