package Package;

public class MainCarro {
	public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota", "Corolla", 2022, "Flex");

        PessoaCarro pessoa1 = new PessoaCarro("João", 30, carro1);

        pessoa1.exibirDados();

        pessoa1.dirigir();
        carro1.frear();
        pessoa1.estacionar();
    }
}
