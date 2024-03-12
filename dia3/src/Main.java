import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        // Chamando a função para converter a moeda que será convertida conforme a localização padrão da máquina
        NumberFormat real = NumberFormat.getCurrencyInstance();

        // Criando uma variável para receber este valor
        String produtVaule = real.format(1120.82);

        // Chamando este valor
        System.out.println(produtVaule);

    }
}