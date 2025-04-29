/****************************************************************
* LinePlotGUI.java
* Dean & Dean
*
* Este programa traza una línea como una secuencia de puntos
* unidos especificados por el usuario.
****************************************************************/
import javax.swing.*;

// for JFrame, JOptionPane

public class LinePlotGUI extends JFrame
{
private static final int FRAME_WIDTH = 400;
private static final int FRAME_HEIGHT = 250;
private static final int MARGIN = 20;
// espacio entre el marco
// y la línea trazada
int numOfPoints;
int maxY;
double[] yCoords;

// los puntos van desde N=0 hasta N=numOfPoints-1
// los valores de la coordenada y van desde y=0 hasta y=maxY
// valores de la coordenada y para todos los puntos

//*************************************************************
public LinePlotGUI()
{
setSize(FRAME_WIDTH, FRAME_HEIGHT);
setTitle("Line Plot");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
} // end LinePlotGUI
//*************************************************************
int getMargin()
{
return MARGIN;
}
int getMaxY()
{
return maxY;
}
double[] getYCoords()
{
return yCoords;
}


//*************************************************************
// Este método solicita al usuario las coordenadas y de los puntos
// en las posiciones x=0, x=1, etcétera.
public void readYCoordinates()
{
String yStr; // user's entry for a point's y coordinate
numOfPoints = getIntFromUser("Introduzca el número de puntos: "); 
maxY = getIntFromUser("Introduzca el valor del punto máximo: "); 
yCoords = new double[numOfpoints];
for (int i=0; i<=maxX; i++)
{
yStr = JOptionPane.showInputDialog(
"En x = " + i + ", ¿cuál es el valor de y?\n" +
"Introduzca un entero entre 0 y " +
maxY + " inclusive:");
try
{
yCoords[i] = Integer.parseInt(yStr);
if (yCoords[i] < 0 || yCoords[i] > maxY)
{
JOptionPane.showMessageDialog(null,
"Entrada inválida. El valor debe estar entre 0 y " + maxY);
i--;
}
}
catch (NumberFormatException e)
{
JOptionPane.showMessageDialog(null,
"Entrada inválida. Debe introducir un entero.");
i--;
}
} // end for
} // end readYCoordinates

//*************************************************************
// Este método solicita al usuario un entero, efectúa validación
// de entrada y devuelve el entero introducido.
private static int getIntFromUser(String prompt)
{
String entry;
// entrada del usuario
boolean valid = false; // ¿la entrada del usuario es un entero válido?
int entryInt = 0;
// forma entera de la entrada del usuario

entry = JOptionPane.showInputDialog(prompt);
do
{
try
{
entryInt = Integer.parseInt(entry);
valid = true;
}
catch (NumberFormatException e)
{
entry = JOptionPane.showInputDialog(
"Entrada inválida. Introduzca un entero:");
}
} while (!valid);
return entryInt;
} // end getIntFromUser
//*************************************************************
public static void main(String[] args)
{
LinePlotGUI linePlotGUI = new LinePlotGUI();
linePlotGUI.readYCoordinates();
LinePlotPanel linePlotPanel = new LinePlotPanel(linePlotGUI);
linePlotGUI.add(linePlotPanel);
linePlotGUI.setVisible(true);
} // end main
} // end class LinePlotGUI
