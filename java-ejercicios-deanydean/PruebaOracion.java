/******************************************************************
* PruebaOracion.java
* Dean & Dean
*
* Este programa verifica que exista un punto al final de la oración.
*******************************************************************/
import java.util.Scanner;
public class PruebaOracion
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
String oracion;
int carUltimaPosicion;
System.out.println("Introduzca una oración:");
oracion = stdIn.nextLine();
carUltimaPosicion = oracion.length() - 1;
if (oracion.charAt(carUltimaPosicion) != '.')
{
System.out.println(
"Captura inválida: ¡su oración requiere un punto!");
}
} // fin del main
} // fin de la clase PruebaOracion
