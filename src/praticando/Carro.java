package praticando;
import java.util.Scanner;

public class Carro {
	
	private String marca;
	private String modelo;
	private int ano;	
	private double velocidadeAtual;
	
	public String getMarca(){
		return marca;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public int getAno(){
		return ano;
	}

	public double getVelocidadeAtual(){
		return velocidadeAtual;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public void setAno(int ano){
		this.ano = ano;
	}

	public void setVelocidadeAtual(double velocidadeAtual){
		if (velocidadeAtual < 0){
			System.out.println("Erro: velocidade negativa!");
		} else {
			this.velocidadeAtual = velocidadeAtual;
		}

	}

	public void cadastrarCarro(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a marca do Carro:");
		setMarca(sc.nextLine());
		
		System.out.println("Informe o modelo do Carro:");
		setModelo(sc.nextLine());
		
		System.out.println("informe o ano do carro:");
		setAno(sc.nextInt());

		System.out.println("Informe a velocidade atual do carro:");
		setVelocidadeAtual(sc.nextDouble());
	}		
	
	public void acelerar(){
		velocidadeAtual += 10;
		System.out.println("O carro acelerou 10 km/h");
		System.out.println(getVelocidadeAtual() +" Km/h");
	}
	
	public void frear(double valor) {
   		 System.out.println("O carro está freando...");
   		 if (velocidadeAtual - valor < 0) {
        			velocidadeAtual = 0;
   		 } else {
       			 velocidadeAtual -= valor;
   		 }
    		System.out.println("Velocidade atual: " + getVelocidadeAtual() + " Km/h");
	}
	
	public void exibirCarro(){
		System.out.println("Marca: "+ getMarca());
		System.out.println("Modelo: "+ getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Velocidade atual: " + getVelocidadeAtual());
	}

}

