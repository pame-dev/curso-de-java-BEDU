public class Pasajero {
    String nombre;
    String pasaporte;

    // Metodos
    public Pasajero(String nombre, String pasaporte){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    // Creamos los getter
    public String getNombre(){
        return nombre;
    }

    public String getPasaporte(){
        return pasaporte;
    }

}


