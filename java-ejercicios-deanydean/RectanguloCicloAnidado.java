/************************************************************
 * RectanguloCicloAnidado.java
 * Dean & Dean
 *
 * Este programa calcula el espacio total de piso en una casa.
 *************************************************************/
import java.util.Scanner;
public class RectanguloCicloAnidado
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int altura, anchura;
		// rectangle's dimensions
		char carImpresion;
		System.out.print("Introduzca la altura: ");
		altura = stdIn.nextInt();
		System.out.print("Introduzca la anchura: ");
		anchura = stdIn.nextInt();
		System.out.print("Introduzca el carácter: ");
		carImpresion = stdIn.next().charAt(0);
		for (int reng=1; reng<=altura; reng++)
		{
			for (int col=1; col<=anchura; col++)
			{
				System.out.print(carImpresion);
			}
			System.out.println();
		}
	} // fin del main
} // fin de la clase RectanguloCicloAnidado
