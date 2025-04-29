/********************************************************************
* MovingAverage.java
* Dean & Dean
*
* Este programa contiene una operación que desplaza cada elemento
* del arreglo al siguiente elemento más bajo y carga una nueva
* entrada en el elemento final.
********************************************************************/
import java.util.Scanner;
public class MovingAverage
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
int[] days = {9400, 9500, 9600, 9700}; // rising market
double sum;
int samples;
System.out.print("Introduzca el número de días a evaluar: ");
samples = stdIn.nextInt();
for (int j=0; j<samples; j++)
{
// shift down and sum
sum = 0.0;
for (int d=0; d<days.length-1; d++)
{
days[d] = days[d+1];
sum += days[d];
}
System.out.print("Enter next day's value: ");
days[days.length-1] = stdIn.nextInt();
sum += days[days.length-1];
System.out.printf(
"Moving average = %5.0f\n", sum / days.length);
}
} // end main
} // end class MovingAverage
