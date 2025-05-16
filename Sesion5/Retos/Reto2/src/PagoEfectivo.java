public class PagoEfectivo extends MetodoPago implements Autenticable{
    public PagoEfectivo(double monto){
        super(monto);
    }


    //    CADA CLASE DENE SOBRESCRIBIR PROCESAR PAGO Y AUTENTICAR
    //  autenticar siempre retorna un true
    @Override
    public boolean autenticar(){
        return true;
    }

    @Override
    public void procesarPago(){
        System.out.println("💵 Procesando pago en efectivo por $" + Monto);
    }
}
