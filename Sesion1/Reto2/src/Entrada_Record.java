// Crear Constructor con record: hace los getters y el codigo mas corto
public record Entrada_Record(String nombreEvento, double precio){
    public void mostrarInformacion(){
        System.out.println("Nombre del evento: " + nombreEvento + " y " + "Precio: $" + precio);
    }
}

