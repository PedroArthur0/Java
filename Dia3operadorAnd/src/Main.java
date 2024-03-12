public class Main {
    public static void main(String[] args) {
        // priceProduct = $20
        // Comprar Somente entre $10 e $15
        int priceProduct = 20;
        boolean buy = priceProduct >= 10 && priceProduct <= 15;
        System.out.println(buy);
    }
}
