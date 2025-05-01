// Fig. 6.10: SobrecargaMetodos.java
// Declaraciones de métodos sobrecargados.
public class SobrecargaMetodos
{
	// prueba los métodos cuadrado sobrecargados
	public static void main(String[] args)
	{
		System.out.printf(“El cuadrado del entero 7 es %d%n”, cuadrado(7)
				cuadrado(7));
		System.out.printf(“El cuadrado del double 7.5 es %f%n”, cuadrado(7.5)
				cuadrado(7.5));
	}
	// método cuadrado con argumento int
	public static int cuadrado(int valorInt)
	{
		System.out.printf(“%nSe llamo a cuadrado con argumento int: %d%n”,
				valorInt);
		return valorInt * valorInt;
	}
	// método cuadrado con argumento double
	public static double cuadrado(double valorDouble)
	{
		System.out.printf( “%nSe llamo a cuadrado con argumento double: %f%n”,
				valorDouble);
		return valorDouble * valorDouble;
	}
} // fin de la clase SobrecargaMetodos

