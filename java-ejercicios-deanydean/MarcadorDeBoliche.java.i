/*************************************************************
* MarcadorDeBoliche.java
* Dean & Dean
*
* Este programa implementa un algoritmo e marcador en el boliche.
*************************************************************/
import java.util.Scanner;
public class MarcadorDeBoliche
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
int marcador;
int marcadorTotal = 0;
int cuenta = 0;
double promedio;
System.out.print("Introduzca el marcador (-1 para salir): ");
score = stdIn.nextInt();
while (marcador >= 0)
{
marcadorTotal += marcador;
cuenta++;
System.out.print("Introduzca el marcador (-1 para salir): ");
marcador = stdIn.nextInt();
}
promedio = (double) marcadorTotal / cuenta;
System.out.println("El marcador promedio es " + promedio);
} // fin del main
} // fin de la clase MarcadorDeBoliche
