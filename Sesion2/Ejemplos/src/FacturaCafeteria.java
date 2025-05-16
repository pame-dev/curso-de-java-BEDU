public class FacturaCafeteria {
    public static void main(String[] args) {
//        Precios de cada producto

        double precioCafe = 45.50;
        double precioPastel = 80.00;
        double precioAgua = 20.00;

//        Cantidades

        int cantidadCafe = 2;
        int cantidadPastel = 1;
        int cantidadAgua = 1;

//        Si el cliente decidio agregar otro pastel, se incrementa uno
//        ++ Incremento
        cantidadPastel++;

//        Calculo del total (Con prioridad de operadores)
        double total = (precioCafe * cantidadCafe) + (precioPastel * cantidadPastel) + (precioAgua * cantidadAgua);

//        Descuento si el total supera los $150

        boolean aplicaDescuento = total > 150;

//        Asignación del descuento (10%)
//        ? : operador ternario
//         es una forma abreviada de usar if-else para asignar valores y se puede utilizar de la siguiente manera: (condition) ? expressionTrue :  expressionFalse;
        double descuento = aplicaDescuento ? total * 0.10 : 0;

//        CALCULO FINAL
        double totalFinal = total - descuento;

//        Salida formateada
        System.out.println("Total de la compra: $" + total);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
        
    }
}
