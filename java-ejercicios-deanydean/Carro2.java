/****************************************************************
 * Carro2.java
 * Dean & Dean
 *
 * Esta clase implementa la funcionalidad equals para un carro.
 ****************************************************************/
public class Carro2
{
	private String marca;
	private int anio;
	private String color;
	//************************************************************
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	public void setAnio(int anio)
	{
		this.anio = anio;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	//************************************************************
	// Este método verifica si dos carros contienen los mismos datos.
	public boolean equals(Carro2 otroCarro)
	{
		return this.marca.equals(otroCarro.marca) &&
			this.anio == otroCarro.anio &&
			this.color.equals(otroCarro.color);
	} // fin de equals
} // fin de la clase Carro2
