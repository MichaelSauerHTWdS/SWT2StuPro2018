import java.util.Scanner;
/**
 * Die Klasse Kaufmann ist der Charakter eines Spielers.
 * Mit ihr werden alle Assets eines Spielers verwaltet.
 * So verfuegt der Kaufmann ueber sein Konto und eine Menge von Schiffen.
 *
 * @author Benjamin Hesser, Marvin Backes, Joshua Pinnecker
 * 
 * @version 1.0
 * 
 * @date 30.04.18
 */
public class Kaufmann
{
 	/* Sollen die Waren, die ein Kaufmann besitzt hier referenziert werden? */
	//Nein sie werden im in Kontor oder Schiff referenziert
    static private final String LEERER_NAME_ERROR = "Der Name darf nicht leer sein!";
	private String name;
	private String prename;
	Konto konto1;
	

	
	/**
	 * Konstruktor der Kaufmann Klasse.
	 */
	public Kaufmann () throws IllegalArgumentException
	{

		name="Musterman";
		prename="Max";
		konto1 = new Konto();
	
			
	}
	
	public void eingabe () throws IllegalArgumentException
	{
		Scanner scan = new Scanner(System.in);

		/**
		 * Es wird geprueft, ob die Eingaben nicht leer sind und dann erst in den Attribute geschrieben.
		 */
	
			System.out.println("Bitte geben Sie den Vornamen ein:");
			prename = scan.nextLine();
			if (prename.isEmpty())
			{
				throw new IllegalArgumentException(LEERER_NAME_ERROR);
			}	
			
			System.out.println("Bitte geben Sie den Nachnamen ein:");
			name = scan.nextLine();
			if (name.isEmpty())
			{
				throw new IllegalArgumentException(LEERER_NAME_ERROR);
			}
	}

	public void print()
	{
		System.out.println("Name: " + prename + " "+  name + "\n Vermoegen: " + konto1);
		
	}

	public String toString()
	{
		return "Name: " + this.prename + " " + this.name + "\t" + konto1;
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


