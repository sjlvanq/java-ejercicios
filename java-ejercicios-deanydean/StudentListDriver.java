/*************************************************************
* StudentListDriver.java
* Dean & Dean
*
* Éste es el controlador de la clase StudentList.
*************************************************************/
public class StudentListDriver
{
public static void main(String[] args)
{
String[] names = {"Caleb", "Izumi", "Mary", "Usha"};
StudentList studentList = new StudentList(names);
studentList.display();
studentList.removeStudent(6);
studentList.display();
} // end main
} // end StudentListDriver
