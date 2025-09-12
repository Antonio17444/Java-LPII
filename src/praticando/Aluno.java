package praticando;
import java.util.Scanner;

public class Aluno {
	private int matricula;
	private String nome;
	private float nota1;
	private float nota2;
	private float nota3;
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getNota1() {
		return nota1;
	}
	
	public float getNota2() {
		return nota2;
	}
	
	public float getNota3() {
		return nota3;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNota1(float nota1) {
		if (nota1 >= 0 && nota1 <= 10) {
			this.nota1 = nota1;
		} else {
			System.out.println("Erro: nota negativa");
		}
	}
	
	public void setNota2(float nota2) {
		if (nota2 >= 0 && nota2 <= 10) {
			this.nota2 = nota2;
		} else {
			System.out.println("Erro: nota negativa");
		}
	}
	
	public void setNota3(float nota3) {
		if (nota3 >= 0 && nota3 <= 10) {
			this.nota3 = nota3;
		} else {
			System.out.println("Erro: nota negativa");
		}
	}
	
	public void cadastrarAluno() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a matricula do aluno:");
		setMatricula(sc.nextInt());
		
		sc.nextLine();
		System.out.println("Informe o nome do aluno:");
		setNome(sc.nextLine());
		
		System.out.println("Informe a primeira nota:");
		setNota1(sc.nextFloat());
		
		System.out.println("Informe a segunda nota:");
		setNota2(sc.nextFloat());
		
		System.out.println("Informe a terceira nota:");
		setNota3(sc.nextFloat());
		
	}
	
	public float calcularMedia() {
		float media = (nota1+nota2+nota3)/3;
		return media;
	}
	
	
	
	public void verificarSituacao() {
		if (calcularMedia() >= 7) {
			System.out.println("Situação: O aluno esta aprovado!");
		} else {
			System.out.println("Situação: O aluno esta reprovado");
		}
	}
	
	public void exibirAluno() {
		System.out.println("\n====== Aluno ======");
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Nome: "+ getNome());
		verificarSituacao();
		System.out.println("Media final: "+ calcularMedia());
	}
	
}
