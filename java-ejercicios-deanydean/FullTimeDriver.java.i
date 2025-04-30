/***************************************************************
 * FullTimeDriver.java
 * Dean & Dean
 *
 * Esto describe un empleado de tiempo completo.
 ***************************************************************/
public class FullTimeDriver
{
        public static void main(String[] args)
        {
                FullTime fullTimer = new FullTime("Shreya", 5733, 80000);
                fullTimer.display();
                System.out.println(fullTimer.getName());
        }
} // end FullTimeDriver class
