/*************************************************************
* Predator.java
* Dean & Dean
*
* Esto modela a los predadores (consumidores), que desean encuentros.
*************************************************************/
public class Predator extends Thread
{
// delay times in milliseconds
public final long[] DELAY = {2347, 1325, 1266, 3534};
private Encounter encounter;
//**********************************************************
public Predator ()
{
super ("predator");
} // end constructor
//**********************************************************
public void setEncounter(Encounter encounter)
{
this.encounter = encounter;
} // end setEncounter
//**********************************************************
public void run()
{
int i;
for (i=0; i<DELAY.length; i++)
{
try
{
Thread.sleep(DELAY[i]);
// se queda y caza
}
catch (Exception e) { }
encounter.beTogether();
// devora a la presa
}
System.out.println(getName() + " ejecución terminada.");
} // end run
} // end Predator class
