/********************************************************************
 * Crecimiento.java
 * Dean & Dean
 *
 * Éste proporciona formas diferentes de calcular crecimiento.
 ********************************************************************/
public class Crecimiento
{
	private double tamañoInicio;
	private double tamañoFinal;
	private double fraccionTasaCrecimiento;

	// tamaño inicial
	// tamaño maximo
	// por unidad de tiempo

	//*****************************************************************
	public void inicializar(double inicio, double fin, double factor)
	{
		this.tamañoInicio = inicio;
		this.tamañoFinal = fin;
		this.fraccionTasaCrecimiento = factor;
	} // fin de inicializar
	//*****************************************************************
	public double getTamaño(double tiempo)
	{
		double g0 = Math.log(tamañoInicio / (1.0 - tamañoInicio / tamañoFinal));
		return 1.0 / (1.0 / tamañoFinal +
				Math.exp(-(fraccionTasaCrecimiento * tiempo + g0)));
	} // fin de getTamaño
	//*****************************************************************
	public double getTamañoIncremento(double tamaño, double avanceTiempo)
	{
		return fraccionTasaCrecimiento *
			tamaño * (1.0 - tamaño / tamañoFinal) * avanceTiempo;
	} // fin de getTamañoIncremento
} // fin clase Crecimiento
