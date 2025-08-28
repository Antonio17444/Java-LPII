package javagit;
import java.util.Scanner;

public class MainEstudo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num1 = entrada.nextInt();
		System.out.println("Informe um segundo número: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Soma: " + (num1+num2));
		System.out.println("Subtração: " + (num1-num2));
		System.out.println("Multiplicação: " + (num1*num2));
		System.out.println("Divisão: " + (num1 / num2));
		
		entrada.close();
		
	}

}
