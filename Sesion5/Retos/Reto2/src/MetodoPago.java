// CLASE ABSTRACTA
public abstract class MetodoPago {
    double Monto;

//    Constructor
    public MetodoPago(double monto){
        this.Monto = monto;
    }

//    Método abstracto
    public abstract void procesarPago();

//    Método concreto se puede reutilizar en todas las clases
    public void mostrarResumen(){
        System.out.println();
        System.out.println();
    }


}
