/****************************************************************
* CodigoPostal.java
* Dean & Dean
*
* Este programa identifica la región geográfica de acuerdo con el código postal.
******************************************************************/
import java.util.Scanner;
public class CodigoPostal
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
String cp; // c.p. introducido por el usuario
System.out.print("Introduzca código postal: ");
cp = stdIn.nextLine();
switch (cp.charAt(0))
{
case '0': case '2': case '3':
System.out.println(cp + " está en la Costa Este.");
break;
case '4': case '5': case '6':
System.out.println(
cp + " está en el área del Plano Central.");
break;
case '7':
System.out.println(cp + " está en el Sur.");
break;
case '8': case '9':
System.out.println(cp + " está en el Oeste.");
break;
default:
System.out.println(cp + " es un código postal inválido.");
} // fin del switch
} // fin del main
} // fin de la clase CodigoPostal
