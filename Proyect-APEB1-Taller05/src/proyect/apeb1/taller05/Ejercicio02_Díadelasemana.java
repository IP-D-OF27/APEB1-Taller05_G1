    
import java.util.Scanner;

/**
 * Ejercicio 02: Mostrar el nombre del día de la semana en función del número 
 * ingresado (1 para lunes, 2 para martes, etc.).
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio02_Díadelasemana {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Numero de semana de el 1 al 7: ");
        int Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo;
        int numero = tcl.nextInt(); 
        Lunes = 1;
        Martes = 2;
        Miercoles = 3;
        Jueves = 4;
        Viernes = 5; 
        Sabado = 6;
        Domingo = 7;
        if (numero == 1) {
            System.out.println("El dia es lunes");
        } else  if (numero == 2) {
            System.out.println("El dia es Martes");
        } else if (numero == 3) {
            System.out.println("El dia es miercoles");
        } else if (numero == 4) {
            System.out.println("El dia es jueves");
        } else if (numero == 5) {
            System.out.println("El dia es viernes");
        } else if (numero == 6) {
            System.out.println("El dia sabado");
        } else if (numero == 7) {
            System.out.println("el dia es domingo");
        } else 
            System.out.println("El numero es incorrecto");     
  }
}    
/***
 * EVIDENCIA DEL RUN:
run:
Numero de semana de el 1 al 7: 4
El dia es jueves
 */