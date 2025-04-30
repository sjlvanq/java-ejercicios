/*********************************************************************
 * GraphicsDemo.java
 * Dean & Dean
 *
 * Este programa define un applet de Java que despliega una imagen y gráficas.
 *********************************************************************/
import java.awt.*;
// para clases Graphics, Image and Color
import java.applet.Applet;

public class GraphicsDemo extends Applet
{
	public void paint (Graphics g)
	{
		Image image =
			this.getImage(getDocumentBase(),"huracanes.jpg");
		// despliega la imagen completa más reducida en la esquina superior
		// izquierda de la ventana
		g.drawImage(image, 0, 0, 427, 284,
				// destino, supIzq, infDer
				0, 0, 640, 427, this);
		// fuente supizq, infDer
		// establece el color de todas las líneas a ser dibujadas
		g.setColor(Color.BLUE);
		// dibuja un rectángulo alrededor de la región a ser expandida
		g.drawRect(200, 60, 120, 120);
		// supIzq, ancho & largo
		// Dibuja las líneas entre las esquinas de los rectángulos
		g.drawLine(200, 60, 240, 240);
		// superior izquierda
		g.drawLine(320, 60, 600, 240);
		// superior derecha
		g.drawLine(200, 180, 240, 600);
		// inferior izquierda
		g.drawLine(320, 180, 600, 600);
		// inferior derecha
		// despliega la parte expandida de la imagen original
		g.drawImage(image, 240, 240, 600, 600, // destino, supIzq, infDer
				300, 90, 480, 270, this);
		// fuente supIzq, infDer
		// draw rectangle around expanded part of image
		g.drawRect(240, 240, 360, 360);
		// supIzq, ancho & largo
		// crea un óvalo iluminado de azul (BLUE) y escribe sobre éste
		g.fillOval(520, 380, 45, 30);
		// supIzq, ancho & largo
		g.setColor(Color.WHITE);
		// cambia el color para el texto
		g.drawString("MAX", 530, 400);
		// cadena y posición de inicio
	} // fin de paint
} // fin de la clase GraphicsDemo
