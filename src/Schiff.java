/**
 * @mainpage Hanse Kontor 
 * @details	java-Klasse zur Erzeugung und Verwaltung von Schiffen
 *
 * @file 	Schiff.java
 * @version 1.0
 * @date	2018
 * @author	Matthias Langenfeld, Bjoern Offermann
 * 		Joshua Pinnecker
 */

//import java.io.*;
import java.util.*;


/**
 * @name Name des Schiffes
 * @class Schiff
 * @brief Hier werden die wichtigsten Parameter des Schiffes definiert
 */
public class Schiff 
{
	private Schiffstyp schiffstyp = Schiffstyp.KOGGE;
	private String name;
	private int zustand;
	private int ladung;
	private int maxlad;

	/**
	 * @brief Konstruktor 
	 * @param name Schiffsname
	 */
	public Schiff(String name) 
	{
		if(name == null || name.isEmpty())
		{
			throw new IllegalArgumentException( "Es wurde kein gueltiger Schiffname uebergeben!");
		}
		this.name = name;	
		this.zustand = 100;
		this.ladung = 0;
	}
	
	/**
	 * Erweiterter Konstruktor um andere Schiffe bauen zu können
	 */
	public Schiff(String name, Schiffstyp schiffstyp) {
		this(name);
		this.schiffstyp = schiffstyp;
	}
	
	/**
	 * @param typ Schiffstyp
	 * @return	Typname
	 */
	public String umbau(Schiffstyp schiffstyp)
	{
		String antwort;
		
		antwort = this.schiffstyp + " wurde zu ";
		this.schiffstyp = schiffstyp;
		
		switch (schiffstyp) 
		{
		case SCHNIGGE:
				this.maxlad = 40;
				break;
		case KOGGE:
				this.maxlad = 100;
				break;
		case HOLK:
				this.maxlad = 150;
				break;
		case KRAWEEL:
				this.maxlad = 400;
				break;
		case KARACKE:
				this.maxlad = 600;
				break;
		case LINIENSCHIFF:
				this.maxlad = 1000;
				break;
		default:
				break;
		}
		
		antwort += this.schiffstyp;
		return antwort;
	}
	
	/**
	 * @brief Funktion zum laden von Waren
	 * @param anzahl Anzahl der Ladungsgegenstände
	 * @return	Antwortstring
	 */
	public String beladen(int anzahl) 
	{
		String antwort;
		
		if (anzahl + this.ladung <= maxlad) 
		{
			this.ladung = this.ladung + anzahl;
			antwort = "Beladung erfolgreich. Es sind noch " + (this.maxlad - this.ladung) + " Einheiten frei.";
		}
		else
		{
			antwort = "Nicht genuegend Platz";
		}
		
		return antwort;
	}

	/**
	 * @brief Ausgabefunktion
	 * @return Ausgabe
	 */
	public String ausgabe()
	{
		String antwort;
		antwort= "Name des Schiffes: " + this.name + " \nTypbezeichnung: " + this.schiffstyp + "\nZustand: " +this.zustand;
		return antwort;
	}
	
	/**
	 * Vielleicht mit Parameter um teilweises reparieren zu ermoeglichen.
	 */
	public void reparieren()
	{
		this.zustand=100;
	}
	
	public void schiffAufrüsten() throws Exception
	{
		if (this.schiffstyp.next() == null){
			throw new Exception("Das Schiff besitzt bereits die höchste Ausbaustufe ");}
		else {
			this.schiffstyp = this.schiffstyp.next();
			this.umbau(this.schiffstyp);
			System.out.println("Das Schiff wurde korrekt aufgerüstet: " + this.schiffstyp);}
	}
	

    public static void main (String[] args)
    {
    	try
    	{
		Scanner nameSchiff = new Scanner(System.in);
    	        System.out.print("Geben Sie bitte einen Schiffsnamen ein: ");
    	        String eingabe = nameSchiff.nextLine();
    	        System.out.println("Du hast " + eingabe + " eingegeben.");
    	        nameSchiff.close();
    	        
    	        // Neues Objekt Schiff anlegen
    	        Schiff test = new Schiff(eingabe);
    	       // Schiff test2 =new Schiff("");
    	        System.out.println (test.ausgabe());
    	        
    	        System.out.println(test.umbau(Schiffstyp.KARACKE));
    	        System.out.println (test.ausgabe());
    	        
    	        test.schiffAufrüsten();
    	        System.out.println (test.ausgabe());

		Schiff testAufrüsten = new Schiff("Aurelion Sol", Schiffstyp.LINIENSCHIFF);
		System.out.println(testAufrüsten.ausgabe());
		testAufrüsten.schiffAufrüsten();
    	}
    
    	catch (Exception e )
    	{
    			e.printStackTrace();
    	}
    }
}
