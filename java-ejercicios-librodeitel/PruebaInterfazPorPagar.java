// Fig. 10.15: PruebaInterfazPorPagar.java
// Programa de prueba de la interfaz PorPagar que procesa objetos
// Factura y Empleado mediante el polimorfismo.
public class PruebaInterfazPorPagar
{
	public static void main(String[] args)
	{
		// crea arreglo PorPagar con cuatro elementos
		PorPagar[] objetosPorPagar = new PorPagar[4];
		// llena el arreglo con objetos que implementan la interfaz PorPagar
		objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
		objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
		objetosPorPagar[2] =
			new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
		objetosPorPagar[3] =
			new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
		System.out.println(
				"Facturas y Empleados procesados en forma polimorfica:");
		// procesa en forma genérica cada elemento en el arreglo objetosPorPagar
		for (PorPagar porPagarActual : objetosPorPagar)
		{
			// imprime porPagarActual y su monto de pago apropiado
			System.out.printf("%n%s %n%s: $%,.2f%n",
					porPagarActual.toString(), // se podría invocar de manera implícita
					"pago vencido", porPagarActual.obtenerMontoPago());
		}
	} // fin de main
} // fin de la clase PruebaInterfazPorPagar

