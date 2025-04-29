/************************************************************
* MouseShortcut.java
* Dean & Dean
*
* Esta clase ilustra usos y omisiones del this.
************************************************************/
public class MouseShortcut
{
private int age;
private double weight;

// age in days
// weight in grams

//********************************************************
public MouseShortcut(int age, double weight)
{
setAge(age);
setWeight(weight);
} // end constructor
//********************************************************
public void setAge(int a)
{
age = a;
} // end setAge
//********************************************************
public void setWeight(double weight)
{
this.weight = weight;
} // end setWeight
//*********************************************************
public void print()
{
System.out.println("age = " + age + 
", weight = " + weight);

} // end print
} // end class MouseShortcut
