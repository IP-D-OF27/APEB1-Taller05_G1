
import java.util.Scanner;

/**
 * Ejercicio 08: Calcular el índice de masa corporal (IMC) de 
 * una persona y clasificarla en función de su valor (bajo peso, peso normal, 
 * sobrepeso, etc.).
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio08_CalculadoradeIMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su peso(Kg): ");
        double peso = tcl.nextDouble();
        System.out.print("Ingrese altura(Cm): ");
        double altura = tcl.nextDouble();
        altura = altura/100;
        double resultado = (peso/(altura*altura));
        if (resultado < 18.5) {
            System.out.println("Bajo de Peso");
        } else if (resultado < 25) {
            System.out.println("Peso Normal");
        } else if ( resultado < 30) {
            System.out.println("sobre Peso");
        } else if (resultado >= 30 ) {
            System.out.println("Obesidad");
        }
        
 }
}