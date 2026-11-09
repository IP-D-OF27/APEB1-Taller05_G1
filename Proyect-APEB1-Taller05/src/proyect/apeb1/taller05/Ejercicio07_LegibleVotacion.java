
import java.util.Scanner;

/**
 * Ejercicio 07: Asignar una letra (A, B, C, D) a una calificación en función 
 * de su rango (A para 90-100, B para 80-89, etc.).
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio07_LegibleVotacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme edad");
        int nota = tcl.nextInt();
        if (nota>= 16) 
            System.out.println("es legible para votar");
        else
            System.out.println("No es legible para votar");
    }
    
}
