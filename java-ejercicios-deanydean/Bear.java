/*************************************************************
* Bear.java
* Dean & Dean
*
* Esta clase modela un oso de juguete.
**************************************************************/
public class Bear
{
private final String MAKER; // fabricante del oso
private final String TYPE; // tipo de oso
//***********************************************************
public Bear(String maker, String type)
{
MAKER = maker;
TYPE = type;
}
//***********************************************************
public void display()
{
System.out.println(MAKER + " " + TYPE);
}
} // end Bear class
