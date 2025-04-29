/*************************************************
* SalesPerson.java
* Dean & Dean
*
* Esta clase implementa un vendedor de automóviles.
*************************************************/
public class SalesPerson
{
private String name;
private double sales = 0.0; // sales to date
//**********************************************
public SalesPerson(String name)
{
this.name = name;
}
//**********************************************
public String getName()
{
return name;
}
} // end SalesPerson class
