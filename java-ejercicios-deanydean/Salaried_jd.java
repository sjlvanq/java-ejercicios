/*************************************************************
* Salaried_jd.java
* Dean & Dean
*************************************************************/
/**
Esta clase implementa un empleado asalariado.
Tiene la misma funcionalidad que la clase Salaried en el capítulo 13.
*/
public class Salaried_jd extends Employee
{
private double salary;
//**********************************************************
/**
@param name
@param salary
*/


public Salaried_jd(String name, double salary)
{
super(name);
this.salary = salary;
} // end constructor
//**********************************************************
//** @return

public double getPay()
{
return this.salary / 24;
} // end getPay
} // end class Salaried_jd
