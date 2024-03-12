public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X5", 2024, 125_000);

        System.out.println("Marca: " + car.getMarca());
        System.out.println("Modelo: " + car.getModelo());
        System.out.println("Ano: " + car.getAno());
        System.out.println("Valor de venda: " + car.valorVenda());
    }
}
