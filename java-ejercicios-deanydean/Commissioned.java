/****************************************************************
 * Commissioned.java
 * Dean & Dean
 *
 * Esta clase representa empleados con comisión directa.
 ****************************************************************/
public class Commissioned extends Employee2 implements Commission
{
	private double sales = 0.0;
	//*************************************************************
	public Commissioned(String name)
	{
		super(name);
		this.sales = sales;
	} // end constructor
	//*************************************************************
	public void addSales(double sales)
	{
		this.sales += sales;
	} // end addSales

	//*************************************************************
	public double getPay()
	{
		double pay = COMMISSION_RATE * sales;
		sales = 0.0;
		return pay;
	} // end getPay
} // end class Commissioned
