/*************************************************************
* Prey.java
* Dean & Dean
*
* Esto modela al predador (productores), que evita los encuentros.
*************************************************************/
public class Prey extends Thread
{
private Encounter encounter;
//**********************************************************
public Prey()
{
super ("prey");
} // end constructor
//**********************************************************
public void setEncounter(Encounter encounter)
{
this.encounter = encounter;
} // end setEncounter
//**********************************************************
public void run()
{
int number;
do
{
number = encounter.beApart();
} while (number < encounter.EVENTS - 1);
System.out.println(getName() + " run finished. ");
} // end run
} // end Prey class
