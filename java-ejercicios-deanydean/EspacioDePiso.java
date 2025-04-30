/***************************************************************
 * EspacioDePiso.java
 * Dean & Dean
 *
 * Este programa calcula el espacio total de piso en una casa.
 ****************************************************************/
import java.util.Scanner;
public class EspacioDePiso
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		double longitud, anchura;
		// room dimensions
		double espacioPiso = 0;
		// house's total floor space
		char respuesta;
		// user's y/n response
		do
		{
			System.out.print("Introduzca la longitud: ");
			longitud = stdIn.nextDouble();
			System.out.print("Introduzca la anchura: ");
			anchura = stdIn.nextDouble();
			espacioPiso += longitud * anchura;
			System.out.print("¿Otra recámara (s/n): ");
			respuesta = stdIn.next().charAt(0);
		} while (respuesta == 's' || respuesta == 'S');
		System.out.println("El espacio total del piso es " + espacioPiso);
	} // fin del main
} // fin de la clase EspacioDePiso
