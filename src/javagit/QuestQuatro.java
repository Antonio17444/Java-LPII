package javagit;
import java.util.Scanner;

public class QuestQuatro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma string:");
		String palavra = sc.nextLine();
		int op;
		
		do {
			System.out.println("\n----- Menu de Opções -----");
			System.out.println("1 - O número de caracteres da string");
			System.out.println("2 - A String com todas suas letras em maiúsculo");
			System.out.println("3 - A String com todas suas letras em minúsculo.");
			System.out.println("4 - O número de vogais da string");
			System.out.println("5 - Se a String digitada começa com \"UE\"");
			System.out.println("6 - Imprimir a String de maneira inversa");
			System.out.println("0 - Sair do Menu");
			System.out.println("\nInforme sua opção:");
			op = sc.nextInt();
			
			switch (op) {
				
			case 1:
				System.out.println(palavra.length());
				break;
			
			case 2:
				System.out.println(palavra.toUpperCase());
				break;
			
			case 3:
				System.out.println(palavra.toLowerCase());
				break;
			
			case 4:
				int contador = 0;
				palavra = palavra.toLowerCase();
				for(int i = 0; i < palavra.length(); i++) {
					char c = palavra.charAt(i);
					if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
						contador++;
					}
				}
				System.out.println(contador);
				break;
					
			case 5:
				palavra = palavra.toUpperCase();
				if(palavra.charAt(0) == 'U' && palavra.charAt(1) == 'E') {
					System.out.println("Sim, começa com \"UE\"");
				}
				else {
					System.out.println("Não, não começa com \"UE\"");
				}
				break;
			
			case 6:
				String invertida = "";
				for(int i = palavra.length() -1; i >= 0; i--) {
					invertida += palavra.charAt(i);
				}
				System.out.println(invertida);
				break;
				
			case 0:
				System.out.println("Saindo do programa...");
				break;
				
			default:
				System.out.println("Opção inválida! Tente dnv");
				
				}
				
		
		} while (op != 0);

		sc.close();
	}

}
	