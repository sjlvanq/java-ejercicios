/*****************************************************
 * ControladorRaton2.java
 * Dean & Dean
 *
 * Éste es un controlador para la clase Raton.
 *****************************************************/
import java.util.Scanner;
public class ControladorRaton2
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		double tasaCrecimiento;

		System.out.print("Introduzca % de tasa de crecimiento: ");
		tasaCrecimiento = stdIn.nextDouble();

		Raton gus = new Raton();
		gus.setTasaCrecimientoPorcentual(tasaCrecimiento); 
		gus.crecer();
		gus.desplegar();
		Raton jaq = new Raton();
		jaq.crecer();
		jaq.desplegar();
	} // fin del main
} // fin de la clase ControladorRaton2
