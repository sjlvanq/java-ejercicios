//import 

public class E0206
{
	public static void main (String[] args)
	{
		System.out.println("Bienvenido a Screen Match");
		System.out.println("Película: Matrix");
		int fechaDeLanzamiento = 1999;
		boolean incluidoEnElPlan = true;
		double notaDeLaPelicula = 8.2;

		double media = (8.2 + 6.0 + 9.0) / 3;
		System.out.println(media);

		String sinopsis = """
			Thomas Anderson es un brillante programador de una respetable compañía de software. 
			Pero fuera del trabajo es Neo, un hacker que un día recibe una misteriosa visita
			Fue lanzada en\s""" + fechaDeLanzamiento;

		//System.out.println(sinopsis);
		print(sinopsis);


	}

	private static void print(String value)
	{
		System.out.print(value);
	}
}
