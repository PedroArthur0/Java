public class Main {
    public static void main(String[] args) {
        System.out.println("Listar os numeros de 0 a 20");
        evenNumbers(20);
    }

        // Realizando o Debug ele aponta que o I começa em 6, sendo que deveria começar em 0
    public static void evenNumbers(int numbers) {
        for (int i = 0; i <= numbers; i ++)
            if (i % 2 == 0)
                System.out.print(i + " ");
    }
}