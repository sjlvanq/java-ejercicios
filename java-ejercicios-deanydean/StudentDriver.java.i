/*******************************************************
 * StudentDriver.java
 * Dean & Dean
 *
 * Esta clase actúa como controlador de la clase Estudiante.
 ********************************************************/
public class StudentDriver
{
        public static void main(String[] args)
        {
                Estudiante s1; // primer estudiante
                Estudiante s2; // segundo estudiante
                s1 = new Student();
                s1.setFirst("Adeeb");
                s1.setLast("Jarrah");
                s2 = new Student("Heejoo", "Chun");
                s2.printFullName();
        } // end main
} // end class StudentDriver
