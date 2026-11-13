
import java.util.Scanner;
/**
 * Ejercicio 07: Asignar una letra (A, B, C, D) a una calificación en función 
 * de su rango (A para 90-100, B para 80-89, etc.).
 * @author juan
 * @version 1.0
 */
public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double nota;
        System.out.print("Ingrese la nota: ");
        nota = tcl.nextDouble();
        if (nota >= 90 && nota <= 100) {
            System.out.println("Calificacion: A");
        } else if (nota >= 80 && nota < 90) {
            System.out.println("Calificacion: B");
        } else if (nota >= 70 && nota < 80) {
            System.out.println("Calificacion: C");
        } else if (nota >= 60 && nota < 70) {
            System.out.println("Calificacion: D");
        } else if (nota >= 0 && nota < 60) {
            System.out.println("Calificacion: F");
        } else {
            System.out.println("Nota no valida");
        }
    }
}
 /** RUN
Ingrese la nota: 95
Calificacion: A
 */

