/******************************************************************
 * ControladorCrecimiento.java
 * Dean & Dean
 *
 * Este programa compara las soluciones exacta y simulada para el crecimiento.
 ******************************************************************/
import java.util.Scanner;
public class ControladorCrecimiento
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		double incTiempo;
		double tiempoMax;
		Crecimiento entidad = new Crecimiento();
		double tamañoInicio = 1.0;
		// peso en gramos
		double tamañoFinal = 40.0;
		// peso en gramos
		double fraccionTasaCrecimiento = 1.0; // por unidad de tiempo
		double tamaño = tamañoInicio;

		entidad.inicializar(tamañoInicio, tamañoFinal, fraccionTasaCrecimiento);
		System.out.print("Introduzca el incremento de tiempo: ");
		incTiempo = stdIn.nextDouble();
		System.out.print("Introduzca las unidades de tiempo total a simular: ");
		tiempoMax = stdIn.nextDouble();
		System.out.println("tiempo exacto simulado");
		System.out.println("         tamaño tamaño");
		for (double tiempo=0.0; tiempo<=tiempoMax; tiempo+=incTiempo)
		{
			System.out.printf("%4.1f%8.1f%8.1f\n",
					tiempo, entidad.getTamaño(tiempo), tamaño);
			tamaño += entidad.getTamañoIncremento(tamaño, incTiempo);
		} // fin del for
	} // fin del main
} // fin de la clase ControladorCrecimiento
