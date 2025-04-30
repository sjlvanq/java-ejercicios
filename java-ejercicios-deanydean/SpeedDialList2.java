/******************************************************************
 * SpeedDialList2.java
 * Dean & Dean
 *
 * Este programa crea una lista de números telefónicos de marcación
 * rápida e imprime la lista creada. Usa un arreglo parcialmente lleno.
 ******************************************************************/
import java.util.Scanner;
public class SpeedDialList2
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String[] phoneList = new String[100]; // números telefónicos
		int filledElements = 0;
		// cantidad de números telefónicos
		String phoneNum;
		// un número telefónico introducido
		System.out.print("Introducir el número telefónico (o q para salir): ");
		phoneNum = stdIn.nextLine();
		while (!phoneNum.equalsIgnoreCase("q") &&
				filledElements < phoneList.length)
		{
			if (phoneNum.length() < 1 || phoneNum.length() > 16)
			{
				System.out.println("Entrada inválida." +
						" Debe introducir entre 1 y 16 caracteres.");
			}
			else
			{
				phoneList[filledElements] = phoneNum;
				filledElements++;
			}
			System.out.print("Introducir el número telefónico (o q para salir): ");
			phoneNum = stdIn.nextLine();
		} // end while
		System.out.println("\nSpeed Dial List:");
		for (int i=0; i<filledElements; i++)
		{
			System.out.println((i + 1) + ". " + phoneList[i]);
		} // end for
	} // end main
} // end class SpeedDialList2
