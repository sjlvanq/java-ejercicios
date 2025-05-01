// Fig. 8.17: MiLinea.java
// La clase MiLinea representa a una línea.
import java.awt.Color;
import java.awt.Graphics;
public class MiLinea
{
	private int x1; // coordenada x del primer punto final
	private int y1; // coordenada y del segundo punto final
	private int x2; // coordenada x del tercer punto final
	private int y2; // coordenada y del cuarto punto final
	Color color; // el color de esta figura

		// constructor con valores de entrada
		public MiLinea(int x1, int y1, int x2, int y2, Color color)
		{
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.color = color;
		}
	// Dibuja la línea en el color específico
	public void dibujar(Graphics g)
	{
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}
} // fin de la clase MiLinea

