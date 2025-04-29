/***********************************************************
* ControladorPersona.java
* Dean & Dean
*
* Esta clase es un controlador demostración para una clase persona.
***********************************************************/
public class ControladorPersona
{
public static void main(String[] args)
{
Persona persona1 = new Persona();
Persona persona2 = new Persona();
persona1.setNombre("Jonathan");
persona2.setNombre("Benji");
System.out.println(persona1.getNombre() + ", " +
persona2.getNombre());
persona1.intercambiarPersona(persona2);
System.out.println(persona1.getNombre() + ", " +
persona2.getNombre());
} // fin de main
} // fin de la clase ControladorPersona
