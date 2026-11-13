
import java.util.Scanner;
/**
 * Ejercicio 12:Desarrollar una solución que permita leer los datos de un 
 * automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio
 * de venta (incluido el impuesto) . Si el origen es Alemania el impuesto es 
 * 20% , si es de Japón el impuesto es 30% , si es de Italia, 15% , y si es de
 * USA, 8%
 * @author juanjosecevallosjimenez
 */
public class Ejercicio12_Cálculoimpuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
         String marca, origen;
        double costo, impuesto, total;
        System.out.print("Ingrese la marca del automovil: ");
        marca = tcl.nextLine();
        System.out.print("Ingrese el origen del automovil: ");
        origen = tcl.nextLine();
        System.out.print("Ingrese el costo del automovil: ");
        costo = tcl.nextDouble();
        if (origen.equalsIgnoreCase("Alemania")) {
            impuesto = costo * 0.20;
        } else if (origen.equalsIgnoreCase("Japon")) {
            impuesto = costo * 0.30;
        } else if (origen.equalsIgnoreCase("Italia")) {
            impuesto = costo * 0.15;
        } else if (origen.equalsIgnoreCase("USA")) {
            impuesto = costo * 0.08;
        } else {
            impuesto = 0;
        }
        if (origen.equalsIgnoreCase("Alemania") ||
            origen.equalsIgnoreCase("Japon") ||
            origen.equalsIgnoreCase("Italia") ||
            origen.equalsIgnoreCase("USA")) {
            total = costo + impuesto;
            System.out.println("Marca: " + marca);
            System.out.println("Impuesto a pagar: $" + impuesto);
            System.out.println("Precio de venta: $" + total);
        } else {
            System.out.println("Origen no valido");
        }
    }
}
/** run
Ingrese la marca del automovil: Toyota
Ingrese el origen del automovil: Japon
Ingrese el costo del automovil: 20000
Marca: Toyota
Impuesto a pagar: $6000.0
Precio de venta: $26000.0
 */
