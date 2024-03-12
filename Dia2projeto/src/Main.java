import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        System.out.println("Array original 1: " + Arrays.toString(my_array1)); // imprime o original
        Arrays.sort(my_array1); // Ordena o array original
        System.out.println("Array organizado 1: " + Arrays.toString(my_array1)); // Imprime o array ordenado

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"};
        System.out.println("Array original 2: " + Arrays.toString(my_array2)); // Imprime o original
        Arrays.sort(my_array2); // Ordena o array original
        System.out.println("Array organizado 2: " + Arrays.toString(my_array2)); // Imprime o array ordenado
    }
}
