/*******************************************************************
* ControladorAltura.java
* Dean & Dean
*
* Esta clase es un controlador demostración para una clase Altura.
*******************************************************************/
public class ControladorAltura
{
public static void main(String[] args)
{
Altura miAltura = new Altura();
miAltura.setAltura(72.0, "in");
miAltura.imprimir();
miAltura.setAltura(180.0);
miAltura.imprimir();
} // fin de main
} // fin de clase ControladorAltura
