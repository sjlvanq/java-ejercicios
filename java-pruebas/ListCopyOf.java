import java.util.ArrayList;

public class ListCopyOf
{
	public static void main (String[] args)
	{
		ArrayList<Integer> listaDeClase = ListCopyOfB.getLista();
		ArrayList<Integer> listaDeLaOtraClase = ListCopyOfB.getLista();
		listaDeClase.add(10);
		System.out.println(listaDeLaOtraClase);
		System.out.println(listaDeClase);

	}
}
