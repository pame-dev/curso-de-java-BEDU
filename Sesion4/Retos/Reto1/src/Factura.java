import java.util.Objects;

public class Factura {
    private String folio;
    private String cliente;
    private double total;

//    Constructor con parametros
    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    //    Método toString()
    @Override
    public String toString(){
        return"📄 Factura {" +
                "Folio='" + folio + '\'' +
                ", cliente='" + cliente + '\'' +
                ", total=$" + total +
                '}';
    }


//    Sobrescribimos equals() para compara contenido
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otro = (Factura) obj;
        return Objects.equals(this.folio, otro.folio);
    }

//    hashCode() compatible con equals()
    @Override
    public int hashCode(){
//        Basado solo en el folio
        return Objects.hash(folio);
    }



}
