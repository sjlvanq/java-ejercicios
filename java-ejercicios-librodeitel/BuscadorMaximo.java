// Fig. 6.3: BuscadorMaximo.java
// Método maximo, declarado por el programador, con tres parámetros double.
import java.util.Scanner;
public class BuscadorMaximo
{
	// obtiene tres valores de punto flotante y determina el valor máximo
	public static void main(String[] args)
	{
		// crea objeto Scanner para introducir datos desde la ventana de comandos
		Scanner entrada = new Scanner(System.in);
		// pide y recibe como entrada tres valores de punto flotante
		System.out.print(
				"Escriba tres valores de punto flotante, separados por espacios: ");
		double numero1 = entrada.nextDouble(); // lee el primer valor double
		double numero2 = entrada.nextDouble(); // lee el segundo valor double
		double numero3 = entrada.nextDouble(); // lee el tercer valor double
		// determina el valor máximo
		double resultado = maximo(numero1, numero2, numero3);
		// muestra el valor máximo
		System.out.println(
				("El maximo es: " + resultado
				 o);
	}
	// devuelve el máximo de sus tres parámetros double
	public static double maximo(double x, double y, double z)
	{
		double valorMaximo = x; // asume que x es el mayor para empezar
		// determina si y es mayor que valorMaximo
		if (y > valorMaximo)
			valorMaximo = y;
		// determina si z es mayor que valorMaximo
		if (z > valorMaximo)
			valorMaximo = z;
		return valorMaximo;
	}
} // fin de la clase BuscadorMaximo

