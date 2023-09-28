import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0; // Saldo inicial

        if(true) {
            System.out.println("Bienvenido al Cajero Automatico:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.print("Seleccione una opcion: ");
            
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Deposito exitoso. Su saldo actual es: $" + saldo);
                    } else {
                        System.out.println("Cantidad no valida. Por favor, ingrese una cantidad positiva.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Su saldo actual es: $" + saldo);
                    } else {
                        System.out.println("Cantidad no valida o saldo insuficiente.");
                    }
                    break;
                    
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
                    scanner.close();
            }
        }
    }
}
