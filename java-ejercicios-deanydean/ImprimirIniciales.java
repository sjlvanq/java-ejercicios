/*******************************************************************
* ImprimirIniciales.java
* Dean & Dean
*
* Este programa imprime las iniciales del nombre introducido por el usuario.
*******************************************************************/
import java.util.Scanner;
public class ImprimirIniciales
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
String nombre;
// nombre
String apellido;
// apellido
System.out.print(
"Introduzca su nombre y primer apellido separados por un espacio: ");
nombre = stdIn.next();
apellido = stdIn.next();
System.out.println("Sus iniciales son " +
nombre.charAt(0) + apellido.charAt(0) + ".");
} // fin del main
} // fin de la clase ImprimirIniciales
