// Fig. 3.1: Cuenta.java
// Clase Cuenta que contiene una variable de instancia llamada nombre
// y métodos para establecer y obtener su valor.
public class Cuenta
{
	private String nombre; // variable de instancia
	// método para establecer el nombre en el objeto
	public void establecerNombre(String nombre)
	{
		this.nombre = nombre; // almacenar el nombre
	}
	// método para obtener el nombre del objeto
	public String obtenerNombre()
	{
		return nombre; // devuelve el valor de nombre a quien lo invocó
	}
} // fin de la clase Cuenta
