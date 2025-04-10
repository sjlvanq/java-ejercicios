package uno.lode.cursojava.e0400.calculos;

public class FiltroRecomendacion
{
	//NECESARIO ESPECIFICAR public.
	//E0400Principal.java:33: error: filtra(Clasificable) is not public in FiltroRecomendacion; cannot be accessed from outside package
	public void filtra(Clasificable clasificable){
		if(clasificable.getClasificacion()>=4){
			System.out.println("Hot");
		} else if (clasificable.getClasificacion()>=2){
			System.out.println("Héchale un vistazo luego");
		}
	}
}
