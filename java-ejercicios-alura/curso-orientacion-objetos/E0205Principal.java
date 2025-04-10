import uno.lode.cursojava.e0205.modelos.Pelicula;

public class E0205Principal
{
	public static void main (String[] args)
	{
		Pelicula miPelicula = new Pelicula();
		System.out.println(miPelicula+"\n");
		miPelicula.setTitulo("Matrix");
		miPelicula.setAnio(1999);
		miPelicula.setDuracion(120);
		miPelicula.mostrarFichaTecnica();

		Pelicula otraPelicula = new Pelicula();
		System.out.println(otraPelicula+"\n");
		otraPelicula.setTitulo("Otra película animada");
		otraPelicula.setAnio(2000);
		otraPelicula.setDuracion(200);
		otraPelicula.mostrarFichaTecnica();

		miPelicula.puntuar(10);
		miPelicula.puntuar(5);
		System.out.println("Cantidad de puntuaciones de " + miPelicula.getTitulo() + ": "
			+ miPelicula.obtenerCantidadPuntuaciones());
		System.out.println("Puntaje de " + miPelicula.getTitulo() + ": " 
			+ miPelicula.obtenerPuntaje());

	}
}
