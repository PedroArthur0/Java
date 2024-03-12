public class MainCar {
    public static void main(String[] args){

        Car car = new Car("BMW", "X6", 2024);

        // Usando o Setter
        car.setModelo("TR4");
        car.setAno(2018);
        car.setMarca("Pajero");

        System.out.println("Marca: " + car.getMarca());
        System.out.println("Modelo: " + car.getModelo());
        System.out.println("Ano: " + car.getAno());
    }
}
