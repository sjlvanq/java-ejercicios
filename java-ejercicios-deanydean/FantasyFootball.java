/*************************************************************
* FantasyFootball.java
* Dean & Dean
*
* Esto imprime los nombres de jugadores de futbol americano.
*************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
public class FantasyFootball
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
ArrayList<String> players = new ArrayList<String>();
String indexStr;
int index = 0;
players.add("Peyton Manning");
players.add("Ladanian Tomlinson");
players.add("Reggie Bush");
System.out.print("Introduzca un número entre 1 y 3: ");
indexStr = stdIn.nextLine();
try
{
index = Integer.parseInt(indexStr);
System.out.println("Índice introducido OK.");
}
catch (NumberFormatException e)
{
System.out.println("El índice introducido no era un entero");
}

try
{
System.out.println(players.get(index - 1));
}
catch (IndexOutOfBoundsException e)
{
System.out.println(
"No es posible acceder a jugadores[" + (index - 1) + "]");
}
System.out.println("hecho");
} // end main
} // end class FantasyFootball
