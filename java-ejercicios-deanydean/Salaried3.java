/*********************************************
 * Salaried3.java
 * Dean & Dean
 *
 * Esta clase abstracta representa a los empleados asalariados.
 *********************************************/
public class Salaried3 extends Employee3
{
	protected double salary;

	//******************************************
	public Salaried3(String name, double salary)
	{
		super(name);
		this.salary = salary;
	} // end constructor
	//******************************************
	public double getPay()
	{
		double pay = salary;
		pay -= getFICA(pay);
		return pay;
	} // end getPay
} // end class Salaried3
