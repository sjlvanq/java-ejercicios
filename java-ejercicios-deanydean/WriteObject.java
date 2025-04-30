/***************************************************************
 * WriteObject.java
 * Dean & Dean
 *
 * Esto escribe un objeto en un archivo binario.
 ***************************************************************/
import java.io.*;
import java.util.Scanner;
public class WriteObject
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		ObjectOutputStream fileOut;
		TestObject testObject = new TestObject(1, "test", 2.0);
		String filename;
		System.out.print("Introduzca el nombre del archivo: ");
		filename = stdIn.nextLine();
		try
		{
			fileOut = new ObjectOutputStream(
					new FileOutputStream(filename));
			fileOut.writeObject(testObject);
			fileOut.close();
		} // end try
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	} // end main
} // end WriteObject class
