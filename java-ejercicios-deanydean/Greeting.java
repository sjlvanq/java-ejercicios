/*************************************************************
 * Greeting.java
 * Dean & Dean
 *
 * Este programa muestra ventanas de texto y etiquetas. Cuando el usuario
 * oprime Enter después de escribir algo en la ventana de diálogo, el valor
 * de la ventana de diálogo muestra la etiqueta que se muestra a continuación.
 *************************************************************/
import javax.swing.*; // for JFrame, JLabel, JTextField
import java.awt.*; // for FlowLayout
import java.awt.event.*; // for ActionListener, ActionEvent
public class Greeting extends JFrame
{
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 325;
	private static final int HEIGHT = 100;
	private JTextField nameBox; // contiene el nombre del usuario
	private JLabel greeting; // saludos personalizados
	//**********************************************************
	public Greeting()
	{
		setTitle("Greeting");
		setSize(WIDTH, HEIGHT);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createContents();
		setVisible(true);
	} // end constructor
	//**********************************************************
	// Create components and add them to window.
	private void createContents()
	{
		JLabel namePrompt = new JLabel("¿Cómo te llamas?");
		nameBox = new JTextField(15);
		greeting = new JLabel();
		add(namePrompt);
		add(nameBox);
		add(greeting);
		nameBox.addActionListener(new Listener());
	} // end createContents
	//**********************************************************
	// Inner class for event handling.
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String message; // the personalized greeting
			message = "Glad to meet you, " + nameBox.getText()+ "!";
			nameBox.setText("");
			greeting.setText(message);
		} // end actionPerformed
	} // end class Listener
	//**********************************************************
	public static void main(String[] args)
	{
		new Greeting();
	} // end main
} // end class Greeting