/*****************************************************************
 * Student_jd.java
 * Dean & Dean
 *****************************************************************/
import java.util.Scanner;

/** Esta clase maneja el procesamiento del nombre de un estudiante. */
public class Student_jd
{
	private String first = ""; // nombre del estudiante
	private String last = ""; // apellido del estudiante
	//**************************************************************
	public Student_jd()
	{ }
	/**
	  Este constructor verifica que cada nombre que se ha pasado empiece
	  con mayúscula y luego continúe con minúsculas.
	  */

	public Student_jd(String first, String last)
	{
		setFirst(first);
		setLast(last);
	}
	//**************************************************************
	// Este método verifica que cada nombre que se ha pasado empiece
	// con mayúscula y siga con minúsculas.
	public void setFirst(String first)
	{
		// [A-Z][a-z]* is a regular expression. See API Pattern class.
		if (first.matches("[A-Z][a-z]*"))
		{
			this.first = first;
		}
		else
		{
			System.out.println(first + " es un nombre inválido.\n" +
					"Los nombres deben empezar con una mayúscula y tener" +
					" minúsculas a partir de ahí.");
		}
	} // end setFirst
	//**************************************************************
	// Este método verifica que el apellido empiece con mayúscula
	// y a partir de ahí sean minúsculas.
	public void setLast(String last)
	{
		// [A-Z][a-z]* es una expresión normal. Consulte la clase Pattern de API.
		if (last.matches("[A-Z][a-z]*"))
		{
			this.last = last;
		}
		else
		{
			System.out.println(last + " es un nombre inválido.\n" +
					"Los nombres deben empezar con una mayúscula y tener" +
					" minúsculas a partir de ahí.");
		}
	} // end setLast
	//**************************************************************
	// Imprime el nombre y el apellido del estudiante.
	public void printFullName()
	{
		System.out.println(first + " " + last);
	} // end printFullName
} // end class Student
