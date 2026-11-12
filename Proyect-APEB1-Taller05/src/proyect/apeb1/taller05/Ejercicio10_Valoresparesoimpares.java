
import java.util.Scanner;

/**
 * Ejercicio 10: Valoresparesoimpares: Dado un valor entero ingresado por 
 * teclado (positivo o negativo), determinar si se trata de un valor par o impar.
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
public class Ejercicio10_Valoresparesoimpares {
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
