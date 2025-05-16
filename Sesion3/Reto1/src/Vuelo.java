public class Vuelo {
//    Atributos
     final String codigoVuelo;
     String destino;
     String horaSalida;
     Pasajero asientoReservado;

//    Contructor

    public Vuelo(String codigoVuelo, String destino, String horaSalida){
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;

    }

//    Reserva
    public boolean reservaAsiento(Pasajero p){
        if (asientoReservado == null){
            asientoReservado = p;
            return true;
        }
        return false;
    }

//    Método sobrecarga

    public boolean reservaAsiento(String nombre, String pasaporte){
        if (asientoReservado == null){
            this.asientoReservado = new Pasajero(nombre, pasaporte);
            return true;
        }
        return false;
    }

//    Eliminar al pasajero
    public void cancelarReserva(){
        this.asientoReservado = null;
    }

//    Muestra la información del cuelo y el pasajero
public String obtenerItinerario() {
    String info = " Código vuelo: " + codigoVuelo +
            "\n Destino: " + destino +
            "\n Hora de salida: " + horaSalida;
    if (asientoReservado != null) {
        info += "\n Pasajero: " + asientoReservado.getNombre() +
                "\n Pasaporte: " + asientoReservado.getPasaporte();
    } else {
        info += "\n Asiento no reservado.";
    }
    return info;
}




}
