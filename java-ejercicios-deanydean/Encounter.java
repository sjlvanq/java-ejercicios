/***************************************************************
 * Encounter.java
 * Dean & Dean
 *
 * Esto describe la interacción predador/presa (consumidor/productor).
 ***************************************************************/
public class Encounter
{
	public final int EVENTS;
	private int number = -1;
	private Prey prey;
	private Predator predator;

	private boolean predatorHasAccess = false; // access semaphore
	//************************************************************
	public Encounter(Prey prey, Predator predator)
	{
		this.prey = prey;
		this.predator = predator;
		prey.setEncounter(this);
		predator.setEncounter(this);
		EVENTS = predator.DELAY.length;
	} // end constructor
	//************************************************************
	public synchronized int beApart()
	{
		while (predatorHasAccess)
		{
			try
			{
				wait();
				// El thread prey espera aquí hasta que es notificado.
			}
			catch (Exception e) { }
		}
		// prey has access, so go apart
		number++;
		System.out.println(Thread.currentThread().getName() +
				" start beApart " + number);
		predatorHasAccess = true;
		notifyAll();
		return number;
	} // end beApart
	//************************************************************
	public synchronized int beTogether()
	{
		while (!predatorHasAccess)
		{
			try
			{
				wait();
				// El thread predator espera aquí hasta que es notificado.
			}
			catch (Exception e) { }
		}
		// el predador tiene acceso, de modo que vienen juntos
		System.out.println(Thread.currentThread().getName() +
				" finish beTogether " + number);
		predatorHasAccess = false;
		notifyAll();
		return number;
	} // end beTogether
} // end Encounter class
