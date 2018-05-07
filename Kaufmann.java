
/**
 * 
 * @author Benjamin Hesser, Marvin Backes
 *
 */

public class Kaufmann 
{
	private String name;
	private String prename;
	private double vermoegen;
	
	/**
	 * Konstruktor der Kaufmann Klasse.
	 */
	public Kaufmann (String name, String prename)
	{
		try {
			if (name == "")
			{
				throw new Exception("Der Name darf nicht leer sein!\n");
			}
			this.name = name;
			if (prename == "")
			{
				throw new Exception("Der Vorname darf nicht leer sein!\n");
			}
			this.prename = prename;
			vermoegen = 0.0;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void print() 
	{
		System.out.println("Name: " + prename + name);
		
	}
	
	public static void main( String[] args)
	{
		
		Kaufmann k = new Kaufmann("Mustermann" , "Max");
		k.print();
	}
	
}
