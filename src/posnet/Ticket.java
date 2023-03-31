package posnet;
/**
 * Es un ticket que se genera a partir de la clase postnet
 * @see Postnet
 * @author [acoexo] Acoydan
 */
public class Ticket extends Titular {
    private final String nombreApellido;
    private final double montoTotal;
    private final double montoPorCuota;
    /**
     * @param nombreApellido
     * @param montoTotal
     * @param montoPorCuota 
     */
    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota){
        super(nombre, DNI, apellido, telefono, email);
        this.nombreApellido=nombreApellido;
        this.montoTotal=montoTotal;
        this.montoPorCuota=montoPorCuota;
    }
    /**
    * Muestra por pantalla la información acerca del ticket.
    * @author Acoydan [acoexo]
    */
    public void printdata(){
        
        System.out.println(nombreApellido+" "+montoTotal+" "+montoPorCuota);
    }
    /**
    * @return Nombre y apellidos del Titular, el monto total y el monto por cuota.
    * @author Acoydan [acoexo]
    */
    public String toString(){
        
        return nombreApellido+" "+montoTotal+" "+montoPorCuota;
    }


}
