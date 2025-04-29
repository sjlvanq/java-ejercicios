/*******************************************************************
* PuertaDeCochera.java
* Dean & Dean
*
* Ésta es la simulación de la operación de una puerta de cochera.
*******************************************************************/
import java.util.Scanner;
public class PuertaDeCochera
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
String captura;
// captura del usuario: tecla enter o s
boolean direccionArriba = true; // ¿Es la dirección actual hacia arriba?
boolean enMovimiento = false;
// ¿Esta la puerta de la cochera en movimiento?
System.out.println("SIMULACION DE APERTURA DE PUERTA DE COCHERA\n");
do
{
System.out.print("Presione Enter, o introduzca 's' para salir: ");
captura = stdIn.nextLine();
if (captura.equals(""))
// pressing Enter generates ""
{
enMovimiento = !enMovimiento;
// button toggles run state
if (enMovimiento)
{
if (direccionArriba)
{
System.out.println("moviendo hacia arriba");
}
else
{
System.out.println("moviendo hacia abajo");
}
}
else
{
System.out.println("detenida");
direccionArriba = !direccionArriba; // direction reverses at stop
}
} // fin de captura = ""
} while (captura.equals(""));
} // fin del main
} // fin de la clase PuertaDeCochera
