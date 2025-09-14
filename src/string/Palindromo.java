package string;

public class Palindromo {
	public static void main(String[] args) {
		
		String texto = "aabbaa";
		String invertida = "";
		for(int i = texto.length()-1; i>=0; i--) {
			invertida += texto.charAt(i);
		}
		
		if(texto.equalsIgnoreCase(invertida)) {
			System.out.println("É um palindromo");
		} else {
			System.out.println("Não é um palindromo");
		}
		
	}
}
