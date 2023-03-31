package posnet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Postnet p1 = new Postnet();
        Titular t1 = new Titular("Juan", "54879865P", "Fernández Castrelo", 936825714, "juanfer@gmail.com");
        TarjetaDeCredito ta1 = new TarjetaDeCredito(EntidadFinanciera.BIRZA, "Bankoa", "3214 3245 3247 6549", 5000, t1);
        System.out.println(ta1.toString());
        Ticket ticketGenerado=p1.efectuarPago(ta1, 1000, 1);
        System.out.println(ticketGenerado.toString());
        System.out.println(ta1.toString());



    }
}