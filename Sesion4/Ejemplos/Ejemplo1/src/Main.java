public class Main {
    public static void main(String[] args) {

        // Constructor por defecto
        TicketSoporte ticket1 = new TicketSoporte();
        System.out.println("\n✅ Ticket creado con constructor por defecto:");
        ticket1.mostrarInfo();

        // Constructor con parámetros
        TicketSoporte ticket2 = new TicketSoporte("Error al iniciar sesión", "Accesos", 1);
        System.out.println("\n✅ Ticket creado con parámetros:");
        ticket2.mostrarInfo();

        // Cerrar ticket y mostrar nuevamente
        ticket2.cerrar();
        ticket2.mostrarInfo();

        // Constructor de copia
        TicketSoporte ticket3 = new TicketSoporte(ticket2);
        System.out.println("\n✅ Ticket copiado desde otro:");
        ticket3.mostrarInfo();

        // Constructor sobrecargado con solo título
        TicketSoporte ticket4 = new TicketSoporte("Consulta sobre facturación");
        System.out.println("\n✅ Ticket con constructor sobrecargado (solo título):");
        ticket4.mostrarInfo();
    }
}