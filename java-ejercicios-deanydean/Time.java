/******************************************************************
 * Time.java
 * Dean & Dean
 *
 * Esta clase almacena la hora en forma de horas, minutos y
 * segundos. Imprime la hora usando un formato militar.
 ******************************************************************/
public class Time
{
	private int hours, minutes, seconds;
	//***************************************************************
	public Time(int h, int m, int s)
	{
		this.hours = h;
		this.minutes = m;
		this.seconds = s;
	}
	//***************************************************************
	public void printIt()
	{
		System.out.printf("%02d:%02d:%02d\n",
				hours, minutes, seconds);
	} // end printIt
	//***************************************************************
	public static void main(String[] args)
	{
		Time time = new Time(3, 59, 0);
		time.printIt();
	} // end main
} // end class Time
