import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * 
 * @author Benjamin Hesser, Marvin Backes, Joshua Pinnecker
 *
 * @version 1.0
 * 
 * @date 14.05.18
 */
public class Konto {
	static private final String ERR_WARUM_NICHT = "Das Vermoegen darf nicht negativ oder 0 sein!";
	static private final String ERR_NEG_EINZAHLEN = "Der einzuzahlende Betrag darf nicht negativ sein!";
	static private final String ERR_NEG_ABBUCHEN = "Der abzubuchende Betrag darf nicht negativ sein!";

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

	public Konto () throws IllegalArgumentException, InputMismatchException
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie das Vermoegen des Kaufmanns ein:");
		this.vermoegen = scan.nextDouble();
		if (vermoegen <= 0.0)
		{
			throw new IllegalArgumentException(ERR_WARUM_NICHT);
		}
	}
	
	public void einzahlen() throws IllegalArgumentException, InputMismatchException
	{
		double eingabe;
		Scanner scan = new Scanner(System.in);
		try 
		{
			System.out.println("Bitte geben Sie den eizuzahlenden Betrag ein: \n ");
			eingabe = scan.nextDouble();
			if (eingabe < 0) 
			{
				throw new IllegalArgumentException(ERR_NEG_EINZAHLEN);
			} 
			vermoegen += eingabe;
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void abheben() throws IllegalArgumentException, InputMismatchException
	{
		double eingabe;
		Scanner scan = new Scanner(System.in);
		try 
		{
			System.out.println("Bitte geben Sie den abzubuchenden Betrag ein: \n ");
			eingabe = scan.nextDouble();
			if (eingabe < 0) 
			{
				throw new IllegalArgumentException(ERR_NEG_ABBUCHEN);
			} 
			vermoegen -= eingabe;
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}
