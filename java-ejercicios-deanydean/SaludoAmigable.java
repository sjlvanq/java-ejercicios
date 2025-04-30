/************************************************************
 * SaludoAmigable.java
 * Dean & Dean
 *
 * Este programa despliega un saludo Hola personalizado.
 *************************************************************/
import java.util.Scanner;

public class SaludoAmigable
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String nombre;
		System.out.print("Introduce tu nombre: ");
		nombre = stdIn.nextLine();
		System.out.println("¡Hola " + nombre + "!");
	} // fin del main
} // fin de la clase SaludoAmigable
