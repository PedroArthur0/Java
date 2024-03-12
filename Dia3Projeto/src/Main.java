import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerNumero = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = lerNumero.nextInt();

        if (num <= 9 && num >= 0)
            System.out.println("Este número tem 1 dígito.");

        else if (num <100 && num >=10)
            System.out.println("Este número tem 2 dígitos.");

        else if (num <1000 && num >= 100)
            System.out.println("Este número tem 3 dígitos.");

        else if (num <10000 && num >=1000)
            System.out.println("Este número tem 4 dígitos.");

        else if (num >=100000)
            System.out.println("Este número tem 5 dígitos ou mais.");

        System.out.print(lerNumero);
        }
    }
