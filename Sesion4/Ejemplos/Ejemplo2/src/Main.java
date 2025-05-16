public class Main {
    public static void main(String[] args) {

        // Creamos dos tickets con los mismos valores
        TicketSoporte t1 = new TicketSoporte("Error de login", "Accesos", 1);
        TicketSoporte t2 = new TicketSoporte("Error de login", "Accesos", 1);

        // Comparación con equals()
        System.out.println("¿Son iguales? " + t1.equals(t2));  // true

        // Hash codes
        System.out.println("Hash de t1: " + t1.hashCode());
        System.out.println("Hash de t2: " + t2.hashCode());

        // Representación legible del objeto
        System.out.println("Ticket 1:");
        System.out.println(t1);
    }
}