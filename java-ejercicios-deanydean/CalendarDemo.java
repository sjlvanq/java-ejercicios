/********************************************************************
 * CalendarDemo.java
 * Dean & Dean
 *
 * Este programa ilustra el uso de la clase Calendar.
 ********************************************************************/
import java.util.*;

// para Scanner y Calendar

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		Calendar time = Calendar.getInstance();
		int day;
		int hour;
		System.out.println(time.getTime());
		day = time.get(time.DAY_OF_YEAR);
		hour = time.get(time.HOUR_OF_DAY);
		System.out.println("day of year= " + day);
		System.out.println("hour of day= " + hour);

		// inicialmente ahora
		// día del año
		// hora del día

		System.out.print("Enter number of days to add: ");
		day += stdIn.nextInt();
		System.out.print("Enter number of hours to add: ");
		hour += stdIn.nextInt();
		time.set(time.DAY_OF_YEAR, day);
		time.set(time.HOUR_OF_DAY, hour);
		System.out.println(time.getTime());
	} // end main
} // end class CalendarDemo
