public class Main {
    private final Transicionhistoria transicion;
    private final GestorDialogo gestor;
    private final Logicadecision decision;

    // Inyección de dependencias (DIP)
    public Main(Transicionhistoria transicion, GestorDialogo gestor, Logicadecision decision) {
        this.transicion = transicion;
        this.gestor = gestor;
        this.decision = decision;
    }

    public void iniciarEscena() {
        gestor.mostrarDialogo("Llegas a un claro en el bosque. El sol comienza a ponerse.");
        String eleccion = decision.tomarDecision();
        transicion.siguienteEscena(eleccion);
        gestor.mostrarDialogo("Tu historia continúa...");
    }

    public static void main(String[] args) {
        Transicionhistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        Logicadecision logica = new DecisionBinaria();

        Main juego = new Main(transicion, dialogo, logica);
        juego.iniciarEscena();
    }
}
