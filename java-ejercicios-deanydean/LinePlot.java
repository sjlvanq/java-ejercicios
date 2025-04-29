/***************************************************************
* LinePlot.java
* Dean & Dean
*
* Este programa traza una línea como una serie de segmentos de línea
* especificados por el usuario.
***************************************************************/
import java.util.Scanner;
public class LinePlot
{
private int oldX = 0;
private int oldY = 0;

// oldX and oldY save previous point
// starting point is the origin (0,0)

//************************************************************
// Este método imprime la descripción de un segmento de línea desde
// el punto previo hasta el punto actual.
public void plotSegment(int x, int y)
{
System.out.println("Segmento nuevo = (" + oldX + "," + oldY +
")-(" + x + "," + y + ")");
oldX = x;
oldY = y;
} // end plotSegment
//************************************************************
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
LinePlot line = new LinePlot();
String xStr, yStr;
// coordenadas del punto en forma de String
int x, y;
// coordenadas del punto
System.out.print("Introduzca las coordenadas x & y (q para salir): ");
xStr = stdIn.next();
while (!xStr.equalsIgnoreCase("q"))
{
yStr = stdIn.next();
x = Integer.parseInt(xStr); 
y = Integer.parseInt(yStr); 
line.plotSegment(x, y);
System.out.print("Introduzca las coordenadas x & y (q para salir): ");
xStr = stdIn.next();
} // end while
} // end main
} // end class LinePlot
