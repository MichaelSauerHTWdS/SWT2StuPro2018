
/**
 * Die Klasse Kaufmann ist der Charakter eines Spielers.
 * Mit ihr werden alle Assets eines Spielers verwaltet.
 * So verfuegt der Kaufmann ueber sein Konto und eine Menge von Schiffen.
 *
 * @author Benjamin Hesser, Marvin Backes
 * 
 * @version 1.0
 * 
 * @date 30.04.18
 */
import java.util.Scanner;


/**
 * Klasse Kaufmann, der Charakter eines Spielers
 * Sollen die Waren, die ein Kaufmann besitzt hier referenziert werden?
 */
public class Kaufmann 
{
	private String name;
	private String prename;
	Konto konto1 = null;
	

	
	/**
	 * Konstruktor der Kaufmann Klasse.
	 */
	public Kaufmann () throws Exception
	{
		Scanner scan = new Scanner(System.in);

		/**
		 * Es wird geprüft, ob die Eingaben nicht leer sind und dann erst in den Attribute geschrieben.
		 */
	
			System.out.println("Bitte geben Sie den Vornamen ein: \n");
			prename = scan.nextLine();
			if (prename.isEmpty() == true)
			{
				throw new Exception("Der Vorname darf nicht leer sein!\n");
			}	
			
			System.out.println("Bitte geben Sie den Nachnamen ein: \n");		
			name =scan.nextLine();				
			if (name.isEmpty() == true)
			{
				throw new Exception("Der Vorname darf nicht leer sein!\n");
			}
			
			konto1 = new Konto();
	
			
	}
	public void print() 
	{
		System.out.println("Name: " + prename + " "+  name + "\n Vermoegen: " + konto1 );
		
	}
	
	public static void main( String[] args)
	{
		try 
		{
			Kaufmann k = new Kaufmann();
			k.print();
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}	
}


