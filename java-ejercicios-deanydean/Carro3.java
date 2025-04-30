/**********************************************************
 * Carro3.java
 * Dean & Dean
 *
 * Esta clase ilustra métodos que pueden ser encadenados.
 **********************************************************/
public class Carro3
{
	private String marca;
	private int anio;
	//*******************************************************

	public Carro3 setMarca(String marca)
	{
		this.marca = marca;
		return this;
	} // end setMake
	public Carro3 setAnio(int anio)
	{
		this.anio = anio;
		return this;
	} // end setYear
	//*******************************************************
	public void Imprimelo()
	{
		System.out.println(marca + ", " + anio);
	} // fin de Imprimelo
} // fin de la clase Carro3
