//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Creación de objetos
        Pasajero p1 = new Pasajero("Luis Eduardo Aguilar Mosqueda", "RSSDJFI2");
        Vuelo v1 = new Vuelo("UXJSO1", "Japón", "07:00");

        // Reservar asiento
        boolean reservaExitosa = v1.reservaAsiento(p1);
        System.out.println(" Reserva exitosa ");

        // Mostrar itinerario
        System.out.println("\n Itinerario:");
        System.out.println(v1.obtenerItinerario());

        // Cancelar reserva
        v1.cancelarReserva();
        System.out.println("\n Reserva cancelada.");

        // Mostrar itinerario de nuevo
        System.out.println("\n Itinerario del vuelo:");
        System.out.println(v1.obtenerItinerario());

        // Reservar usando nombre y pasaporte
        boolean nuevaReserva = v1.reservaAsiento("Damaris Noemi Moctezuma Chimal", "JPNNS112233");
        

        // Mostrar itinerario final
        System.out.println("\n Itinerario final:");
        System.out.println(v1.obtenerItinerario());
    }
}