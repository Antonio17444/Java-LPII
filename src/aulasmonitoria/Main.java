package aulasmonitoria;

public class Main {
	
	public static void main(String[] args) {
		
		PessoaTres p1 = new PessoaTres(20, "Henrique", 1.80f);
		PessoaTres p2 = new PessoaTres(22, "Joab", 1.70f);
		PessoaTres p3 = new PessoaTres(16, "Ian", 1.74f);
		
		p1.mostrarDados();
		p1.ehMaiorIdade();
		p2.mostrarDados();
		p2.ehMaiorIdade();
		p3.mostrarDados();
		p3.ehMaiorIdade();
		
	}
}
