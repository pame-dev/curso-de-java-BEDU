import java.util.Objects;

public class CuentaFiscal {
    private final String rfc;
    private double saldoDisponible;

//    Constructor con validación para que el saldo no sea negativo
    public CuentaFiscal(String rfc, double saldoDisponible){
        if (saldoDisponible < 0){
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }
        this.rfc = rfc;
        this.saldoDisponible = saldoDisponible;
    }

//    Getters para ambos atributos
    public String getRfc(){
        return rfc;
    }

    public double getSaldoDisponible(){
        return saldoDisponible;
    }


//    Método validarRFC(DeclaracionImpuestos d) que compare el RFC
//    de la cuenta con el de la declaración, usando Objects.equals()
    public boolean validarRFC(DeclaracionImpuestos d){
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }
}
