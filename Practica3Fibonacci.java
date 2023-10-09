import java.util.Scanner;

public class Practica3Fibonacci {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de numeros de la serie que desea ver: ");
        int n = scanner.nextInt();

        int num1 = 0, num2 = 1;
        System.out.println("La serie de " + n + " numeros es de :");

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        scanner.close();
    }
}