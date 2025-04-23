/*
 * Replicar la siguiente salida en consola.
 * 
 *     
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * 
 */

public class FiguraUno
{
	public static void main (String[] args)
	{
		for(int i=1; i<=5; i++) {
			System.out.println("%s".formatted("*".repeat(i)));
		}
	}
}
