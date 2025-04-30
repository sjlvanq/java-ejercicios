/***************************************************************
 * LuckyNumber.java
 * Dean & Dean
 *
 * Este programa lee el número de la suerte del usuario como un int.
 ***************************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;
public class LuckyNumber
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int num; // lucky number
		try
		{
			System.out.print("Introduzca su número de la suerte (un entero): ");
			num = stdIn.nextInt();
		}
		catch (InputMismatchException e)
		{
			System.out.println(
					"Entrada inválida. Usted debe proporcionar un número de la suerte.");
			num = (int) (Math.random() * 10) + 1;
			// between 1-10
		}
		System.out.println("Su número de la suerte es " + num + ".");
	} // end main
} // end LuckyNumber class
