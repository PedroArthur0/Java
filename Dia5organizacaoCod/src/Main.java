public class Main {
    public static void main(String[] args) {
        productList("Banana", 17.50);
        productList("Laranja", 12.20);
    }

    public static void productList(String productName, Double productValue) {
        System.out.println(productName + " - " + productValue);
    }
}
