import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Optional<String> rfc = Optional.empty();

//        Crear 2 facturas una con RFC y la otra sin RFC
        Factura f1 = new Factura(2300.38, "Servicio de consultoría", "MOCD011030MDFCHMA6");
        Factura f2 = new Factura(4300.99, "Reparación de equipo", null);

//        Mostramos el resumen
        System.out.println(f1.getResumen());
        System.out.println();
        System.out.println(f2.getResumen());
    }

}