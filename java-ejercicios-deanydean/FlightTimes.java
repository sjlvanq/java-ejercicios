/*********************************************************************
 * FlightTimes.java
 * Dean & Dean
 *
 * Esto administra una tabla de tiempos de vuelo entre ciudades.
 **********************************************************************/
import java.util.Scanner;
public class FlightTimes
{
	private int[][] flightTimes; // tabla de tiempos de vuelo
	private String[] cities;
	// ciudades en la tabla flightTimes
	//*******************************************************************
	public FlightTimes(int[][] ft, String[] c)
	{
		flightTimes = ft;
		cities = c;
	}
	//*******************************************************************
	// Desplegado para el usuario solicitando ciudades y la impresión
	// del tiempo de vuelo asociado.
	public void promptForFlightTime()
	{
		Scanner stdIn = new Scanner(System.in);
		int departure;
		// índice de la ciudad de origen Imprime la leyenda del
		int destination; // índice de la ciudad de destino número de ciudad.
		for (int i=0; i<cities.length; i++)
		{
			System.out.println(i+1 + " = " + cities[i]);
		}

		System.out.print("Introducir el número de la ciudad de salida: ");
		departure = stdIn.nextInt() - 1;
		System.out.print("Introducir el número de la ciudad de destino: ");
		destination = stdIn.nextInt() - 1;
		System.out.println("Flight time = " +
				flightTimes[departure][destination] + " minutos.");
	} // end promptForFlightTime
	//*****************************************************************
	// Este método imprime una tabla con todos los tiempos de vuelo.
	public void displayFlightTimesTable()
	{
		final String CITY_FMT_STR = "%5s"; 
		final String TIME_FMT_STR = "%5d"; 


		System.out.printf(CITY_FMT_STR, ""); // vacía la esquina superior
		System.out.println();
		for (int row=0; row<flightTimes.length; row++)
		{
			System.out.printf(CITY_FMT_STR, cities[row]);
			for (int col=0; col<flightTimes[0].length; col++)
			{
				System.out.printf(TIME_FMT_STR, flightTimes[row][col]);
			}
			System.out.println();
		} // end for
	} // end displayFlightTimesTable
} // end class FlightTimes
