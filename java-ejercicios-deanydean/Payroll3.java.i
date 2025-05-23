/**************************************************************
 * Payroll3.java
 * Dean & Dean
 *
 * Esta clase contrata y paga a cuatro tipos distintos de empleados.
 **************************************************************/
public class Payroll3
{
        public static void main(String[] args)
        {
                Employee2[] employees = new Employee2[100];
                Hourly2 hourly;
                employees[0] = new Hourly2("Anna", 25.0);
                employees[1] = new Salaried2("Simon", 48000);
                employees[2] = new Hourly2("Donovan", 20.0);
                employees[3] = new Commissioned("Glen");
                employees[4] = new SalariedAndCommissioned("Carol", 24000);
                ((Commission) employees[3]).addSales(15000);
                ((Commission) employees[4]).addSales(15000);
                // Esto supone arbitrariamente que el mes de la nómina empieza
                // un martes (día = 2), y que contiene 30 días.
                for (int date=1,day=2; date<=15; date++,day++,day%=7)
                {
                        for (int i=0;
                                        i<employees.length && employees[i] != null; i++)
                        {
                                if (day > 0 && day < 6
                                                && employees[i] instanceof Hourly2)
                                {
                                        hourly = (Hourly2) employees[i];
                                        hourly.addHours(8);
                                }
                                if ((day == 5 && employees[i] instanceof Hourly2) ||
                                                (date%15 == 0 &&
                                                 (employees[i] instanceof Salaried2 ||
                                                  employees[i] instanceof Commissioned)))
                                {
                                        employees[i].printPay(date);
                                }
                        } // end for i
                } // end for date
        } // end main
} // end class Payroll3
