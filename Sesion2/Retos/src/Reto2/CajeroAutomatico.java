import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;
        int opcion;

        do {
            System.out.println("Bienvenido al cajero automático \n");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt(); // Ya puede usarse aquí

            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingresa la cantidad a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado. Su saldo actual: $" + saldo);
                    } else {
                        System.out.println("Monto no válido.");
                    }
                    break;

                case 3:
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("No tienes suficiente saldo.");
                    } else if (retiro <= 0) {
                        System.out.println("Monto no válido.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Hasta pronto");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
}
