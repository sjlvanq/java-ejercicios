/********************************************************************
 * Survivor.java
 * Dean & Dean
 *
 * Esta clase crea una ArrayList de sobrevivientes.
 * Escoge al azar un miembro de la tribu y lo elimina.
 ********************************************************************/
import java.util.ArrayList;
public class Survivor
{
	public static void main(String[] args)
	{
		int loserIndex;
		String loser;
		ArrayList<String> tribe = new ArrayList<String>();
		tribe.add("Richard");
		tribe.add("Jerri");
		tribe.add("Colby");
		tribe.add("Amber");
		tribe.add("Rupert");
		loserIndex = (int) (Math.random() * tribe.size());
		loser = tribe.remove(loserIndex);
		System.out.println("Lo siento, " + loser +
				". La tribu ha hablado. Debes irte de inmediato.");
		System.out.println("Remaining: " + tribe);
	} // end main
} // end Survivor
