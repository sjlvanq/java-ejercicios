/*
 * Replicar la siguiente salida en consola.
 * 
 *          *
 *         ***
 *        *****
 *       *******
 *      *********
 * 
 */

public class FiguraDos
{
	public static void main (String[] args)
	{
		for(int i=0, j=1; i<5; j+=2, i++) {
			System.out.println(("%"+String.valueOf(5+j/2)+"s").formatted("*".repeat(j)));
		}
		
	}
}
