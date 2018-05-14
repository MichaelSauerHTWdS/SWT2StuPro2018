
/**
 * 
 * @author Benjamin Hesser, Marvin Backes
 *
 */
import java.util.Scanner;

public class Kaufmann 
{
	private String name;
	private String prename;
	private double vermoegen;


	
	
	
	/**
	 * Konstruktor der Kaufmann Klasse.
	 */
	public Kaufmann ()
	{
		Scanner scan = new Scanner(System.in);

		/**
		 * Es wird geprüft, ob die Eingaben nicht leer sind und dann erst in den Attribute geschrieben.
		 */
		try {

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
			
			System.out.println("Bitte geben Sie das Vermoegen des Kaufmanns ein: \n");
			vermoegen = scan.nextDouble();
			if (vermoegen <= 0.0)
			{
				throw new Exception("Das Vermoegen darf nicht negativ oder 0 sein\n");
			}
			
		}
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	}
		
	}
	
	public void print() 
	{
		System.out.println("Name: " + prename + " "+  name + "\n Vermoegen: " + vermoegen);
		
	}
	
	public static void main( String[] args)
	{

		Kaufmann k = new Kaufmann();

		k.print();

	}

}
