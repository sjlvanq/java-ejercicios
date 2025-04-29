/*******************************************************************
* ImprimirOrdenCompraGUI.java
* Dean & Dean
*
* Este programa calcula e imprime un reporte de orden de compra.
*******************************************************************/
import javax.swing.JOptionPane;
public class ImprimirOrdenCompraGUI
{
public static void main(String[] args)
{
String nombreArticulo; // nombre del artículo comprado
double precio;
// precio de compra del artículo
int cant;
// número de elementos comprados
nombreArticulo = JOptionPane.showInputDialog("Nombre del artículo comprado:");
precio = Double.parseDouble(
JOptionPane.showInputDialog("Cantidad:"));
cant = Integer.parseInt(
JOptionPane.showInputDialog("Cantidad:"));
JOptionPane.showMessageDialog(null,
"ORDEN DE COMPRA:\n\n" +
"Artículo: " + nombreArticulo + "\nCantidad: " + cant +
"\nPrecio total: $" + precio * cant);
} // fin del metodo main
} // fin de la clase ImprimirOrdenCompraGUI
