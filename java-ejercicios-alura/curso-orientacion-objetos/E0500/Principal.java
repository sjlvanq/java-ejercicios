import java.util.ArrayList;
import java.util.Random;

import modelo.Audio;
import modelo.Cancion;
import modelo.Podcast;
import modelo.enums.Categoria;
import modelo.enums.Genero;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Audio> miLista = new ArrayList<>();
		miLista.add(new Cancion("Tacho de lata", Genero.TRASH));
		miLista.add(new Podcast("Las mañanas con Cacho", Categoria.DEPORTES));
		miLista.add(new Cancion("Ana no duerme", Genero.SOFTROCK));
		miLista.add(new Podcast("KONAMI Code", Categoria.VIDEOJUEGOS));
		miLista.add(new Podcast("Construye tu armario", Categoria.OFICIOS));
		
		/*
		Audio miCancion1 = new Cancion("Tacho de lata", Genero.TRASH);
		Audio miPodcast1 = new Podcast("Las mañanas con Cacho", Categoria.DEPORTES);
		Audio miCancion2 = new Cancion("Ana no duerme", Genero.SOFTROCK);
		Audio miPodcast2 = new Podcast("KONAMI Code", Categoria.VIDEOJUEGOS);
		Audio miPodcast3 = new Podcast("Construye tu armario", Categoria.OFICIOS);
		*/
		
		Random randomizador = new Random();
		
		for (Audio item : miLista) {
			for (int i = 0; i<= randomizador.nextInt(1000); i++ ) {
				item.reproducir();
			}
		}
		
		for (Audio item : miLista) {
			System.out.println(item);
		}
		
	}

}
