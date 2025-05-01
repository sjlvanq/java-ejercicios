// Fig. 3.5: Cuenta.java
// Clase Cuenta con un constructor que inicializa el nombre.
public class Cuenta
{
	private String nombre;// variable de instancia
	// el constructor inicializa nombre con el parámetro nombre
	public Cuenta(String nombre)// el nombre del constructor es el nombre de la clase
	{
		this.nombre = nombre;
	}
	// método para establecer el nombre
	public void establecerNombre(String nombre)
	{
		this.nombre = nombre;
	}
	// métodos para recuperar el nombre
	public String obtenerNombre()
	{
		return nombre;
	}
} // fin de la clase Cuenta
