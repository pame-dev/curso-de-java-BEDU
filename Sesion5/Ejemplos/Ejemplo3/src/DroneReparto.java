public class DroneReparto extends Drone implements Entrega {

    public DroneReparto(String id) {
        super(id);
    }

    @Override
    public void ejecutarMision() {
        System.out.println("📦 Drone " + id + " iniciando misión de entrega.");
        entregarPaquete("Zona 5B");
    }

    @Override
    public void entregarPaquete(String destino) {
        System.out.println("📍 Entregando paquete en: " + destino);
    }
}