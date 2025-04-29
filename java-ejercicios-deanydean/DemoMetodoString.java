/*******************************************************************
* DemoMetodoString.java
* Dean & Dean
*
* Este programa usa el método isEmpty de la clase String.
*******************************************************************/
import java.util.Scanner;
public class DemoMetodoString
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
String nombre;
System.out.print("Introduzca su nombre: ");
String name = stdIn.nextLine();

while (nombre.isEmpty())
{
System.out.print("captura inválida. Debe de introducir su nombre: ");
nombre = stdIn.nextLine();
}
System.out.println("Hola, " + nombre + "!");
} // fin del main
} // fin de la clase DemoMetodoString
