import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanear para receber a palavra
        Scanner scanner = new Scanner(System.in);

        // Exibir a palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Usando a função.length para obter o tamanho
        // Usando o .charAt para obter a localização de cada caractere escrito
        for (int i = 0; i < palavra.length(); i ++){
            System.out.print(palavra.charAt(i) + " ");
        }
    }
}