import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
//        Solicitar los datos al usuario
        System.out.print("Introduzca los siguientes datos: ");

        System.out.print("Introduce el nombre del medicamento: ");
        var nombreMedicamento = scanner.nextLine();

        System.out.print("Introduce el precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Introduce la cantidad de piezas: ");
        int cantidadPiezas = scanner.nextInt();

//         Calculo total sin descuento
        double total = (precioUnitario * cantidadPiezas);

//        Si el total > a 500 la farmacia ofrece un 15% de descuento
//        Descuento si el total supera los $500
        boolean aplicaDescuento = total > 500;

        double descuento = aplicaDescuento ? total * 0.15 : 0;

//        Calculo final
        double totalFinal = total - descuento;

//        SALIDA DE DATOS
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Cantidad: " + cantidadPiezas);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Total sin descuento: " + total);
        System.out.println("¿Aplica descuento? : " + aplicaDescuento);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + totalFinal);

        scanner.close();


    }
}
