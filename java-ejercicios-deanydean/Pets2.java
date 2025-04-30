/**********************************************************
 * Pets2.java
 * Dean & Dean
 *
 * Esto ilustra el uso de un operador instanceof.
 **********************************************************/
import java.util.Scanner;
public class Pets2
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		Object obj;

		System.out.print("¿Qué tipo de mascota prefiere?\n" +
				"Introduzca d para perros o c para gatos: ");
		if (stdIn.next().equals("d"))
		{
			obj = new Dog();
		}
		else
		{
			obj = new Cat();
		}
		if (obj instanceof Dog)
		{
			System.out.println("Wag tail");
		}
	} // end main
} // end Pets2 class
