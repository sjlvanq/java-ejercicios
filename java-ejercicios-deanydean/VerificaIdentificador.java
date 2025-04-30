/***************************************************************
 * VerificaIdentificador.java
 * Dean & Dean
 *
 * Verifica la entrada de un usuario para determinar si es un identificador válido.
 ***************************************************************/
import java.util.Scanner;
public class VerificaIdentificador
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String linea;
		// captura del usuario
		char ch;
		boolean valido = true; // ¿La línea introducida es un identificador válido?
		System.out.println("Este programa verifica la validez" +
				" un identificador de Java propuesto.");
		System.out.print("Proponga un identificador de Java: ");
		linea = stdIn.nextLine();
		ch = linea.charAt(0);
		if (!(Character.isLetter(ch) || ch == '$' || ch == '_'))
		{
			valido = false;
		}
		for (int i=1; i<linea.length() && valido; i++)
		{
			ch = linea.charAt(i);
			if (!(Character.isLetterOrDigit(ch) || ch == '$' || ch == '_'))
			{
				valido = false;
			}
		}
		if (valido)
		{
			System.out.println(
					"Felicidades, " + linea + " es un identificador válido de Java.");
		}
		else
		{
			System.out.println(
					"Lo sentimos, " + linea + " no es un identificador válido de Java.");
		}
	} // fin del main
} // fin de la clase VerificaIdentificador
