package Package;

public class Carro {

    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String tipoCombustivel;
    private boolean ligado;

    public Carro(String marca, String modelo, int anoFabricacao, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.tipoCombustivel = tipoCombustivel;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(modelo + " está ligado!");
        } else {
            System.out.println(modelo + " já está ligado!");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(modelo + " foi desligado!");
        } else {
            System.out.println(modelo + " já está desligado!");
        }
    }

    public void frear() {
        if (ligado) {
            System.out.println(modelo + " está freando...");
        } else {
            System.out.println("Não é possível frear. O carro está desligado!");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
}
