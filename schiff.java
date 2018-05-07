/**
 * @mainpage Hanse Kontor 
 * @details	java-Klasse zur Erzeugung und Verwaltung von Schiffen
 *
 * @file 	Schiff.java
 * @version 1.0
 * @date	2018
 * @author	Matthias Langenfeld, Bjoern Offermann
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
	private String name;
	private int zustand;
	private int ladung;
	private int typ;
	private String typname;
	private int maxlad;
	private int preis;
	
/**
 * @brief Konstruktor 
 * @param name Schiffsname
 */
	public Schiff(String name) 
	{
		this.zustand = 100;
		this.ladung = 0;
		this.typ = 0;
		this.name = name;
		this.preis=0;	
	}
	
	/**
	 * 
	 * @param typ Schiffstyp
	 * @return	Typname
	 */
	public String umbau(int typ) 
	{
		String antwort;
		this.typ = typ;
		
		switch (typ) 
		{
		case 1: this.typname = "Schnigge";
				this.maxlad = 40;
				break;
		case 2:	this.typname = "Kogge";
				this.maxlad = 100;
				break;
		case 3:	this.typname = "Holk";
				this.maxlad = 150;
				break;
		case 4:	this.typname = "Kraweel";
				this.maxlad = 400;
				break;
		case 5:	this.typname = "Karacke";
				this.maxlad = 600;
				break;
		case 6:	this.typname = "Linienschiff";
				this.maxlad = 1000;
				break;
		default:
				break;
		}
		antwort = this.name + " ist jetzt eine " + this.typname;
		
		return antwort;
	}
	

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

	public String ausgabe()
	{
		String antwort;
		antwort= "Name des Schiffes: " + this.name + " \nTypbezeichnung: " + this.typ + "\nTypname "+ this.typname + "\nZustand: " +this.zustand;
		return antwort;
	}
	
	public void reparieren()
	{
		this.zustand=100;
	}
	
	public void schiffAufrüsten()
	{
		if(this.typ < 6)
		{
			this.typ++;
			this.umbau(this.typ);
			System.out.println("Das Schiff wurde korrekt aufgerüstet: " + this.typ + " " + this.typname);
		}
		else {
			System.out.println("Das Schiff besitzt bereits die höchste Ausbaustufe ");
		}
	}
	

    public static void main (String[] args)
    {
        Scanner nameSchiff = new Scanner(System.in);
        System.out.print("Geben Sie bitte einen Schiffsnamen ein");
        String eingabe = nameSchiff.next();
        System.out.println("Du hast " + eingabe + " eingegeben.");
        nameSchiff.close();
        
    // Neues Objekt Schiff anlegen
    Schiff test = new Schiff(eingabe);
    System.out.println (test.ausgabe());
    
    test.umbau(5);
    System.out.println (test.ausgabe());
    
    test.schiffAufrüsten();
    System.out.println (test.ausgabe());
    }

}
