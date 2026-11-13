
import java.util.Scanner;
/**
 * Ejercicio 10:Dado un valor entero ingresado por teclado (positivo o negativo) 
 * , determine si se trata de un valor par o impar.
 * @author juanjosecevallosjimenez
 */
public class Ejercicio10_Valoresparesoimpares {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
         int numero;
        System.out.print("Ingrese un numero entero: ");
        numero = tcl.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }
    }
}
/** run
 Ingrese un numero entero: -8
El numero es PAR
 */