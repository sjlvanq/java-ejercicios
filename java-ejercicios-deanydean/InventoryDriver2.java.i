/*************************************************************
 * InventoryDriver2.java
 * Dean & Dean
 *
 * Esto muestra el llenado del inventario de una tienda de comestibles.
 *************************************************************/
public class InventoryDriver2
{
        public static void main(String[] args)
        {
                Inventory store = new Inventory("groceries");
                store.newItem("bread", 15, 9.99);
                store.newItem("SunnyDale", "milk", 2, 2.00);
                store.newItem("eggs", 3, 1.50);
                store.newItem("bread", 2, 1.25);
                // cuidado: hay en el almacén
                store.stockReport();
                FileHandler.write(store, "Inventory.data");
                store.update("SunnyDale", "milk", .25); // subir el precio en 25%
                store.update("eggs", -1);
                // disminuir la calidad por 1
                store.update("beer", 3);
                // cuidado: no hay en el almacén
                store.newItem("BrookSide", "milk", 4, 1.95);
                store.stockReport();
                store = (Inventory) FileHandler.read("Inventory.data");
                store.stockReport();
        } // end main
} // end InventoryDriver2 class
