/*
 * Dado un número saber si este es primo o no.
 */

public class NumeroPrimo
{
	public static void main (String[] args)
	{
		System.out.println(String.valueOf(esPrimo(
				Integer.parseInt(args[0]))));
	}
	private static boolean esPrimo (int numero) {
		for(int i=2; i<numero; i++) {
			if(numero%i==0) return false;
		} return true;
	}
}
