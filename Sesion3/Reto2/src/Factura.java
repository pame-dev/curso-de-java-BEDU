import java.util.Optional;

public class Factura {
//    Encapsulación con modificadores de acceso utilizando la clase Optional
//    para manejar valores que puede ser nulos como el RFC del cliente

//    Atributos privados
    private double monto;
    private String descripcion;
    private Optional<String> rfc;


//    Constructor
    public Factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
//        Rfc es null se guarda en Optional.empty
        this.rfc = Optional.ofNullable(rfc);
    }

// Método para obtener el resumen
    public String getResumen() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("Monto: $: ").append(monto).append("\n");
        resumen.append("Descripción: ").append(descripcion).append("\n");
        resumen.append("RFC: ").append(rfc.orElse("[No proporcionado]"));
        return resumen.toString();

    }


}
