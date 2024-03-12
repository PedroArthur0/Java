public class Main {
    public static void main(String[] args) {
        int valorCarro = 100_000 ;
        if (valorCarro > 100_000)
            System.out.println("Não comprar. Acima da tabela.");
        else if (valorCarro >= 90_000 && valorCarro <=100_000)
            System.out.println("Comprar o carro");
        else
            System.out.println("Não comprar. Valor abaixo da tabela.");
    }
}