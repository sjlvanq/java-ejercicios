/****************************************************************
 * PrintLineFromFile2.java
 * Dean & Dean
 *
 * Esto abre un archivo de texto existente e imprime una de sus líneas.
 ****************************************************************/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PrintLineFromFile2
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
		catch (FileNotFoundException e)
		{
			System.out.println("Nombre de archivo inválido: " + fileName);
		}
		catch (IOException e)
		{
			System.out.println("Error de lectura del archivo: " + fileName);
		}
	} // end main
} // end PrintLineFromFile2 class
