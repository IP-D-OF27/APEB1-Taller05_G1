
import java.util.Scanner;
/**
 * Ejercicio 08:Calcula el índice de masa corporal (IMC) de una persona y la 
 * clasifica en función de su valor (bajo peso, peso normal, sobrepeso, etc.) .
 * @author juanjosecevallosjimenez
 */
public class Ejercicio08_CalculadoraIMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
         double peso, altura, imc;
        System.out.print("Ingrese su peso en kg: ");
        peso = tcl.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        altura = tcl.nextDouble();
        if (peso > 0 && altura > 0) {
            imc = peso / (altura * altura);
            System.out.println("Su IMC es: " + imc);
            if (imc < 18.5) {
                System.out.println("Bajo peso");
            } else if (imc < 25) {
                System.out.println("Peso normal");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidad");
            }
        } else {
            System.out.println("Datos no validos");
        }
    }
}
/** run
 Ingrese su peso en kg: 65
Ingrese su altura en metros: 1,70
Su IMC es: 22.49134948096886
Peso normal
 */
    
