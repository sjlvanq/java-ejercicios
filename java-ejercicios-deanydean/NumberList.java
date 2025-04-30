/************************************************************
 * NumberList.java
 * Dean & Dean
 *
 * Esto introduce números y calcula su valor medio.
 ************************************************************/
import java.util.Scanner;
public class NumberList
{
	private int[] numList = new int[100];
	private int size = 0;

	// arreglo de números
	// cantidad de números

	//*********************************************************
	public void readNumbers()
	{
		Scanner stdIn = new Scanner(System.in);
		String xStr;
		// número introducido por el usuario (forma String)
		int x;
		// número introducido por el usuario
		System.out.print("Introduzca un número entero (q para salir): ");
		xStr = stdIn.next();
		while (!xStr.equalsIgnoreCase("q"))
		{
			x = Integer.parseInt(xStr);
			numList[size] = x;
			size++;
			System.out.print("Introduzca un número entero (q para salir): ");
			xStr = stdIn.next();
		} // end while
	} // end readNumbers
	//*********************************************************
	public double getMean()
	{
		int sum = 0;
		for (int i=0; i<size; i++)
		{
			sum += numList[i];
		}
		return sum / size;
	} // end getMean
} // end class NumberList
