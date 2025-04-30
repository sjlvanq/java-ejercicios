/****************************************************************
 * Car5Driver.java
 * Dean & Dean
 *
 * This class is a demonstration driver for the Car5 class.
 ****************************************************************/
public class Car5Driver
{
        public static void main(String[] args)
        {
                Car5 annaCar = new Car5();
                Car5 nickCar = new Car5();
                System.out.println(annaCar.copyTo(nickCar));
                annaCar = new Car5("Porsche", 2006, "beige");
                System.out.println(annaCar.copyTo(nickCar));
        } // end main
} // end class Car5Driver
