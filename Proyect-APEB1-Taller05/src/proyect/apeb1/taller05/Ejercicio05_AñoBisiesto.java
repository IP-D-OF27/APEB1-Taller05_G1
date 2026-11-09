
import java.util.Scanner;


 //Ejercicio 05: Comprobar si un año ingresado es bisiesto o no
 //Si es bisiesto, mostrar un mensaje especial.
 //* @author NombreAutor
 //* @version 1.0

public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el anio: ");
        int anio = tcl.nextInt();
        if (anio % 400 == 0) {
            System.out.println("El anio es bisiesto");
        } else if (anio % 100 == 0) {
            System.out.println("El anio no es bisiesto");
        } else if (anio % 4 == 0) {
            System.out.println("El anio es bisiesto");
        } else {
            System.out.println("El anio no es bisiesto");
        }
    }
}

/** RUN
 Ingrese el anio: 2000
El anio es bisiesto
 */