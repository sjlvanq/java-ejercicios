/*
 * Mira el siguiente diagrama y construye la clase Patient.
 * Patient name: String 
 * email: String 
 * address: String 
 * phoneNumber: String 
 * birthday: String 
 * weight: double 
 * height: double 
 * blood: String 
 * Patient(name: String, email: String)
 */

public class E0211Patient
{
	String name;
	String email;
	String address;
	String phoneNumber;
	String birthday;
	double weight;
	double height;
	String blood;

	E0211Patient(String name, String email){
		this.name = name;
		this.email = email;	
	}
	
	public static void main (String[] args)
	{
		E0211Patient paciente1 = new E0211Patient("Anastasia", "anasti@lavabit.com");
		System.out.println(paciente1.name + " [" + paciente1.email + "]");
	}
}
