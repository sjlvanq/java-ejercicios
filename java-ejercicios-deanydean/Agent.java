/**************************************************************
* Agent.java
* Dean & Dean
*
* Clase que describe agentes que reúnen valores cuantitativos.
**************************************************************/
import java.util.Scanner;
public class Agent
{
private static Agent listOfAgents = null;
private final String NAME;
private double value = 0.0;
private Agent nextAgent;

// Inicio de la lista.

// Próximo en la lista.

//***********************************************************
public Agent(String name)
{
this.NAME = name;
this.nextAgent = listOfAgents;
listOfAgents = this;
} // end constructor

//***********************************************************
private double getValue()
{
return this.value;
}
//***********************************************************
private void addValue()
{
Scanner stdIn = new Scanner(System.in);
System.out.printf("Enter %s's contribution: ", this.NAME );
this.value += stdIn.nextDouble();
} // end addValue
//**********************************************************
public static double getAllValues()
{
double totalValue = 0.0;
Agent agent = listOfAgents;
while (agent != null)
{
totalValue += agent.getValue();
agent = agent.nextAgent;
}
return totalValue;
} // end getAllValues

//**********************************************************
public static void addAllValues()
{
Agent agent = listOfAgents;
while (agent != null)
{
agent.addValue();
agent = agent.nextAgent;
}
} // end addAllValues
} // end class Agent
