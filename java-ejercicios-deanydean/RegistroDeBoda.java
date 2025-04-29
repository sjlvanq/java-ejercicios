/*************************************************************
* RegistroDeBoda.java
* Dean & Dean
*
* Este programa solicita los registros para regalos en una boda.
*************************************************************/
import java.util.Scanner;
public class RegistroDeBoda
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
String registro = "";
char mas;
System.out.print(
"¿Desea crear una lista de registro de bodas? (s/n): ");
mas = stdIn.nextLine().charAt(0);
while (mas == 'y')
{
System.out.print("Introduzca el nombre del artículo: ");
registro += stdIn.nextLine() + " - ";
System.out.print("Tienda: ");
registro += stdIn.nextLine() + "\n";
System.out.print("¿Algún otro artículo? (s/n): ");
mas = stdIn.nextLine().charAt(0);
} // fin del while
if (!registro.equals(""))
{
System.out.println("\nRegistro de bodas:\n" + registro);
}
} // fin del main
} // fin de la clase RegistroDeBoda
