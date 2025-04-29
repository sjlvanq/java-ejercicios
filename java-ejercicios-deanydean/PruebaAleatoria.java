/******************************************************************
* PruebaAleatoria.java
* Dean & Dean
*
* Este programa ejecuta métodos de la clase Random.
******************************************************************/
import java.util.Random;
public class PruebaAleatoria
{
public static void main(String[] args)
{
Random aleatorio = new Random();

System.out.println(aleatorio.nextInt(Integer.MAX_VALUE));
System.out.println(5.0 + 0.8 * aleatorio.nextGaussian());
} // fin del main
} // fin de la clase PruebaAleatoria
