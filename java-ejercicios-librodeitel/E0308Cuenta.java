
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

public class E0308Cuenta {
	private String nombre;
	private double saldo;

	// Constructor
	public E0308Cuenta(String nombre, double saldo)
	{
		this.nombre = nombre;
		if (saldo>0.0)
			this.saldo = saldo;
	}

	public void depositar(double montoDeposito)
	{
		if(montoDeposito>0.0)
			saldo = saldo + montoDeposito;
	}

	public double obtenerSaldo()
	{
		return saldo;
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
