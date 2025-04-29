/*******************************************************************
* BearStore.java
* Dean & Dean
*
* Esta clase implementa una tienda que vende osos de juguete.
*******************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
public class BearStore
{
ArrayList<Bear> bears = new ArrayList<Bear>();
//****************************************************************
// Llena la tienda con el número especificado de osos de juguete normales.
public void addStdBears(int num)
{
for (int i=0; i<num; i++)
{
bears.add(new Bear("Acme", "teddy café"));
}
} // end addStdBears
//****************************************************************
// Llena la tienda con el número especificado de osos de juguete a la medida.
public void addUserSpecifiedBears(int num)
{
for (int i=0; i<num; i++)
{
bears.add(getUserSpecifiedBear());
}
} // end addUserSpecifiedBears

//*******************************************************
// Solicita al usuario el nombre y el tipo del fabricante y devuelve el oso.
private Bear getUserSpecifiedBear()
{
Scanner stdIn = new Scanner(System.in);
String maker, type;
System.out.print("Enter bear's maker: ");
maker = stdIn.nextLine();
System.out.print("Enter bear's type: ");
type = stdIn.nextLine();
return new Bear(maker, type);
} // end getUserSpecifiedBear

//*******************************************************
// Imprime todos los osos en la tienda.
public void displayInventory()
{
for (Bear bear : bears)
{
bear.display();
}
} // end displayInventory

//*******************************************************
public static void main(String[] args)
{
BearStore store = new BearStore();
store.addStdBears(3);
store.addUserSpecifiedBears(2);
store.displayInventory();
} // end main
} // end BearStore class
