/********************************************************
 * DragSmiley.java
 * Dean & Dean
 *
 * Este programa muestra la imagen de una carita sonriente.
 * Cuando el usuario oprime el ratón, la imagen cambia a una carita
 * con miedo. El usuario puede arrastrar la imagen.
 ********************************************************/
import javax.swing.*;
public class DragSmiley extends JFrame
{
	private static final int WIDTH = 250;
	private static final int HEIGHT = 250;
	private SmileyPanel smileyPanel;
	// drawing panel
	//*****************************************************
	public DragSmiley()
	{
		setTitle("Drag Smiley");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		smileyPanel = new SmileyPanel();
		add(smileyPanel);
		setVisible(true);
	} // end DragSmiley constructor
	//**************************************
	public static void main(String[] args)
	{
		new DragSmiley();
	}
} // end class DragSmiley
