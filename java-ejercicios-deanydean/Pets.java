/**********************************************************
 * Pets.java
 * Dean & Dean
 *
 * Esto ilustra polimorfismo simple.
 **********************************************************/
import java.util.Scanner;
public class Pets
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		Object obj;
		System.out.print("¿qué tipo de mascota prefiere?\n" +
				"introduzca d para perros o c para gatos: ");
		if (stdIn.next().equals("d"))
		{
			obj = new Dog();
		}
		else
		{
			obj = new Cat();
		}
		System.out.println(obj.toString()); 
		System.out.println(obj);
	} // end main
} // end Pets class
