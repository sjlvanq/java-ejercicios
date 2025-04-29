/*******************************************************************
* ArrayCopy.java
* Dean & Dean
*
* Esto copia un arreglo y modifica la copia.
********************************************************************/
public class ArrayCopy
{
public static void main(String[] args)
{
double[] pricesJanuary =
{1.29, 9.99, 22.50, 4.55, 7.35, 6.49};
double[] pricesFebruary = new double[pricesJanuary.length];
for (int i=0; i<pricesJanuary.length; i++)
{
pricesFebruary[i] = pricesJanuary[i];
}
pricesFebruary[1] = 10.99;
System.out.printf("%7s%7s\n", "Ene", "Feb");
for (int i=0; i<pricesJanuary.length; i++)
{
System.out.printf("%7.2f%7.2f\n",
pricesJanuary[i], pricesFebruary[i]);
}
} // end main
} // end class ArrayCopy
