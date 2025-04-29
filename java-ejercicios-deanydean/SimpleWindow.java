/*********************************************************
 * SimpleWindow.java
 * Dean & Dean
 *
 * Este programa muestra una etiqueta en una ventana.
 *********************************************************/
import javax.swing.*; // for JFrame, JLabel
import java.awt.*; // for FlowLayout
public class SimpleWindow extends JFrame
{
	private static final long serialVersionUID = -2094611268652407211L;
	private static final int WIDTH = 250;
	private static final int HEIGHT = 100;
	//******************************************************
	public SimpleWindow()
	{
		setTitle("Simple Window");
		setSize(WIDTH, HEIGHT);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createContents();
		setVisible(true);
	} // end SimpleWindow constructor
	//******************************************************
	private void createContents()
	{
		JLabel label = new JLabel("Hi! I'm Larry the label!");
		add(label);
	} // end createContents
	//******************************************************
	public static void main(String[] args)
	{
		new SimpleWindow();
	} // end main
} // end class SimpleWindow