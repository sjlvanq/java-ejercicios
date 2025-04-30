/**********************************************************
 * ColorChooser.java
 * Dean & Dean
 *
 * Estos botones del programa permiten al usuario establecer
 * el color de fondo de la ventana en gris o azul.
 **********************************************************/
import javax.swing.*; // para JFrame & JButton
import java.awt.*; // para FlowLayout, Color, & Container
import java.awt.event.*; // para ActionListener & ActionEvent
public class ColorChooser extends JFrame
{
	private static final int WIDTH = 300;
	private static final int HEIGHT = 100;
	private JButton grayButton; // cambia el fondo a gris
	private JButton blueButton; // cambia el fondo a azul

	//*******************************************************
	public ColorChooser()
	{
		setTitle("Background Color Chooser");
		setSize(WIDTH, HEIGHT);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createContents();
		setVisible(true);
	} // end ColorChooser constructor
	//*******************************************************
	private void createContents()
	{
		grayButton = new JButton("Gray");
		grayButton.setBackground(Color.LIGHT_GRAY);
		grayButton.addActionListener(new ButtonListener());
		add(grayButton);
		blueButton = new JButton("Blue");
		blueButton.setBackground(new Color(135,206,250));
		blueButton.addActionListener(new ButtonListener());
		add(blueButton);
	} // end createContents
	//*************************************************************
	// Clase interna para manipulación de eventos.
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Container contentPane = getContentPane();
			if (e.getSource() == grayButton)
			{
				// Cambia el color de fondo de la ventana a gris.
				contentPane.setBackground(Color.GRAY);
			}
			else
			{
				// Cambia el color de fondo de la ventana a azul.
				contentPane.setBackground(Color.BLUE);
			}
		} // end actionPerformed
	} // end class ButtonListener
	//*************************************************************
	public static void main(String[] args)
	{
		new ColorChooser();
	}
} // end class ColorChooser
