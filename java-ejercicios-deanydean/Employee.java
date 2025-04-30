/************************************************
 * Employee.java
 * Dean & Dean
 *
 * Ésta es una descripción genérica de un empleado.
 ************************************************/
public class Employee
{
	private String name;
	//*********************************************
	public Employee(String name)
	{
		this.name = name;
	}
	//*********************************************
	public void printPay(int date)
	{
		System.out.printf("%2d %10s: %8.2f\n",
				date, name, getPay());
	} // end printPay
	//*********************************************
	// Este método inválido satisface al compilador.
	public double getPay()
	{
		System.out.println("error! en inválido");
		return 0.0;
	} // end getPay

	public String getName(){
		return this.name;
	}

} // end class Employee
