
import java.util.Scanner;
/**
 * Ejercicio 13: En una hostería de la ciudad de Loja se hace un descuento del 
 * 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 
 * días y del 20% si se hospeda más de 15 días. Elaborar una solución que pida 
 * el número de días y el precio diario de la habitación y luego calcule e 
 * imprima el subtotal por pagar, el descuento y el total por pagar.
 * @author juanjosecevallosjimenez
 */
public class Ejercicio13_Sistemareservashoteleras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
         int dias;
        double precio, subtotal, descuento, total;
        System.out.print("Ingrese el numero de dias: ");
        dias = tcl.nextInt();
        System.out.print("Ingrese el precio diario de la habitacion: ");
        precio = tcl.nextDouble();
        subtotal = dias * precio;
        descuento = 0;
        if (dias > 15) {
            descuento = subtotal * 0.20;
        } else if (dias > 10) {
            descuento = subtotal * 0.15;
        } else if (dias > 5) {
            descuento = subtotal * 0.10;
        }
        total = subtotal - descuento;
        System.out.println("Subtotal a pagar: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}
