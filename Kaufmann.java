
public class Kaufmann 
{
	private String name;
	private String prename;
	private double vermoegen;
	
	public Kaufmann (String name, String prename)
	{
		this.name = name;
		this.prename = prename;
		vermoegen = 0.0;
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
