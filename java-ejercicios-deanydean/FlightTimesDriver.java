/*********************************************************************
 * FlightTimesDriver.java
 * Dean & Dean
 *
 * Esto administra una tabla de tiempos de vuelo entre ciudades.
 *********************************************************************/
public class FlightTimesDriver
{
	public static void main(String[] args)
	{
		int[][] flightTimes =
		{
			{0, 22, 30, 42, 55},
			{23, 0, 14, 25, 37},
			{31, 9, 0, 11, 28},
			{44, 27, 12, 0, 12},
			{59, 41, 30, 14, 0}
		};
		String[] cities = {"Wch", "Top", "KC", "Col", "StL"};
		FlightTimes ft = new FlightTimes(flightTimes, cities);
		System.out.println("\ntiempos de vuelo para Aerolíneas KansMo:\n");
		ft.displayFlightTimesTable();
		System.out.println();
		ft.promptForFlightTime();
	} // end main
} // end class FlightTimesDriver
