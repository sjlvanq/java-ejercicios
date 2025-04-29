/*********************************************************************
* Student.java
* Dean & Dean
*
* Esta clase se encarga del procesamiento del nombre de un estudiante.
*********************************************************************/
import java.util.Scanner;
public class Student
{
private String first = ""; // nombre del estudiante
private String last = ""; // apellido del estudiante
//******************************************************************
public Student()
{ }
// Este constructor verifica que cada nombre empiece
// con una mayúscula y siga con minúsculas.
public Student(String first, String last)
{
setFirst(first);
setLast(last);
}
//******************************************************************
// Este método verifica que el nombre empiece con una mayúscula
// y a partir de ahí contenga minúsculas.
public void setFirst(String first)
{
// [A-Z][a-z]* es una expresión regular. Consulte la clase API Pattern.
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
//********************************************************************
// Este método verifica que el apellido empiece con una mayúscula
// y a partir de ahí tenga minúsculas.
public void setLast(String last)
{
// [A-Z][a-z]* es una expresión regular. Consulte la clase API Pattern.
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
//*******************************************************************
// Imprimir el nombre y el apellido del estudiante.
public void printFullName()
{
System.out.println(this.first + " " + this.last);
} // end printFullName
} // end class Student

