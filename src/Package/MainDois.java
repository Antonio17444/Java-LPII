package Package;

public class MainDois {
	
	public static void main(String[] args) {
		
		PessoaDois p1 = new PessoaDois("Henrique", 20, 1.73f);
		PessoaDois p2 = new PessoaDois("Joab", 33, 1.80f);
		PessoaDois p3 = new PessoaDois("Samuel", 13, 1.66f);
		
		p1.mostrarDados();
		p2.mostrarDados();
		p3.mostrarDados();
	}
	
}
