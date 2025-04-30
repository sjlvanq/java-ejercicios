/*************************************************************
 * Payroll.java
 * Dean & Dean
 *
 * Esta clase contrata y paga a empleados.
 *************************************************************/
public class Payroll
{
	public static void main(String[] args)
	{
		Employee[] employees = new Employee[100];
		Hourly hourly;
		employees[0] = new Hourly("Anna", 25.0);
		employees[1] = new Salaried("Simon", 48000);
		employees[2] = new Hourly("Donovan", 20.0);
		// Esto supone arbitrariamente que el mes de la nómina
		// empieza un martes (día = 2), y que contiene 30 días.
		for (int date=1,day=2; date<=15; date++,day++,day%=7)
		{
			for (int i=0;
					i<employees.length && employees[i] != null; i++)
			{
				if (day > 0 && day < 6
						&& employees[i] instanceof Hourly)
				{
					hourly = (Hourly) employees[i];
					hourly.addHours(8);
				}

				if ((day == 5 && employees[i] instanceof Hourly) ||
						(date%15 == 0 && employees[i] instanceof Salaried)) 
				{
					employees[i].printPay(date);

				}
			} // end for i
		} // end for date
	} // end main
} // end class Payroll
