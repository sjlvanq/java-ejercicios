/***************************************************************
 * Carro.java
 * Dean & Dean
 *
 * Esta clase implementa una copia de la funcionalidad para un carro.
 ***************************************************************/
public class Carro
{
	private String marca;
	private int anio;
	private String color;

	// marca del carro
	// año de manufactura del carro
	// color primario del carro

	//************************************************************
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	public void setAño(int anio)
	{
		this.anio = anio;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	//************************************************************
	public Carro crearCopia()
	{
		Carro carro = new Carro();
		carro.marca = this.marca;
		carro.anio = this.anio;
		carro.color = this.color;
		return carro;
	} // fin de crearCopia

	//************************************************************
	public void desplegar()
	{
		System.out.printf("marca= %s\naño= %s\ncolor= %s\n",
				this.marca, this.anio, this.color);
	} // fin de desplegar
} // fin de la clase Carro
