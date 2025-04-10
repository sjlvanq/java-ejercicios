
public class E0203Principal
{
	public static void main (String[] args)
	{
		E0203Pelicula miPelicula = new E0203Pelicula();
		System.out.println(miPelicula+"\n");
		miPelicula.titulo = "Matrix";
		miPelicula.anio = 1999;
		miPelicula.mostrarFichaTecnica();
		
		E0203Pelicula otraPelicula = new E0203Pelicula();
		System.out.println(otraPelicula+"\n");
		otraPelicula.titulo = "Otra película animada";
		otraPelicula.anio = 2000;
		otraPelicula.mostrarFichaTecnica();


		miPelicula.puntuar(10);
		miPelicula.puntuar(5);
		System.out.println("Cantidad de puntuaciones de " + miPelicula.titulo + ": "
			+ miPelicula.obtenerCantidadPuntuaciones());
		System.out.println("Puntaje de " + miPelicula.titulo + ": " 
			+ miPelicula.obtenerPuntaje());

	}
}
