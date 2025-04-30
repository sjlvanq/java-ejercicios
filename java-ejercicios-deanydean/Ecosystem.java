/**************************************************************
 * Ecosystem.java
 * Dean & Dean
 *
 * Controlador para un sistema simple predador/presa (consumidor/
 * productor). Los objetos predador y presa son threads separados,
 * y encounter es un objeto que describe su relación.
 **************************************************************/
public class Ecosystem
{
	public static void main(String[] args)
	{
		Prey prey = new Prey();
		// thread del productor
		Predator predator = new Predator();
		// thread del consumidor
		Encounter encounter = new Encounter(prey, predator);
		// start threads
		prey.start();
		predator.start();
	} // end main
} // end Ecosystem class
