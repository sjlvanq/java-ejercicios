/**************************************************************
* StudentList2.java
* Dean & Dean
*
* Este programa gestiona una ArrayList de estudiantes.
**************************************************************/
import java.util.ArrayList;
public class StudentList2
{
private ArrayList<String> students = new ArrayList<String>();
//***********************************************************
public StudentList2(String[] names)
{
for (int i=0; i<names.length; i++)
{
students.add(names[i]);
}
} // end constructor
//***********************************************************
public void display()
{
for (int i=0; i<students.size(); i++)
{
System.out.print(students.get(i) + " ");
}
System.out.println();
} // end display
//**********************************************************
public String removeStudent(int index)
throws IndexOutOfBoundsException
{
return students.remove(index);
} // end removeStudent
} // end StudentList2
