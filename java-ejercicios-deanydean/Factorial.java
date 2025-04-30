/***************************************************
 * Factorial.java
 * Dean & Dean
 *
 * Este programa calcula el factorial de un entero.
 ***************************************************/
public class Factorial
{
	public static void main(String[] args)
	{
		System.out.println(factorial(5));
	} // end main
	//************************************************
	private static int factorial(int n)
	{
		int nF; // n factorial
		if (n == 1) // condición de detención
		{
			nF = 1;
		}
		else
		{
			nF = n * factorial(n-1);
		}
		return nF;
	} // end factorial
} // end Factorial class
