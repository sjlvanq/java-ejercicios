// Fig. 8.9: PruebaEmpleado.java
// Demostración de la composición.
public class PruebaEmpleado
{
	public static void main(String[] args)
	{
		Fecha nacimiento = new Fecha(7, 24, 1949);
		Fecha contratacion = new Fecha(3, 12, 1988);
		Empleado empleado = new
			w Empleado(“Bob”, “Blue”, nacimiento, contratacion);
		System.out.println(empleado);
	}
} // fin de la clase PruebaEmpleado

