
import java.util.Scanner;
/**
 * Ejercicio 09: Dados tres números, ordenarlos en orden ascendente.
 * @author juanjosecevallosjimenez
 */
public class Ejercicio09_OrdenamientoTresNúmeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num1, num2, num3, aux;
        System.out.print("Ingrese el primer numero: ");
        num1 = tcl.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = tcl.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = tcl.nextInt();
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num1 > num3) {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }
        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        System.out.println("Numeros ordenados:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
/** run:
Ingrese el primer numero: 30
Ingrese el segundo numero: 20
Ingrese el tercer numero: 10
Numeros ordenados:
10
20
30
 */
