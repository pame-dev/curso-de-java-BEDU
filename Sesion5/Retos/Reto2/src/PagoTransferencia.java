public class PagoTransferencia extends MetodoPago implements Autenticable{
    boolean bancoAutorizado;

    public PagoTransferencia(double monto, boolean bancoAutorizado){
        super(monto);
        this.bancoAutorizado = bancoAutorizado;
    }

//    CADA CLASE DENE SOBRESCRIBIR PROCESAR PAGO Y AUTENTICAR
    @Override
    public boolean autenticar(){
        return bancoAutorizado;
    }

    @Override
    public void procesarPago(){
        System.out.println("🏦 Procesando transferencia por $" + Monto);
    }


}
