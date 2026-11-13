
import java.util.Scanner;
/**
 * Ejercicio 11:Desarrollar una solución que imprima el costo de un pedido de un
 * artículo del cual se tiene la descripción, la cantidad que se requiere y el 
 * precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento
 * del 15%.
 * @author juanjosecevallosjimenez
 */
public class Ejercicio11_Pedidosonline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String descripcion;
        int cantidad;
        double precio, subtotal, descuento, total;
        System.out.print("Ingrese la descripcion del articulo: ");
        descripcion = tcl.nextLine();
        System.out.print("Ingrese la cantidad: ");
        cantidad = tcl.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        precio = tcl.nextDouble();
        subtotal = cantidad * precio;
        descuento = 0;
        if (cantidad > 50) {
            descuento = subtotal * 0.15;
        }
        total = subtotal - descuento;
        System.out.println("Articulo: " + descripcion);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}
/** run 
Ingrese la descripcion del articulo: Cuadernos
Ingrese la cantidad: 60
Ingrese el precio unitario: 2
Articulo: Cuadernos
Subtotal: $120.0
Descuento: $18.0
Total a pagar: $102.0
 */