package posnet;
/**
 * Se refiere al "dueño" de la tarjeta de credito además de ser el "cliente" del servicio
 * @author [acoexo] Acoydan
 */
public class Titular {
    /**
     * Es el nombre del Titular
     */
     public static String nombre;
     /**
      * Es el documento nacional de identidad
      */
     public static String DNI;
     /**
      * Es el primer apellido del titular
      */
     public static String apellido;
     /**
      * Es el número de telefono de contacto del titular
      */
     public static int telefono;
     /**
      * Es el correo electrónico de contacto del titular
      */
     public static String email;
     /**
      * @param nombre
      * @param DNI
      * @param apellido
      * @param telefono
      * @param email 
      */
    Titular(String nombre, String DNI, String apellido, int telefono, String email){
        Titular.nombre =nombre;
        Titular.apellido =apellido;
        Titular.DNI =DNI;
        Titular.email =email;
        Titular.telefono =telefono;
    }
    /**
     * @author [acoexo] Acoydan 
     * @return  [String] nombre+apellido
     */
    public String getNombreApellidos(){
        return nombre +" "+ apellido;
    }
}
