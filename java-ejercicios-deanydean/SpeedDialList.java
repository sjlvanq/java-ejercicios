/********************************************************************
 * SpeedDialList.java
 * Dean & Dean
 *
 * Este programa crea una lista de números telefónicos de marcación
 * rápida a teléfonos celulares e imprime la lista creada.
 ********************************************************************/
import java.util.Scanner;
public class SpeedDialList
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		long[] phoneList;
		// lista de números telefónicos
		int sizeOfList;
		// cantidad de números telefónicos
		long phoneNum;
		// un número telefónico introducido
		System.out.print(
				"¿Cuántos números telefónicos de marcación rápida le gustaría introducir? ");
		sizeOfList = stdIn.nextInt();
		phoneList = new long[sizeOfList];
		for (int i=0; i<sizeOfList; i++)
		{
			System.out.print("Enter phone number: ");
			phoneNum = stdIn.nextLong();
			phoneList[i] = phoneNum;
		} // end for

		System.out.println("\nSpeed Dial List:");
		for (int i=0; i<sizeOfList; i++)
		{
			System.out.println((i + 1) + ". " + phoneList[i]);
		} // end for
	} // end main
} // end class SpeedDialList
