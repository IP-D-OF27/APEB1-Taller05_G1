package proyect.apeb1.taller05;

import java.util.Scanner;

/**
 * Ejercicio 01: Clasificar a una persona en una categoría de edad (niño,
 * adolescente, adulto) en función de su edad.
 *
 * @author NombreAutor
 * @version 1.0
 */
/**
 * *
 * EVIDENCIA DEL RUN:
 *
 * package proyect.apeb1.taller05;
 *
 * /**
 *
 * @author iStore Ec
 */
public class Ejercicio06_CategoríadeEdad {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese edad:  ");
        int edad = tcl.nextInt();
        if (edad < 10) {
            System.out.println("Eres un Nino" );
        } else if (edad < 19) {
            System.out.println("Eres un Adolecente" );
        } else {
            System.out.println("Eres un Adulto");
        }
    }
}

/***
 * run:
Ingrese edad:  12
Eres un Adolecente
* run:
Ingrese edad:  20
Eres un Adulto
* run:
Ingrese edad:  6
Eres un Nino
 */
