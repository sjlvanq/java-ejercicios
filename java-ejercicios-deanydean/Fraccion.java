/**************************************************************
 * Fraccion.java
 * Dean & Dean
 *
 * Esta clase almacena e imprime fracciones.
 **************************************************************/
public class Fraccion
{
	private int numerador;
	private int denominador;
	private double cociente;
	//***********************************************************
	public Fraccion(int n)
	{
		this(n, 1);
	}


	//***********************************************************
	public Fraccion(int n, int d)
	{
		this.numerador = n;
		this.denominador = d;
		this.cociente = (double) this.numerador / this.denominador;
	}
	//***********************************************************
	public void Imprimelo()
	{
		System.out.println(this.numerador + " / " +
				this.denominador + " = " + this.cociente);
	} // fin de Imprimelo
} // fin de clase Fraccion
