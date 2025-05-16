public abstract class UnidadEmergencia {
    String nombre;

//    Constructor
    public UnidadEmergencia(String nombre){
        this.nombre = nombre;
    }


    public void activarUnidad(){
        System.out.println("✅ Activando unidad: " + nombre);
    }

    //    Método abstracto
    public abstract void responder();
}
