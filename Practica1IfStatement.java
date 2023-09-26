import java.util.Scanner;

public class Practica1IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa un numero entero: ");
        
        int numero = scanner.nextInt();

        scanner.close();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
    }
}
