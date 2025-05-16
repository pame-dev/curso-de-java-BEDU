public class Entrada {
    //    DECLARACION DE ATRIBUTOS
    String nombreEvento;
    Double precio;

    //    CREAR EL CONSTRUCTOR
    public Entrada(String nombreEvento, double precio){
        this.nombreEvento = nombreEvento;
        this.precio = precio;
    }

    //        Método que muestre la informacion del producto
    public void mostrarInformacion(){
        System.out.println("Nombre del evento: " + nombreEvento + " y " + "Precio: $" + precio);
    }



}