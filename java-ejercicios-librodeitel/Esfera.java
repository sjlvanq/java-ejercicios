// Ejercicio 6.6: Esfera.java
// Calcula el volumen de una esfera.
import java.util.Scanner;
public class Esfera
{
	// obtiene el radio del usuario y muestra el volumen de la esfera
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escriba el radio de la esfera: ");
		double radio = entrada.nextDouble();
		System.out.printf("El volumen es %f%n", volumenEsfera(radio));
	} // fin de main
	// calcula y devuelve el volumen de una esfera
	public static double volumenEsfera(double radio)
	{
		double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
		return volumen;
	} // fin del método volumenEsfera
} // fin de la clase Esfera

