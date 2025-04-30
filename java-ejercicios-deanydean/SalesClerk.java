/******************************************************************
 * SalesClerk.java
 * Dean & Dean
 *
 * Esta clase almacena y recupera los datos de un empleado de ventas.
 *******************************************************************/
public class SalesClerk
{
	private String name;
	private double sales = 0.0;
	// nombre del empleado
	// ventas totales del empleado
	//***************************************************************
	public SalesClerk(String name)
	{
		this.name = name;
	}
	//***************************************************************
	public String getName()
	{
		return name;
	}
	public double getSales()
	{
		return sales;
	}
	//***************************************************************
	// Ajusta las ventas totales del empleado al sumar la venta que se ha pasado.
	public void adjustSales(double amount)
	{
		sales += amount;
	}
} // end class SalesClerk
