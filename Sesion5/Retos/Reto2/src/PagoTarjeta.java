public class PagoTarjeta extends MetodoPago implements Autenticable{
    double saldoDisponible;

    public PagoTarjeta(double monto, double saldoDisponible){
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    //    CADA CLASE DENE SOBRESCRIBIR PROCESAR PAGO Y AUTENTICAR
    @Override
    public boolean autenticar(){
        return Monto <= saldoDisponible;
    }

    @Override
    public void procesarPago(){
        System.out.println("💳 Procesando pago con tarjeta por $" + Monto);
    }

}
