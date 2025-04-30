/*************************************************************
 * Towers.java
 * Dean & Dean
 *
 * Esto usa un algoritmo recursivo para el problema de las Torres de Hanoi.
 *************************************************************/
public class Towers
{
	public static void main(String[] args)
	{
		move(4, 'A', 'C', 'B');
	}
	// Mueve n discos de la fuente s al destino d usando la ubicación temporal t.
	private static void move(int n, char s, char d, char t)
	{
		System.out.printf(
				"call n=%d, s=%s, d=%s, t=%s\n", n, s, d, t);
		if (n == 1)
			// condición de detención recursiva
		{
			System.out.printf("move %d from %s to %s\n", n, s, d);
		}
		else
		{
			move(n-1, s, t, d); // fuente a temporal
			System.out.printf("move %d from %s to %s\n", n, s, d);
			move(n-1, t, d, s); // temporal a destino
		}
		System.out.println("return n=" + n);
	}
} // end class Towers
