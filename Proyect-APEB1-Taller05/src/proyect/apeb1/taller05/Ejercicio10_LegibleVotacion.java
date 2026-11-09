
import java.util.Scanner;

/**
 * Ejercicio 01: Edad para Votar: Determinar si una persona es elegible para 
 * votar en función de su edad (mayor o igual a 16 años).
 * @author NombreAutor
 * @version 1.0
 */
/***
 * EVIDENCIA DEL RUN:

package proyect.apeb1.taller05;

/**
 *
 * @author iStore Ec
 */
public class Ejercicio10_LegibleVotacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme edad");
        int edad = tcl.nextInt();
        if (edad>= 16) 
            System.out.println("es legible para votar");
        else
            System.out.println("No es legible para votar");
    }
    
}
