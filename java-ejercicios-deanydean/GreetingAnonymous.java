/***********************************************************
 * GreetingAnonymous.java
 * Dean & Dean
 *
 * Este programa demuestra una clase interna anónima.
 ***********************************************************/
import javax.swing.*; // for JFrame, JLabel, JTextField
import java.awt.*; // for FlowLayout
import java.awt.event.*; // for ActionListener, ActionEvent
public class GreetingAnonymous extends JFrame
{
	private static final long serialVersionUID = 3519300426317121274L;
	private static final int WIDTH = 325;
	private static final int HEIGHT = 100;
	private JTextField nameBox; // contiene el nombre del usuario
	private JLabel greeting; // saludo personalizado
	//********************************************************
	public GreetingAnonymous()
	{
		setTitle("Greeting Anonymous");
		setSize(WIDTH, HEIGHT);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createContents();
		setVisible(true);
	} // end constructor
	//*********************************************************
	//Crea componentes y las agrega a la ventana.
	private void createContents()
	{
		JLabel namePrompt = new JLabel("¿Cómo te llamas?");
		nameBox = new JTextField(15);
		greeting = new JLabel();
		add(namePrompt);
		add(nameBox);
		add(greeting);
		nameBox.addActionListener(
				//anonymous inner class for event handling
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String message; // the personalized greeting
						message = "Mucho gusto, " + nameBox.getText();
						nameBox.setText("");
						greeting.setText(message);
					} // end actionPerformed
				} // end anonymous inner class
				); // end addActionListener call
	} // end createContents
	//*********************************************************
	public static void main(String[] args)
	{
		new GreetingAnonymous();
	} // end main
} // end class GreetingAnonymous
