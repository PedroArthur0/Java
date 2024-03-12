public class Car {
    private String marca;
    private String modelo;
    private int ano;
    private int valor;

    // Construtor
    public Car(String marca, String modelo, int ano, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    // Método para calcular o valor final
    public double valorVenda() {
        double valorFinal = (valor * 0.1) + valor;
        return valorFinal;
    }

    // Métodos getter
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
