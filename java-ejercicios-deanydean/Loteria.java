/*********************************************************************
* Loteria.java
* Dean & Dean
*
* Este programa solicita al usuario adivinar un número seleccionado
* de manera aleatoria.
*********************************************************************/
import java.util.Scanner;
public class Loteria
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
String entrada;
int numeroGanador = (int) (Math.random() * Integer.MAX_VALUE);
System.out.println("¿Desea ganar un millón de dólares?");
System.out.println("De ser así, adivine el número ganador a" +
" un número entre 0 y " + (Integer.MAX_VALUE - 1) + ").");
do
{
System.out.print(
"Inserte $1.00 e introduzca su número o 's' para salir: ");
entrada = stdIn.nextLine();
if (entrada.equals("dame una pista"))
// a back door
{
System.out.println("intente: " + numeroGanador);
}
else if (!entrada.equals("s"))
{
if (Integer.parseInt(entrada) == numeroGanador)
{
System.out.println("¡HA GANADO!");
entrada = "s"; // si alguien gana, está forzado a salir
}
else
{
System.out.println(
"Lo sentimos, buen intento, pero no lo suficientemente bueno.");
}
} // fin del else if
} while (!entrada.equals("s"));
System.out.println("Gracias por jugar. !Vuelva pronto!");
} // fin del main
} // fin de la clase Loteria
