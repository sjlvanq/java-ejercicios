/**********************************************************
* Square.java
* Dean & Dean
*
* Esta clase administra cuadrados.
**********************************************************/
import java.util.Scanner;
public class Square
{
private int width;
//********************************************************
public Square(int width)
{
this.width = width;
}
//********************************************************
public double getArea()
{
return this.width * this.width;
}
//********************************************************
public void draw()
{
Scanner stdIn = new Scanner(System.in);
System.out.print("Print with (b)order or (s)olid? ");
if (stdIn.nextLine().charAt(0) == 'b')
{
drawBorderSquare();
}
else
{
drawSolidSquare();
}
} // end draw
//*****************************************************
private void drawBorderSquare()
{
drawHorizontalLine();
drawSides();
drawHorizontalLine();
} // end drawBorderSquare
//*****************************************************
private void drawSolidSquare()
{
for (int i=0; i<this.width; i++)
{
drawHorizontalLine();
}
} // end drawSolidSquare
//*****************************************************
private void drawHorizontalLine()
{
for (int i=0; i<this.width; i++)
{
System.out.print("*");
}
System.out.println();
} // end drawHorizontalLine
//*****************************************************
private void drawSides()
{
for (int i=1; i<(this.width-1); i++)
{
System.out.print("*");
for (int j=1; j<(this.width-1); j++)
{
System.out.print(" ");
}
System.out.println("*");
}
} // end drawSides
} // end class Square
