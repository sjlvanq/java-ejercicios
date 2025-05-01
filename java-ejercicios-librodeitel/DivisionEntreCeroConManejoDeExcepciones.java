// Fig. 11.3: DivisionEntreCeroConManejoDeExcepciones.java
// Manejo de excepciones ArithmeticException e InputMismatchException.
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionEntreCeroConManejoDeExcepciones
{
	// demuestra cómo se lanza una excepción cuando ocurre una división entre cero
	public static int cociente(int numerador, int denominador)
			throws ArithmeticException
		{
			return numerador / denominador; // posible división entre cero
		}
	public static void main(String[] args)
	{
		Scanner explorador = new Scanner(System.in);
		boolean continuarCiclo = true; // determina si se necesitan más datos de
		entrada
			do
			{
				try // lee dos números y calcula el cociente
				{
					System.out.print("Introduzca un numerador entero: ");
					int numerador = explorador.nextInt();
					System.out.print("Introduzca un denominador entero: ");
					int denominador = explorador.nextInt();
					int resultado = cociente(numerador, denominador);
					System.out.printf("%nResultado: %d / %d = %d%n", numerador,
							denominador, resultado);
					continuarCiclo = false; // entrada exitosa; termina el ciclo
				}
				catch (InputMismatchException inputMismatchException)
				{
					System.err.printf("%nExcepcion: %s%n",
							inputMismatchException);
					explorador.nextLine(); // descarta entrada para que el usuario
					intente otra vez
						System.out.println(
								"Debe introducir enteros. Intente de nuevo.%n%n");
				}
				catch (ArithmeticException arithmeticException)
				{
					System.err.printf("%nExcepcion: %s%n", arithmeticException);
					System.out.printf(
							"Cero es un denominador invalido. Intente de nuevo.%n%n");
				}
			} while (continuarCiclo);
	}
} // fin de la clase DivisionEntreCeroConManejoDeExcepciones

