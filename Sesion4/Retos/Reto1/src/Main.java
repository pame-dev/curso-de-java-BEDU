public class Main {
    public static void main(String[] args) {
//      Creamos dos facturas con el mismo folio pero diferentes clientes o totales
        Factura f1 = new Factura("UIX3840", "Javier Pérez", 2342.23);
        Factura f2 = new Factura("UIX3840", "Comercial XYZ", 1263.34);

// Hash code
        System.out.println(f1);
        System.out.println(f2);

//        Comparar si son iguales con equals
        System.out.println("¿Las facturas son iguales?"+ f1.equals(f2));


    }
}