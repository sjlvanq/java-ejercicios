// Fig. 5.28: PruebaFiguras.java
// Obtener la entrada del usuario y crear un JFrame para mostrar Figuras.
import javax.swing.JFrame; // maneja la visualización
import javax.swing.JOptionPane;
public class PruebaFiguras
{
	public static void main(String[] args)
	{
		// obtiene la opción del usuario
		String entrada = JOptionPane.showInputDialog(
				“Escriba 1 para dibujar rectangulos\n” +
				“Escriba 2 para dibujar ovalos”);
		int opcion = Integer.parseInt(entrada); // convierte entrada en int
		// crea el panel con la entrada del usuario
		Figuras panel = new Figuras(opcion);
		JFrame aplicacion = new JFrame(); // crea un nuevo objeto JFrame
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacion.add(panel);
		aplicacion.setSize(300, 300);
		aplicacion.setVisible(true);
	}
} // fin de la clase PruebaFiguras

