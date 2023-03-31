package posnet;
/**
 * Se refiere a una tarjeta de credito conteniendo sus atributos
 * @author Acoydan [acoexo]
 * @see Titular
 */
public class TarjetaDeCredito extends Titular {
    /**
     * Se refiere al saldo que tiene la tarjeta de credito
     */
    public static double saldo;
    private final EntidadFinanciera entidadFinanciera;
    private final String entidadBancaria;
    private final String numeroTarjeta;
    private final String datosTitular;
    /**
     * @param entidadFinanciera
     * @param entidadBancaria
     * @param numeroTarjeta
     * @param saldo
     * @param datosTitular 
     */
    public TarjetaDeCredito(EntidadFinanciera entidadFinanciera, String entidadBancaria, String numeroTarjeta, double saldo, Titular datosTitular){
        super(nombre,DNI, apellido, telefono, email);
        this.entidadBancaria=entidadBancaria;
        this.entidadFinanciera=entidadFinanciera;
        this.numeroTarjeta=numeroTarjeta;
        TarjetaDeCredito.saldo =saldo;
        this.datosTitular=Titular.DNI;
    }
       /**
        * Valida que el saldo es mayor al monto final
        * @author Acoydan [acoexo]
        * @param montoFinal
        * @return 
        */
    public boolean tieneSaldoDisponible(double montoFinal) {
        return saldo >= montoFinal;
    }

    /**
    * Muestra por pantalla el saldo de la TarjetaDeCredito
    * @author Acoydan [acoexo]
    */
    public void getSaldo(){
        
        System.out.println(saldo);
    }
    /**
     * Le aplica al atributo saldo del objeto TarjetaDeCredito el saldo que introduce el usuario por consola
     * @param saldo
     * @return saldo
     * @author Acoydan [acoexo]
     */
    public float setSaldo(float saldo){
        TarjetaDeCredito.saldo =saldo;
        return saldo;
    }
    /**
    * Muestra por pantalla los datos del titular a partir del método "getNombreApellidos()" de la clase titular
    * @author Acoydan [acoexo]
    */
    public void getDatosTitular() {
        
        System.out.println(getNombreApellidos());
    }
    /**
     * Devuelve infromación general acerca de la clase TarjetaDeCredito
     * @return entidad bancaria, saldo, datos del titular, número de tarjeta y entidad financiera
     * @author Acoydan [acoexo]
     */
    public String toString(){
        return "Entidad bancaria: "+this.entidadBancaria+", Saldo: "+ saldo+"€, DNI del titular: "+this.datosTitular+", Número de tarjeta: "+this.numeroTarjeta+", Entidad financiera: "+this.entidadFinanciera;
    }
    /**
     * Hace la resta del monto fial al saldo de la tarjeta
     * @param montoFinal 
     * @author Acoydan [acoexo
     */
    public void descontar(double montoFinal) {
        saldo-=montoFinal;
    }
}