/*******************************************************
* Person.java
* Dean & Dean
*
* Ésta es una clase base para una jerarquía de la herencia.
*******************************************************/
public class Person
{
private String name = "";
//****************************************************
public Person()
{ }
public Person(String name)
{
this.name = name;
}
//****************************************************
public String getName()
{
return this.name;
}
} // end Person class
