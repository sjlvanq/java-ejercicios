/*************************************************************
 * FullTime.java
 * Dean & Dean
 *
 * Esto describe un empleado de tiempo completo.
 *************************************************************/
public class FullTime extends Employee
{
        private double salary = 0.0;
        //**********************************************************
        public FullTime(String name, int id, double salary)
        {
                super(name);
                this.salary = salary;
        }
        //**********************************************************
        public void display()
        {
                super.display();
                System.out.printf(
                                "salary: $%,.0f\n", salary);
        }
} // end FullTime class
