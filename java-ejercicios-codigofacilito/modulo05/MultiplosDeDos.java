/*
 * Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará 
 * cuando el último múltiplo sea menor a 4570
 */

public class MultiplosDeDos
{
	public static void main (String[] args)
	{
		for (int i = 1; i < 4570; i*=2)
			System.out.printf("%d ".formatted(i));
		System.out.println();
	}
}
