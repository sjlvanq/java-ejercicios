/***********************************************************************
* ConvertidorDeTemperatura.java
* Dean & Dean
*
* Este programa convierte temperaturas de grados Fahrenheit a grados Celsius
***********************************************************************/
public class ConvertidorDeTemperatura
{
public static void main(String[] args)
{
final double PUNTO_CONGELACION = 32.0;
final double FACTOR_CONVERSION = 5.0 / 9.0;
double fahrenheit = 50;
// temperatura en Fahrenheit
double celsius;
// temperatura en Celsius
celsius = FACTOR_CONVERSION * (fahrenheit - PUNTO_CONGELACION);
System.out.println(fahrenheit + " grados Fahrenheit = " +
celsius + " grados Celsius.");
} // fin del main
} // fin de la clase convertidorDeTemperatura
