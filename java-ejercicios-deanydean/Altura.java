/***********************************************************
 * Altura.java
 * Dean & Dean
 *
 * Esta clase almacena e imprime valores de altura.
 ***********************************************************/
class Altura
{
	double altura;
	String unidades;

	// altura de una persona
	// como cm para centímetros

	//********************************************************
	public void setAltura(double altura)
	{
		this.altura = altura;
		this.unidades = "cm";
	}
	//********************************************************
	public void setAltura(double altura, String unidades)
	{
		this.altura = altura;
		this.unidades = unidades;
	}
	//********************************************************
	public void imprimir()
	{
		System.out.println(this.altura + " " + this.unidades);
	}
} // fin de la clase Altura
