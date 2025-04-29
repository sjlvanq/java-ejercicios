/***************************************************************
* Persona.java
* Dean & Dean
*
* Esta clase almacena, trae e intercambia el nombre de una persona.
***************************************************************/
public class Persona
{
private String nombre;
//************************************************************
public void setNombre(String nombre)
{
this.nombre = nombre;
}
public String getNombre()
{
return this.nombre;
}
//************************************************************
// Este método intercambia los nombres de dos objetos Persona.
public void intercambiarPersona(Persona otraPersona)
{
String temp;
temp = otraPersona.nombre;
otraPersona.nombre = this.nombre;
this.nombre = temp;
} // fin intercambiarPersona
} // fin de la clase Persona
