
import java.util.Scanner;

/**
 * Ejercicio 04: Calcular el precio final de un producto con 
 * un descuento del 10% si el precio original es mayor de $100; de lo contrario, 
 * no hay descuento.
 * @author NombreAutor
 * @version 1.0
*/

public class Ejercicio04_DescuentoenCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el precio de el producto:  ");
        double numero = tcl.nextDouble();
        if (numero > 100) {
            numero = (numero - (numero * 0.10));
            System.out.println("El precio es: " + numero);
        } else {
            System.out.println("El precio es: " + numero);
            System.out.println("No tiene ningun descuento");
        }
    }   
}

/** RUN:
Ingrese el precio de el producto:  110
El precio es: 99.0
 */
