/********************************************************************
 * PennyJar.java
 * Dean & Dean
 *
 * Esta clase cuenta monedas para alcancías individuales y para todas
 * las alcancías combinadas.
 ********************************************************************/
public class PennyJar
{
	public static final int GOAL = 10000; 
	private static int allPennies = 0;
	private int pennies = 0;
	//*****************************************************************
	public int getPennies()
	{
		return this.pennies;
	}
	//*****************************************************************


	public void addPenny()
	{
		System.out.println("Clink!");
		this.pennies++;
		PennyJar.allPennies++;
		if (PennyJar.allPennies >= PennyJar.GOAL)
		{
			System.out.println("Time to spend!");
		}
	} // end addPenny



	//*****************************************************************
	public static int getAllPennies()
	{
		return PennyJar.allPennies;
	}
} // end class PennyJar
