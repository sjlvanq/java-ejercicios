/**************************************************
 * Carro4.java
 * Dean & Dean
 *
 * Esta clase almacena y trae los datos de un carro.
 **************************************************/
public class Carro4
{
	private String marca;
	private int anio;
	private String color;

	// marca del carro
	// año de manufactura del carro
	// color primario del carro

	//***********************************************
	public Carro4(String m, int y, String c)
	{
		this.marca = m;
		this.anio = y;
		this.color = c;
	} // end constructor

	//***********************************************
	public String getMarca()
	{
		return this.marca;
	} // fin getMarca
} // fin clase Carro4
