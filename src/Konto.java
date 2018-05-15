/**
 * 
 * @author Benjamin Hesser, Marvin Backes
 *
 */
import java.util.Scanner;

public class Konto {
	private double vermoegen;

	public double getVermoegen() {
		return vermoegen;
	}

	private void setVermoegen(double vermoegen) {
		this.vermoegen = vermoegen;
	}
	
	public String toString()
	{
		return "Vermoegen: "+ vermoegen;
	}

	public Konto () throws Exception	
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie das Vermoegen des Kaufmanns ein: \n");
		vermoegen = scan.nextDouble();
		if (vermoegen <= 0.0)
		{
			throw new Exception("Das Vermoegen darf nicht negativ oder 0 sein\n");
		}
	}
	
	public void einzahlen()
	{
		double eingabe;
		Scanner scan = new Scanner(System.in);
		try 
		{
			System.out.println("Bitte geben Sie den eizuzahlenden Betrag ein: \n ");
			eingabe = scan.nextDouble();
			if (eingabe < 0) 
			{
				throw new Exception("Der einzuzahlende Betrag darf nicht negativ sein! \n");
			} 
			vermoegen += eingabe;
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void abheben()
	{
		double eingabe;
		Scanner scan = new Scanner(System.in);
		try 
		{
			System.out.println("Bitte geben Sie den abzubuchenden Betrag ein: \n ");
			eingabe = scan.nextDouble();
			if (eingabe < 0) 
			{
				throw new Exception("Der abzubuchende Betrag darf nicht negativ sein! \n");
			} 
			vermoegen -= eingabe;
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}
