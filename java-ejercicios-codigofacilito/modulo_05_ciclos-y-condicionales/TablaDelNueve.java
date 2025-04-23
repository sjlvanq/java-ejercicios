/*
 *  Imprimir en consola la tabla de multiplicar del número 9.
 */

public class TablaDelNueve
{
	public static void main (String[] args)
	{
		for (int i = 0, j = 9; i<9 && j>0; i++, j--) {
			System.out.println("%d%d".formatted(i,j));
		}
	}
}
