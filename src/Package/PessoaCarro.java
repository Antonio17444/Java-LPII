package Package;

public class PessoaCarro {
	private String nome;
    private int idade;
    private Carro carro;

    public PessoaCarro(String nome, int idade, Carro carro) {
        this.nome = nome;
        this.idade = idade;
        this.carro = carro;
    }

    public void dirigir() {
        System.out.println(nome + " está dirigindo o carro " + carro.getModelo());
        carro.ligar();
    }

    public void estacionar() {
        System.out.println(nome + " estacionou o carro " + carro.getModelo());
        carro.desligar();
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo() +
                " (" + carro.getAnoFabricacao() + ") - " + carro.getTipoCombustivel());
    }
}
