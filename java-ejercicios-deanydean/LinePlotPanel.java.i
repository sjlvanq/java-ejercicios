/***************************************************************
 * LinePlotPanel.java
 * Dean & Dean
 *
 * Esta clase muestra una línea como una secuencia de puntos unidos.
 ***************************************************************/
import javax.swing.*; // for JPanel
import java.awt.*;
// for Graphics
public class LinePlotPanel extends JPanel
{
        private int[] xPixels; // mantiene el valor x para cada punto trazado
        private int[] yPixels; // mantiene el valor y para cada punto trazado
        // La línea trazada está rodeada por un rectángulo con estas especificaciones:
        private int topLeftX, topLeftY;
        private int rectWidth, rectHeight;
        //************************************************************
        // Calcula las dimensiones del rectángulo de la línea trazada, usando
        // el marco pasado, que contiene las dimensiones del marco y los valores
        // de las coordenadas. Llena los arreglos xPixels y yPixels.
        public LinePlotPanel(LinePlotGUI frame)
        {
                int numOfPoints = frame.getYCoords().length;
                int pixelInterval;
                // distancia entre puntos adyacentes
                topLeftX = topLeftY = frame.getMargin();
                // getInsets funciona sólo si primero se llama a setVisible
                frame.setVisible(true);
                rectWidth =
                        frame.getWidth() - (2 * topLeftX +
                                        frame.getInsets().left + frame.getInsets().right);
                rectHeight =
                        frame.getHeight() - (2 * topLeftY +
                                        frame.getInsets().top + frame.getInsets().bottom);

                // Calcula el intervalo entero de pixeles entre puntos adyacentes
                pixelInterval = rectWidth / (numOfPoints - 1);
                // Hace que el ancho actual del rectángulo = múltiplo de pixelInterval
                rectwidth = (numOfPoints - 1) * pixelInterval;
                xPixels = new int[numOfPoints];
                yPixels = new int[numOfPoints];
                for (int i=0; i<numOfPoints; i++)
                {
                        xPixels[i] = topLeftX + (i * pixelInterval);
                        yPixels[i] = topLeftY + rectHeight - (int) Math.round(
                                        (frame.getYCoords()[i] / frame.getMaxY()) * rectHeight);
                }
        } // end LinePlotPanel constructor
        //**********************************************************
        // Esta clase muestra la línea como una secuencia de puntos unidos.
        public void paintComponent(Graphics g)
        {
                super.paintComponent(g);
                g.drawRect(topLeftX, topLeftY, rectWidth, rectHeight);

                g.drawPolyline(xPixels, yPixels, xPixels.length);

        } // end paintComponent
} // end class LinePlotPanel
