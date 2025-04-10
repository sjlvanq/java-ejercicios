import uno.lode.cursojava.e0400.modelos.Pelicula;
import uno.lode.cursojava.e0400.modelos.Serie;
import uno.lode.cursojava.e0400.calculos.FiltroRecomendacion;

public class E0400Principal
{
	public static void main (String[] args)
	{
		Pelicula miPelicula = new Pelicula();
		System.out.println(miPelicula+"\n");
		miPelicula.setTitulo("Matrix");
		miPelicula.setAnio(1999);
		miPelicula.setDuracion(120);
		miPelicula.mostrarFichaTecnica();
		
		Serie miSerie = new Serie();
		System.out.println(miSerie+"\n");
		miSerie.setTitulo("Keyboard, la serie");
		miSerie.setAnio(2000);
		miSerie.setDuracion(200);
		miSerie.mostrarFichaTecnica();

		miPelicula.puntuar(10);
		miPelicula.puntuar(5);
		System.out.println("Cantidad de puntuaciones de " + miPelicula.getTitulo() + ": "
			+ miPelicula.obtenerCantidadPuntuaciones());
		System.out.println("Puntaje de " + miPelicula.getTitulo() + ": " 
			+ miPelicula.obtenerPuntaje());
				
		miPelicula.puntuar(10);
		miPelicula.puntuar(7);
		miPelicula.puntuar(9);
		FiltroRecomendacion filtro = new FiltroRecomendacion();
		System.out.println("\nPopularidad de "
			+ miPelicula.getTitulo()
			+ ": ");
		filtro.filtra(miPelicula);
	}
}
