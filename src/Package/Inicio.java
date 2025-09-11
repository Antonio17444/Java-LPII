package Package;

public class Inicio {
    public static void main(String[] args) {

        ContaDois contaCorrente = new ContaDois("João", 500);
        ContaDois contaPoupanca = new ContaDois("Maria", 1000);

        System.out.println("=== Conta Corrente ===");
        contaCorrente.depositar(200);
        contaCorrente.sacar(100);
        contaCorrente.exibirDados();

        System.out.println("\n=== Conta Poupança ===");
        contaPoupanca.depositar(500);
        contaPoupanca.sacar(1200);
        contaPoupanca.exibirDados();
    }
}
