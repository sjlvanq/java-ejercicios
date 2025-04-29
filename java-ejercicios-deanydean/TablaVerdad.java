/************************************************************
* TablaVerdad.java
* Dean & Dean
*
* Esto prueba la equivalencia de dos expresiones de tipo boolean
************************************************************/
public class TablaVerdad
{
public static void main(String[] args)
{
boolean x = false;
boolean y = false;
boolean resultado1, resultado2;

System.out.println("x\ty\tresultado1\tresultado2");
for (int i=0; i<2; i++)
{
for (int j=0; j<2; j++)
{
resultado1 = !(x || y);
resultado2 = !x && !y;
System.out.println(x + "\t" + y +
"\t" + resultado1 + "\t" + resultado2);
y = !y;
} // fin para j
x = !x;
} // fin para i
} // fin del main
} // fin de la clase TablaVerdad
