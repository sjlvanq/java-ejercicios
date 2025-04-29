/**************************************************************
* PetMouse.java
* Dean & Dean
*
* Esto crea y muestra una lista ligada de objetos simples.
**************************************************************/
import java.util.Scanner;
public class PetMouse
{
private static PetMouse pets;

// apunta a la lista de pets

private String name;

private PetMouse next;
//******************************************************
// Inserta cada objeto nuevo al inicio de una lista existente.
public PetMouse()
{
Scanner stdIn = new Scanner(System.in);
this.next = pets;
System.out.print("Enter name: ");
this.name = stdIn.nextLine();
pets = this;
} // end constructor
//******************************************************
public static void list()
{
PetMouse next = pets;
while (next != null)
{
System.out.print(next.name + " ");
next = next.next;
}
System.out.println();
} // end list
} // end class PetMouse
