// Fig. 7.20: PruebaVarargs.java
// Uso de listas de argumentos de longitud variable.
public class PruebaVarargs
{
	// calcula el promedio
	public static double promedio(double... numeros)
	{
		double total = 0.0;
		// calcula el total usando la instrucción for mejorada
		for (double d : numeros)
			total += d;
		return total / numeros.length
			numeros.length;
	}
	public static void main(String[] args)
	{
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;
		System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n",
				d1, d2, d3, d4);
		System.out.printf("El promedio de d1 y d2 es %.1f%n",
				promedio(d1, d2) );
		System.out.printf("El promedio de d1, d2 y d3 es %.1f%n",
				promedio(d1, d2, d3) );
		System.out.printf("El promedio de d1, d2, d3 y d4 es %.1f%n",
				promedio(d1, d2, d3, d4) );
	}
} // fin de la clase PruebaVarargs

