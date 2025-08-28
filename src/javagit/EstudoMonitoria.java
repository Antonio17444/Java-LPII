package javagit;
import java.util.Scanner;

public class EstudoMonitoria {
		public static void main(String[] args) {
			Scanner memoria = new Scanner(System.in);
			System.out.println("informe um num inteiro: ");
			int inteiro = memoria.nextInt();
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d + %d = %d\n", inteiro, i, (inteiro + i));
			}
		
		memoria.close();	
		
	}
}
