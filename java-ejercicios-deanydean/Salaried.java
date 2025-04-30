/**********************************************
 * Salaried.java
 * Dean & Dean
 *
 * Esta clase implementa un empleado asalariado.
 **********************************************/
public class Salaried extends Employee
{
	private double salary;
	// al año
	//*******************************************
	public Salaried(String name, double salary)
	{
		super(name);
		this.salary = salary;
	} // end constructor
	//*******************************************
	public double getPay()
	{
		return this.salary / 24;
	} // end getPay
} // end class Salaried
