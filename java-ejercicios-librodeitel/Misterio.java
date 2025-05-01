// Ejercicio 4.16: Misterio.java
public class Misterio
{
	public static void main(String[] args)
	{
		int x = 1;
		int total = 0;
		while (x <= 10)
		{
			int y = x * x;
			System.out.println(y);
			total += y;
			++x;
		}
		System.out.printf("El total es %d%n", total);
	}
} // fin de la clase Misterio

