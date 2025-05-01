// Ejercicio 4.6: Calcular.java
// Calcula la suma de los enteros del 1 al 10
public class Calcular
{
	public static void main(String[] args)
	{
		int suma = 0;
		int x = 1;
		while (x <= 10) // mientras que x sea menor o igual que 10
		{
			suma += x; // suma x a suma
			++x; // incrementa x
		}
		System.out.printf("La suma es: %d%n", suma);
	}
} // fin de la clase Calcular

