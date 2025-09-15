package praticando;
import java.util.Scanner;


public class ClassRevisao {
	
	Scanner sc = new Scanner(System.in);
	private String nome;
	private int matricula;
	private float nota1;
	private float nota2;
	private float nota3;
	
	public String getNome() {
		return nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	/*public float getNota1() {
		return nota1;
	}
	
	public float getNota2() {
		return nota2;
	}
	
	public float getNota3() {
		return nota3;
	}*/
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public float validarNota(float nota) {
		if (nota >= 0 && nota <= 10) {
			return nota;
		} else {
			System.out.println("Erro, a nota precisa estar entre 0 e 10");
			return 0;
		}
	}
	
	public void setNota1(float nota1) {
		this.nota1 = validarNota(nota1);
	}
	
	public void setNota2(float nota2) {
		this.nota2 = validarNota(nota2);
	}
	
	public void setNota3(float nota3) {
		this.nota3 = validarNota(nota3);
	}
	
	public void imprimirMedia() {
		float media = (nota1+nota2+nota3)/3;
		if (media >=7) {
			System.out.println("Situação: Aprovado(a)");
		} else {
			System.out.println("Situação: reprovado(a)");
		}
	}
	
	public void preencherAluno() {
		System.out.println("Informe seu nome: ");
		setNome(sc.nextLine());
		System.out.println();
		System.out.println("informe sua matrícula: ");
		setMatricula(sc.nextInt());
		System.out.println("Informe sua primeira nota: ");
		setNota1(sc.nextFloat());
		System.out.println("Informe sua segunda nota: ");
		setNota2(sc.nextFloat());
		System.out.println("Informe sua terceira nota: ");
		setNota3(sc.nextFloat());
	}
	
	public void exibirAluno() {
		System.out.println("\n====== Dados do Aluno ======");
		System.out.println("Nome: "+getNome());
		System.out.println("Matrícula: "+getMatricula());
		imprimirMedia();
		System.out.println("================================");
		sc.close();
	}

}

