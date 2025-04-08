
//UML:
/*
         E0305Cuenta
--------------------------------------------
«constructor» E0305Cuenta( nombre: String )
-nombre: String
---------------------------------------------
+establecerNombre ( nombre: String )
+obtenerNombre(): String
---------------------------------------------
*/

public class E0305Cuenta {
	private String nombre;

	// Constructor
	public E0305Cuenta(String nombre)
	{
		this.nombre = nombre;
	}

	public void establecerNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String obtenerNombre() 
	{
		return this.nombre;
	}
}
