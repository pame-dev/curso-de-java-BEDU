// Subclase ambulancia
public class Ambulancia extends UnidadEmergencia{
    SistemaGPS gps;
    Sirena sirena;
    Operador operador;

//    Constructor
    public Ambulancia(String nombre, String nombreOperador){
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }


    @Override
    public void responder(){
        System.out.println("🚑 Ambulancia en camino al hospital más cercano.");
    }

//    Método iniciarOperacion invocando activarUnidad, localizar, activarSirena etc...
    public void iniciarOperacion(){
//        Heredado
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
//        Implementación propia
        responder();
    }

}
