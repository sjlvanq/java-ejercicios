/**************************************************************
* MathCalculator.java
* Dean & Dean
*
* Este programa usa gestores de distribución insertados para desplegar la
* raíz cuadrada y el logaritmo de un número introducido por el usuario.
**************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MathCalculator extends JFrame
{
private static final int WIDTH = 380;
private static final int HEIGHT = 110;
private JTextField xBox;
// valor de entrada del usuario
private JTextField xSqrtBox; // raíz cuadrada generada
private JTextField xLogBox; // logaritmo generado
//***********************************************************
public MathCalculator()
{
setTitle("Math Calculator");
setSize(WIDTH, HEIGHT);
setDefaultCloseOperation(EXIT_ON_CLOSE);
createContents();
setVisible(true);
} // end MathCalculator constructor
//***********************************************************
// Crea componentes y los agrega a una ventana.
private void createContents()
{
JPanel xPanel;
// contiene la etiqueta x y su ventana de texto
JPanel xSqrtPanel; // contiene la etiqueta "sqrt x" y su ventana de texto
JPanel xLogPanel; // contiene la etiqueta "log x" y su ventana de texto
JLabel xLabel;
JButton xSqrtButton;
JButton xLogButton;
Listener listener;
setLayout(new GridLayout(2, 2));
// Crea el panel x:
xLabel = new JLabel("x:");
xBox = new JTextField(8);
xPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
xPanel.add(xLabel);
xPanel.add(xBox);
// Crea el panel raíz cuadrada:
xSqrtButton = new JButton("sqrt x");
xSqrtBox = new JTextField(8);
xSqrtBox.setEditable(false);
xSqrtPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
xSqrtPanel.add(xSqrtButton);
xSqrtPanel.add(xSqrtBox);
// Crea el panel logaritmo:
xLogButton = new JButton("log10 x");
xLogBox = new JTextField(8);
xLogBox.setEditable(false);
xLogPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
xLogPanel.add(xLogButton);
xLogPanel.add(xLogBox);
// Agrega paneles a la ventana:
add(xPanel);
add(xSqrtPanel);
add(new JLabel()); // componente inválido
add(xLogPanel);
listener = new Listener();
xSqrtButton.addActionListener(listener);
xLogButton.addActionListener(listener);
} // end createContents


//***********************************************************
// Clase interna para cálculos matemáticos.
private class Listener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
double x;
// valor numérico para la x introducida por el usuario
double result; // valor calculado

try
{
x = Double.parseDouble(xBox.getText());
}
catch (NumberFormatException nfe)
{
x = -1;
// indica una x inválida
}
if (e.getActionCommand().equals("sqrt x"))
{
if (x < 0)
{
xSqrtBox.setText("undefined");
}
else
{
result = Math.sqrt(x);
xSqrtBox.setText(String.format("%7.5f", result));
}
} // end if
else // calcula el logaritmo
{
if (x < 0)
{
xLogBox.setText("undefined");
}
else
{
result = Math.log10(x);
xLogBox.setText(String.format("%7.5f", result));
}
} // end else
} // end actionPerformed
} // end class Listener
//**********************************************************
public static void main(String[] args)
{
new MathCalculator();
} // end main
} // end class MathCalculator
