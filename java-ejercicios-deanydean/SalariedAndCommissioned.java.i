/************************************************************
 * SalariedAndCommissioned.java
 * Dean & Dean
 *
 * Esta clase representa empleados asalariados y comisionados.
 ************************************************************/
public class SalariedAndCommissioned
extends Salaried2 implements Commission
{
        private double sales;
        //*********************************************************
        public SalariedAndCommissioned(String name, double salary)
        {
                super(name, salary);
        } // end constructor
        //*********************************************************
        public void addSales(double sales) 
        {
                this.sales += sales;
        } // end addSales


        //*********************************************************
        public double getPay()
        {
                double pay =
                        super.getPay() + COMMISSION_RATE * sales;
                sales = 0.0;
                // reset for next pay period
                return pay;
        } // end getPay
} // end class SalariedAndCommissioned
