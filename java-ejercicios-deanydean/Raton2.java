/*****************************************************************
 * Raton2.java
 * Dean & Dean
 *
 * Esta clase modela un ratón para un programa de simulación de crecimiento.
 *****************************************************************/
import java.util.Scanner;
public class Raton2
{
	private int edad = 0;
	private double peso = 1.0;
	private double tasaCrecimientoPorcentual;

	// edad en días
	// peso en gramos
	// % aumento diario de peso

	//**************************************************************
	public void setTasaCrecimientoPorcentual(double tasaCrecimientoPorcentual)
	{
		this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
	} // fin de setTasaCrecimientoPorcentual
	//**************************************************************
	public int getEdad()
	{
		return this.edad;
	} // fin de getEdad
	//**************************************************************
	public double getPeso()
	{
		return this.peso;
	} // fin de getPeso

	//**************************************************************
	public void crecer(int dias)
	{
		for (int i=0; i<dias; i++)
		{
			this.peso +=
				(0.01 * this.tasaCrecimientoPorcentual * this.peso);
		}
		this.edad += dias;
	} // fin de crecer
} // fin de clase Raton2
