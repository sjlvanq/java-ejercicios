/*********************************************************************
 * CoinFlips.java
 * Dean & Dean
 *
 * Esto genera un histograma de lanzamientos de monedas.
 *********************************************************************/
public class CoinFlips
{
	public static void main(String[] args)
	{
		final int NUM_OF_COINS = 3;
		// número de repeticiones
		final int NUM_OF_REPS = 1000000; // de monedas
		// El arreglo frequency contiene el número de veces que ha
		// ocurrido un número particular de caras.
		int[] frequency = new int[NUM_OF_COINS + 1];
		int heads;
		// caras en el grupo actual de monedas
		double fractionOfReps; // conteo de caras / repeticiones
		int numOfAsterisks;
		// asteriscos en una barra del histograma
		for (int rep=0; rep<NUM_OF_REPS; rep++)
		{
			// perform a group of flips
			heads = 0;
			for (int i=0; i<NUM_OF_COINS; i++)
			{
				heads += (int) (Math.random() * 2);
			}
			frequency[heads]++;
			// actualiza la papelera idónea
		} // end for
		System.out.println(
				"Número de veces que ha ocurrido un conteo de cada cara:");
		for (heads=0; heads<=NUM_OF_COINS; heads++)
		{
			System.out.print(
					" " + heads + " " + frequency[heads] + " ");
			fractionOfReps = (float) frequency[heads] / NUM_OF_REPS;
			numOfAsterisks = (int) Math.round(fractionOfReps * 100);
			for (int i=0; i<numOfAsterisks; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		} // end for
	} // end main
} // end class CoinFlips
