
import java.util.Scanner;

/**
 * Ejercicio 07:Asignar una letra (A, B, C, D) a una calificación en función 
 * de su rango (A para 90-100, B para 80-89, etc.).
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio07_RangodeNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su calificaciòn: ");
        int calificacion = tcl.nextInt();
          if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("Tu calificacion es A  ");
         } else if (calificacion >= 80 && calificacion <=89) {
            System.out.println("Tu calificacion es B  ");
         } else if (calificacion >= 70 && calificacion <= 79) {
            System.out.println("Tu calificacion es C");
         } else if (calificacion >= 60 && calificacion <= 69) {
            System.out.println("Tu calificacion es D");
         } else{
            System.out.println("La calificacion no corresponde");
         }
 }
}