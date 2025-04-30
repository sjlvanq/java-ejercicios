/******************************************************************
 * FundRaiser.java
 * Dean & Dean
 *
 * Este programa administra a los agentes que incrementan fondos.
 ******************************************************************/
import java.util.Scanner;
public class FundRaiser
{
	public static final double GOAL = 10000.00;
	//***************************************************************
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int numberOfAgents;
		double totalValue;
		String name;
		System.out.print("Enter total number of agents: ");
		numberOfAgents = stdIn.nextInt();
		stdIn.nextLine();
		for (int i=0; i<numberOfAgents; i++)
		{
			System.out.print("Enter agent name: ");
			name = stdIn.nextLine();
			new Agent(name);
		}
		do
		{
			Agent.addAllValues();
			totalValue = Agent.getAllValues();
			System.out.printf("Total value = $%,.2f\n", totalValue);
		} while (totalValue < GOAL);
		System.out.println("Time to Spend!");
	} // end main
} // end FundRaiser class
