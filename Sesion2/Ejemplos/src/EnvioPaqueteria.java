import java.util.Scanner;

public class EnvioPaqueteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tipo de paquete (pequeño, mediano, grande): ");
        String tipo = scanner.nextLine();

        double costo = 0;

        // Condicional con if-else
        if (tipo.equalsIgnoreCase("pequeño")) {
            costo = 49.99;
        } else if (tipo.equalsIgnoreCase("mediano")) {
            costo = 89.99;
        } else if (tipo.equalsIgnoreCase("grande")) {
            costo = 149.99;
        } else {
            System.out.println("Tipo de paquete no válido.");
        }

        if (costo > 0) {
            System.out.println("Costo del envío: $" + costo);
        }

        scanner.close();
    }
}