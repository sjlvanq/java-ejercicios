/********************************************************
* ControladorCarro.java
* Dean & Dean
*
* Esta clase demuestra la copia de un objeto.
********************************************************/
public class ControladorCarro
{
public static void main(String[] args)
{
Carro carroJohn = new Carro();
Carro carroStacy;
carroJohn.setMarca("Honda");
carroJohn.setAño(2003);
carroJohn.setColor("plata");
carroStacy = carroJohn.crearCopia();
carroStacy.setColor("durazno");
System.out.println("Carro de John:");
carroJohn.desplegar();
System.out.println("Carro de Stacy:");
carroStacy.desplegar();
} // fin de main
} // fin de clase ControladorCarro
