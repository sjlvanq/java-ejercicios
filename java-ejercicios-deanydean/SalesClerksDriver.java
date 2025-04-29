/*******************************************************************
 * SalesClerksDriver.java
 * Dean & Dean
 *
 * Esto controla la clase SalesClerks.
 *******************************************************************/
import java.util.Scanner;
public class SalesClerksDriver
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		SalesClerks clerks = new SalesClerks(2);
		String name;
		System.out.print("Introducir el nombre del empleado (q para salir): ");
		name = stdIn.nextLine();
		while (!name.equals("q"))
		{
			System.out.print("Introducir la cantidad de la venta: ");
			clerks.addSale(name, stdIn.nextDouble());
			stdIn.nextLine();
			// flush newline
			System.out.print("Introducir el nombre del empleado (q para salir): ");
			name = stdIn.nextLine();
		} // end while
		clerks.dumpData();
	} // end main
} // end SalesClerksDriver