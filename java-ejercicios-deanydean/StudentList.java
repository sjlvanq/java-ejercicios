/******************************************************
* StudentList.java
* Dean & Dean
*
* Esta clase maneja una ArrayList de estudiantes.
******************************************************/
import java.util.ArrayList;
public class StudentList
{
ArrayList<String> students = new ArrayList<String>();
//***************************************************
public StudentList(String[] names)
{
for (int i=0; i<names.length; i++)
{
students.add(names[i]);
}
} // end constructor
//***************************************************
public void display()
{
for (int i=0; i<students.size(); i++)
{
System.out.print(students.get(i) + " ");
}
System.out.println();
} // end display
//***************************************************
public void removeStudent(int index)
{
students.remove(index);
} // end removeStudent
} // end StudentList
