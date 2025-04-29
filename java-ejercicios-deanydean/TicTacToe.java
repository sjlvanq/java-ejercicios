/**************************************************************
* TicTacToe.java
* Dean & Dean
*
* Este programa implementa el juego de gato. Cuando se hace clic
* en el primer botón en blanco, su etiqueta cambia a X. Las etiquetas
* de los botones en blanco en que se hace clic cambian a O o X
* en forma alterna.
**************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TicTacToe extends JFrame
{
private boolean xTurn = true; // sigue la pista del turno del jugador
// correspondiente: X u O.
//***********************************************************
public TicTacToe()
{
setTitle("Tic-Tac-Toe");
setSize(200, 220);
setDefaultCloseOperation(EXIT_ON_CLOSE);
createContents();
setVisible(true);
} // end TicTacToe constructor
//***********************************************************
// Crea componentes y agrega una ventana.
private void createContents()
{
JButton button; // reinstancia este botón y lo usa
// para llenar todo el tablero
setLayout(new GridLayout(3, 3));
for (int i=0; i<3; i++)
{
for (int j=0; j<3; j++)
{
button = new JButton();
button.addActionListener(new Listener());
add(button);
} // end for j
} // end for i
} // end createContents

//***********************************************************
// Si el usuario hace clic en un botón, la etiqueta de éste cambia a “X” u “O”.
private class Listener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
JButton btn = (JButton) e.getSource();
if (btn.getText().isEmpty())
{
btn.setText(xTurn ? "X" : "O");
xTurn = !xTurn;
}
} // end actionPerformed
} // end class Listener
//***********************************************************
public static void main(String[] args)
{
new TicTacToe();
}
} // end class TicTacToe
