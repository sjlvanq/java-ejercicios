/**************************************************************
 * PennyJarDriver.java
 * Dean & Dean
 *
 * Esta clase controla la clase PennyJar.
 **************************************************************/
public class PennyJarDriver
{
	public static void main(String[] args)
	{
		PennyJar pennyJar1 = new PennyJar();
		PennyJar pennyJar2 = new PennyJar();
		pennyJar1.addPenny();
		pennyJar1.addPenny();
		pennyJar2.addPenny();
		System.out.println(pennyJar1.getPennies());
		System.out.println(PennyJar.getAllPennies());
	} // end main
} // end class PennyJarDriver
