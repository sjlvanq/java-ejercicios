/**
 * https://www.aluracursos.com/blog/ordenando-colecciones-con-comparable-y-comparator?utm_source=gnarus&utm_medium=timeline
 */
  
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Mate> rondas = new ArrayList<>();
		rondas.add(new Mate(Yerbas.AMANDA, TiposDeMate.AMARGO));
		rondas.add(new Mate(Yerbas.PLAYADITO, TiposDeMate.DULCE));
		rondas.add(new Mate(Yerbas.AMANDA, TiposDeMate.DULCE));
		rondas.add(new Mate(Yerbas.BROCHE_DE_ORO, TiposDeMate.AMARGO));
		rondas.add(new Mate(Yerbas.TRANQUERA, TiposDeMate.AMARGO));
		
		System.out.println("Primer elemento: %s%n".formatted(rondas.get(1).getYerba()));
		for (Mate ronda : rondas) {
			System.out.println("%s %s".formatted(ronda.getYerba(),ronda.getTipo()));
		}
				
		Collections.sort(rondas);
		System.out.println("");
		
		System.out.println("%nPrimer elemento: %s%n".formatted(rondas.get(1).getYerba()));
		for (Mate ronda : rondas) {
			System.out.println("%s %s".formatted(ronda.getYerba(),ronda.getTipo()));
		}
		
	}

}
