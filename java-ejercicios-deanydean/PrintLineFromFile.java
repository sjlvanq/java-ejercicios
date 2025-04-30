/***********************************************************
 * PrintLineFromFile.java
 * Dean & Dean
 *
 * Esto abre un archivo de texto existente e imprime una de sus líneas.
 ***********************************************************/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class PrintLineFromFile
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String fileName;
		// nombre del archivo objetivo
		BufferedReader fileIn; // archivo objetivo
		String line;
		// primera línea de fileIn
		System.out.print("Introduzca el nombre de un archivo: ");
		fileName = stdIn.nextLine();
		try
		{
			fileIn = new BufferedReader(new FileReader(fileName));
			line = fileIn.readLine();
			System.out.println("Line 1:\n" + line);
		} // end try
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	} // end main
} // end PrintLineFromFile class
