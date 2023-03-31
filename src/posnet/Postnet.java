package posnet;
/**
 * Esta clase define los valores constantes y estáticos que se utilizan para el cálculo de recargos por cuotas en una transacción financiera.
 * @author [acoexo] Acoydan 
 */
public class Postnet {
    /**
    * El recargo por cuota se establece en un 3% y se utiliza para calcular el recargo total en función del número de cuotas seleccionado.
    */
    public static double recargoPorCuota = 0.03;
    /**
     * Establece la cantidad mínima de cuotas permitida que es de 1
     */
    public static final int minCantCuotas = 1;
    /**
     * Establece la cantidad máxima permitida que es de 6.
     */
    public static final int maxCantCuotas = 6;
    /**
     * Efectúa el pago a partir de las variables tarjeta, monto a abonar y cantidad de cuotas.
     * @param tarjeta
     * @param montoAAbonar
     * @param cantCuotas
     * @return ticket
     * @author [acoexo] Acoydan
     */
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas){
        double montoFinal;
        Ticket ticket = null;
        if(datosValidos(tarjeta, montoAAbonar, cantCuotas)){
            montoFinal= montoAAbonar+montoAAbonar*recargoSegunCuotas(cantCuotas);
            if(tarjeta.tieneSaldoDisponible(montoFinal)){
                tarjeta.descontar(montoFinal);
                String nomApe=tarjeta.getNombreApellidos();
                double montoPorCuota=montoFinal/cantCuotas;
                ticket=new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }
        return ticket;

    }
    /**
     * Calcula el recargo según cuotas a partir de la cantidad y el recargo por cuota.
     * @param cantCuotas
     * @return [double] cantidadCuotas-1 X recargoPorCuotas
     * @author [acoexo] Acoydan
     */
    private double recargoSegunCuotas(int cantCuotas){
            return (cantCuotas-1)*recargoPorCuota;
        }
    /**
     * Comprueba la validación de los parámetros tarjeta, monto a abonar y cantidad de cuotas.
     * @param tarjeta
     * @param montoAAbonar
     * @param cantCuotas
     * @return [boolean] tarjetaValida and montoValido and cuotaValida
     * @author [acoexo] Acoydan 
     */
    private boolean datosValidos(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas){
        boolean tarjetValida= tarjeta != null;
        boolean montoValido= montoAAbonar >0;
        boolean cuotaValida = cantCuotas >= minCantCuotas && cantCuotas <= maxCantCuotas;
        return tarjetValida&&montoValido&&cuotaValida;
    }
}
