/**************************************************************
 * AfricanCountries
 * Dean & Dean
 *
 * Este programa muestra la distribución de componentes
 * para el gestor BorderLayout.
 **************************************************************/
import javax.swing.*;
import java.awt.*;
public class AfricanCountries extends JFrame
{
	private static final int WIDTH = 325;
	private static final int HEIGHT = 200;
	public AfricanCountries()
	{
		setTitle("African Countries");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(new JButton("Tunisia"), BorderLayout.NORTH);
		add(new JButton("<html>South<br>Africa</html>"),
				BorderLayout.SOUTH);
		add(new JButton("Western Sahara"), BorderLayout.WEST);
		add(new JButton("Central African Republic"),
				BorderLayout.CENTER);
		add(new JButton("Somalia"), BorderLayout.EAST);
		setVisible(true);
	} // end AfricanCountries constructor
	//***********************************************************
	public static void main(String[] args)
	{
		new AfricanCountries();
	} // end main
} // end class AfricanCountries
