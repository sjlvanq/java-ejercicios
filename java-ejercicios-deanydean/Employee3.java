/***************************************************************
* Employee3.java
* Dean & Dean
*
* Esta clase abstracta describe a los empleados e incluye
* el cálculo del impuesto por seguridad social.
***************************************************************/
public abstract class Employee3
{
public abstract double getPay();
private String name;
private final static double FICA_TAX_RATE = 0.08; // fracción
private final static double FICA_MAX = 90000;
// dólares
private double ytdIncome;
// ingreso anual total hasta la fecha
//************************************************************
public Employee3(String name)
{
this.name = name;
}
//************************************************************
public void printPay(int date)
{
System.out.printf("%2d %10s: %8.2f\n",
date, name, getPay());
} // end printPay
//************************************************************
protected double getFICA(double pay)
{
double increment, tax;

ytdIncome += pay;
increment = FICA_MAX - ytdIncome;
tax = FICA_TAX_RATE *
(pay < increment ? pay : (increment > 0 ? increment : 0));
return tax;
} // end getFICA
} // end class Employee3
