/********************************************************************
 * CourseDriver.java
 * Dean & Dean
 *
 * Esta clase crea un objeto curso y busca la identificación
 * de un estudiante dentro del objeto Course recientemente creado.
 ********************************************************************/
import java.util.Scanner;
public class CourseDriver
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int[] ids = {4142, 3001, 6020};
		Course course = new Course("CS101", ids, ids.length);
		int id;
		// se está buscando la identificación del estudiante
		int index;
		// Índice de la identificación buscada o -1 en caso de no encontrarla
		System.out.print("Enter 4-digit ID: ");
		id = stdIn.nextInt();
		index = course.findStudent(id);
		if (index >= 0)
		{
			System.out.println("búsqueda del índice de la identificación " + index);
		}
		else
		{
			System.out.println("no se encontró");
		}
	} // end main
} // end class CourseDriver
