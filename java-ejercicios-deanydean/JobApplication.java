/*************************************************************
 * JobApplication.java
 * Dean & Dean
 *
 * Este programa implementa cuestiones relacionadas con una solicitud de
 * empleo con casillas de verificación, botones de radio y cuadros combo.
 *************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

// para EmptyBorder

public class JobApplication extends JFrame
{
	private static final int WIDTH = 250;
	private static final int HEIGHT = 300;
	private JCheckBox java;
	// ¿Certificado por Java Sun?
	private JCheckBox helpDesk;
	// ¿Experiencia en oficina?
	private JCheckBox coffee;
	// ¿Hace buen café?
	private JRadioButton goodCitizen, criminal;
	private JComboBox salary;
	private String[] salaryOptions =
	{"$20,000-$59,000", "$60,000-$100,000", "above $100,000"};
	private JButton submit;
	// submit the application
	//**********************************************************
	public JobApplication()
	{
		setTitle("presente la solicitud");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createContents();
		setVisible(true);
	} // end JobApplication constructor
	//**********************************************************
	// Crea componentes y los agrega a la ventana.
	private void createContents()
	{
		ButtonGroup radioGroup;
		//Nota:
		//la implementación más directa consiste en usar un gestor
		//GridLayout para el JFrame y agregar todos los componentes
		//a sus celdas. Eso no funciona bien porque:
		//1) No es posible aplicar un margen a JFrame.
		//2) El panel de botones es más alto que los otros componentes.

		// Se requiere windowPanel para la separación del panel del sur y el margen exterior.
		JPanel windowPanel = new JPanel(new BorderLayout(0, 10));
		windowPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		// CenterPanel contiene todos los componentes, excepto button
		JPanel centerPanel = new JPanel(new GridLayout(11, 1));
		// Se requiere un panel para el botón, de modo que el alineamiento puede ser al centro
		JPanel southPanel = new JPanel(new FlowLayout());
		java = new JCheckBox("Java Sun certified");
		helpDesk = new JCheckBox("help-desk experience");
		coffee = new JCheckBox("able to make good coffee");
		goodCitizen = new JRadioButton("law-abiding citizen");
		criminal = new JRadioButton("violent criminal");
		radioGroup = new ButtonGroup();
		radioGroup.add(goodCitizen);
		radioGroup.add(criminal);
		salary = new JComboBox(salaryOptions);
		submit = new JButton("Submit");
		submit.addActionListener(new ButtonListener());
		centerPanel.add(new JLabel("Skills (check all that apply):"));
		centerPanel.add(java);
		centerPanel.add(helpDesk);
		centerPanel.add(coffee);
		centerPanel.add(new JLabel()); // filler
		centerPanel.add(new JLabel("Community standing:"));
		centerPanel.add(goodCitizen);
		centerPanel.add(criminal);
		centerPanel.add(new JLabel()); // filler
		centerPanel.add(new JLabel("Salary requirements:"));
		centerPanel.add(salary);
		windowPanel.add(centerPanel, BorderLayout.CENTER);
		southPanel.add(submit);
		windowPanel.add(southPanel, BorderLayout.SOUTH);
		add(windowPanel);
	} // end createContents

	//**************************************************************
	// Lee valores introducidos y despliega un mensaje idóneo.
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (
					(java.isSelected() || helpDesk.isSelected()
					 || coffee.isSelected()) &&
					(goodCitizen.isSelected()) &&
					(!salary.getSelectedItem().equals("above $100,000")))
			{
				JOptionPane.showMessageDialog(null,
						"Gracias por su solicitud.\n" +
						"Lo buscaremos después de procesar su información.");
			}
			else
			{
				JOptionPane.showMessageDialog(null,
						"Lo sentimos; por el momento no hay puestos disponibles.");
			}
		} // end actionPerformed
	} // end class ButtonListener
	//**************************************************************
	public static void main(String[] args)
	{
		new JobApplication();
	}
} // end class JobApplication
