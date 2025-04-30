/*********************************************************************
 * Course.java
 * Dean & Dean
 *
 * Esta clase representa un curso particular en una escuela.
 **********************************************************************/
public class Course
{
	private String courseName;
	private int[] ids;
	private int filledElements;

	// nombre del curso
	// identificaciones de los estudiantes en el curso
	// número de elementos ocupados

	//*******************************************************************
	public Course(String courseName, int[] ids, int filledElements)
	{
		this.courseName = courseName;
		this.ids = ids;
		this.filledElements = filledElements;
	} // end constructor
	//*******************************************************************
	// Este método devuelve el índice de la identificación encontrada o ⫺1 si no
	// se encontró la identificación.
	public int findStudent(int id)
	{
		for (int i=0; i<filledElements; i++)
		{
			if (ids[i] == id)
			{
				return i;
			}
		} // end for
		return -1;
	} // end findStudent
} // end class Course
