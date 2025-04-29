/***************************************************************
 * SmileyPanel.java
 * Dean & Dean
 *
 * Esta clase contiene una carita sonriente y oyentes
 * que permiten el arrastre y el intercambio de la imagen.
 ***************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SmileyPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private final ImageIcon SMILEY = new ImageIcon("smiley.png");
	private final ImageIcon SCARED = new ImageIcon("scared.png");
	private final int WIDTH = SMILEY.getIconWidth();
	private final int HEIGHT = SMILEY.getIconHeight();
	private Point imageCorner; // ubicación de la imagen en el ángulo superior izquierdo
	private Point prevPt; // ubicación del ratón para un evento previo
	private ImageIcon image; // se activa entre sonriente y con miedo.
	//************************************************************
	public SmileyPanel()
	{
		image = SMILEY;
		imageCorner = new Point(0, 0); // image starts at top left
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
	} // end SmileyComponent constructor
	//************************************************************
	private class ClickListener extends MouseAdapter
	{
		// Cuando se oprime el ratón, cambia a imagen con miedo.
		public void mousePressed(MouseEvent e)
		{
			image = SCARED;
			prevPt = e.getPoint(); // guardar la posición actual
			repaint();
		} // end mousePresse
		//Cuando se oprime el ratón, regresa la imagen sonriente.
		public void mouseReleased(MouseEvent e)
		{
			image = SMILEY;
			repaint();
		} // end mouseReleased
	} // end class ClickListener
	//*******************************************************
	private class DragListener extends MouseMotionAdapter
	{
		//Permite que el ratón arrastre la imagen.
		public void mouseDragged(MouseEvent e)
		{
			Point currentPt = e.getPoint(); // posición actual
			//Make sure mouse was pressed within the image.
			if (currentPt.getX() >= imageCorner.getX() &&
					currentPt.getX() <= imageCorner.getX() + WIDTH &&
					currentPt.getY() >= imageCorner.getY() &&
					currentPt.getY() <= imageCorner.getY() + HEIGHT)
			{
				imageCorner.translate(
						(int) (currentPt.getX() - prevPt.getX()),
						(int) (currentPt.getY() - prevPt.getY()));
				prevPt = currentPt; // save current position
				repaint();
			}
		} // end mouseDragged
	} // end class DragListener
	//*******************************************************
	//Dibuja la ventana, incluyendo la imagen actualizada.
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		image.paintIcon(this, g,
				(int) imageCorner.getX(), (int) imageCorner.getY());
	} // end paintComponent
} // end class SmileyPanel