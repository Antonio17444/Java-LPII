package javagit;
import java.util.Scanner;

public class QuestDois {
	public static void nota(float nota1, float nota2, float nota3, String letra) {
		if (letra.equalsIgnoreCase("A")) {
			float media = (nota1+nota2+nota3)/3;
			System.out.println("Sua média: "+media);
		}
		else if (letra.equalsIgnoreCase("P")) {
			float mediap = ((nota1*5)+(nota2*3)+(nota3*2))/10;
			System.out.println("Sua média: "+mediap);
		}
		else {
			System.out.println("Informe uma entrada válida!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tipo de media (A ou P):");
		String letra = sc.nextLine();
		System.out.println("Informe sua primeira nota:");
		float nota1 = sc.nextFloat();
		System.out.println("Informe sua segunda nota:");
		float nota2 = sc.nextFloat();
		System.out.println("Informe sua terceira nota:");
		float nota3 = sc.nextFloat();
		nota(nota1,nota2,nota3,letra);
		sc.close();
	}
}

