package proyect.apeb1.taller05;
import java.util.Scanner;

/**
 * Ejercicio 03: Dados tres números distintos, determinar cuál es el mayor.
 * @author NombreAutor
 * @version 1.0
 */
public class Ejercicio03_Mayordetresnúmeros {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un numero:  ");
        int numero1 = tcl.nextInt();
        System.out.print("Ingrese un numero:  ");
        int numero2 = tcl.nextInt();
        System.out.print("ingrese un numero:  ");
        int numero3 = tcl.nextInt();
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("El numero mayor es:  " + numero1);
            }else {
                System.out.println("El numero mayor es:  " + numero3);
            }
        } else if (numero2 > numero3) {
            System.out.println("El numero mayor es:  " + numero2);
        } else {
            System.out.println("El numero mayor es:  " + numero3);
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
Ingrese un numero:  9
Ingrese un numero:  7
ingrese un numero:  2
El numero mayor es:  9


